document.addEventListener("DOMContentLoaded", function () {
  const menuHeader = document.querySelector(".menu-header");
  const menuFooter = document.querySelector(".menu-footer");
  function fetchListProduct() {
    fetch(`https://tscproaudio.com/manager/count/product`)
      .then((res) => res.json())
      .then((data) => {
        if (data.map.microTsc > 0) {
          const microItemHeader = document.createElement("li");
          microItemHeader.classList.add("level1");

          microItemHeader.innerHTML = `
              <a
                class="text-decoration-none"
                href="/list/micro"
                title="Micro"
              >Micro</a>
            `;
          menuHeader.appendChild(microItemHeader);

          const microItemFooter = document.createElement("li");
          microItemFooter.classList.add("li_menu");

          microItemFooter.innerHTML = `
              <a
                class="text-decoration-none"
                href="/list/micro"
                title="Micro"
              >Micro</a>
            `;
          menuFooter.appendChild(microItemFooter);
        }
      })
      .catch((error) => console.log("Error fetching products:", error));
  }

  fetchListProduct();
});
