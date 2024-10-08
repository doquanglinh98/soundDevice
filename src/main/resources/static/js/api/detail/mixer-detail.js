const API_URL = "https://tscproaudio.com/manager";

document.addEventListener("DOMContentLoaded", function () {
  const path = window.location.pathname;
  const productId = path.split("/").pop();

  function getProductDetails() {
    fetch(`${API_URL}/mixer/${productId}`)
      .then((response) => response.json())
      .then((product) => {
        const catalogueProduct = document.querySelector(
          ".product-tab-catalogue"
        );
        const titleProduct = document.querySelector(".title-product");
        const imageProduct = document.querySelector(".picture-product");
        const breadCrumb = document.querySelector(".bread-crumb-name");
        const detail = document.querySelector(".product_getcontent");
        detail.innerHTML = `
        <p>${product.description || `No description`}</p>
        `;

        breadCrumb.innerHTML = `
          <strong><span>${product.modelMixer}</span></strong>
          `;

        if (product) {
          titleProduct.innerHTML = `
                 <h1>${product.modelMixer}</h1>
                `;
          imageProduct.innerHTML = `
                <img
                  height="540"
                  width="540"
                  src="${product.imgId}"
                  alt="${product.modelMixer}"
                  class="img-responsive mx-auto d-block"
                />
                `;
          let detailCatalogue = "";

          const fields = [
            { label: "Channel", value: product.channel },
            { label: "Channel EQ", value: product.channelEQ },
            { label: "AUX", value: product.AUX },
            { label: "Return", value: product.returnMixer },
            { label: "Effects", value: product.effects },
            { label: "Main Out", value: product.mainOut },
            { label: "Groups", value: product.groupsMixer },
            { label: "Phantom Power", value: product.phantomPower },
            { label: "USB Player", value: product.usbPlayer },
            { label: "Other", value: product.other },
          ];

          fields.forEach((field) => {
            if (field.value) {
              detailCatalogue += `
                  <p class="text-capitalize m-0 p-0">
                    <span class="fw-semibold">${field.label}</span> : <span>${field.value}</span>
                  </p>
                `;
            }
          });

          catalogueProduct.innerHTML = detailCatalogue;
        }
      })
      .catch((error) => {
        console.error("Error fetching product details:", error);
      });
  }

  getProductDetails();
});
