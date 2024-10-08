const API_URL = "https://tscproaudio.com/manager";

document.addEventListener("DOMContentLoaded", function () {
  const path = window.location.pathname;
  const productId = path.split("/").pop();

  function getProductDetails() {
    fetch(`${API_URL}/ampli/${productId}`)
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
        <strong><span>${product.model}</span></strong>
        `;

        if (product) {
          titleProduct.innerHTML = `
             <h1>${product.model}</h1>
            `;
          imageProduct.innerHTML = `
            <img
              height="540"
              width="540"
              src="${product.imgId}"
              alt="${product.model}"
              class="img-responsive mx-auto d-block"
            />
            `;
          let detailCatalogue = "";

          const fields = [
            { label: "Stereo Power 8 &#8486;", value: product.stereoPower8OHM },
            { label: "Stereo Power 4 &#8486;", value: product.stereoPower4OHM },
            { label: "Stereo Power 2 &#8486;", value: product.stereoPower2OHM },
            { label: "BTL 8 &#8486;", value: product.btl4OHM },
            { label: "BTL 4 &#8486;", value: product.btl8OHM },
            { label: "Frequency Response", value: product.frequencyResponse },
            { label: "THD+N", value: product.thdPlus },
            { label: "Slew Ratio", value: product.frequencyResponse },
            { label: "S/N Ratio", value: product.sSourceNRatio },
            { label: "Damping Factor", value: product.dampingFactor },
            { label: "Output Circuitry", value: product.outputCircuitry },
            { label: "Crosstalk", value: product.crossTalk },
            { label: "Input Impedance", value: product.inputImpedance },
            { label: "Input Sensitivity", value: product.inputSensitivity },
            { label: "Protect", value: product.protectPowerAmplifier },
            { label: "G Weight", value: product.gWeight },
            { label: "Dimension", value: product.dimension },
            { label: "Packing Size", value: product.packingSize },
            { label: "Gain", value: product.gain },
            { label: "Optional Gain", value: product.optionalGian },
            {
              label: "Degree of Separation",
              value: product.degreeOfSeparation,
            },
            { label: "Dissipate Heat", value: product.dissipateHeat },
            { label: "Appearance Volume", value: product.appearanceVolume },
          ];

          fields.forEach((field) => {
            if (field.value) {
              detailCatalogue += `
                <p class="text-capitalize m-0 p-0">
                  <span class="fw-bold">${field.label}</span> : <span>${field.value}</span>
                </p>
              `;
            }
          });
          
          if(product.other){
            detailCatalogue += `
                <p class="text-capitalize m-0 p-0">
                  ${product.other}
                </p>
              `;
          }

          catalogueProduct.innerHTML = detailCatalogue;
        }
      })
      .catch((error) => {
        console.error("Error fetching product details:", error);
      });
  }

  getProductDetails();
});
