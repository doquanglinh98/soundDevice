const API_URL = "https://tscproaudio.com/manager";

const path = window.location.pathname;
const pathSegments = path.split("/");
const series = decodeURIComponent(pathSegments[pathSegments.length - 1]);
let seriesName = series;
if (seriesName.toLowerCase().includes("series")) {
  seriesName = seriesName.replace(/series/i, "").trim();
}
seriesName = seriesName.split(" ")[0];

document.addEventListener("DOMContentLoaded", function () {
  const listProduct = document.querySelector(".list-series-micro");
  const loadingMessage = document.querySelector(".loading-message");
  const collectionTitle = document.querySelector(".collectiontitle");
  collectionTitle.innerHTML = `Product of ${series}`;

  function fetchListProduct() {
    loadingMessage.style.display = "block";
    fetch(`${API_URL}/micro/find-by-keyword/${seriesName}`)
      .then((res) => res.json())
      .then((data) => {
        loadingMessage.style.display = "none";
        listProduct.innerHTML = "";

        if (data.length === 0) {
          listProduct.innerHTML =
            '<div class="text-center fs-2 d-flex justify-content-center align-items-center" style="height:300px"><div>No data</div><img width="100" height="100" src="https://tscproaudio.com/images/svg/box.svg" alt="box-icon" /></div>';
          return;
        }
        data.forEach((product) => {
          const list = `
                <div class="col-12 col-md-4 col-lg-4 col-xl-4 product-col">
                      <div class="item_product_main">
                          <div class="variants wishItem">
                              <div class="product-thumbnail">
                                  <a class="product_overlay"
                                      href="https://tscproaudio.com/detail/micro/${product.id}"
                                      title="${product.microName}"></a>
                                  <a class="image_thumb" href="https://tscproaudio.com/detail/micro/${product.id}"
                                      title="${product.microName}">
                                      <img class="lazyload" width="200" height="200"
                                          src="${product.imgId}"
                                          alt="${product.microName}">
                                  </a>
                              </div>
                              <div class="product-info">
                                  <h3 class="product-name">
                                      <a
                                          href="https://tscproaudio.com/detail/micro/${product.id}"
                                          title=" ${product.microName}">
                                          ${product.microName}
                                      </a>
                                  </h3>
                              </div>
                          </div>
                      </div>
                </div>
                  `;
          listProduct.insertAdjacentHTML("beforeend", list);
        });
      })
      .catch((error) => console.log("Error fetching products:", error));
  }

  fetchListProduct();
});
