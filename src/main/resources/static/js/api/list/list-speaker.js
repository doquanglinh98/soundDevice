const API_URL = "https://tscproaudio.com/manager";

document.addEventListener("DOMContentLoaded", function () {
  const listProduct = document.querySelector(".listAllSpeaker");
  const pagination = document.getElementById("list-pagination");
  const loadingMessage = document.querySelector(".loading-message");

  let currentPage = 1;
  const productsPerPage = 15;

  function fetchListProduct(page) {
    loadingMessage.style.display = "block";
    fetch(
      `${API_URL}/n9-speaker-series/all?page=${
        page - 1
      }&size=${productsPerPage}`
    )
      .then((res) => res.json())
      .then((data) => {
        loadingMessage.style.display = "none";
        listProduct.innerHTML = "";

        if (data.content.length === 0) {
          listProduct.innerHTML =
            '<div class="text-center fs-2 d-flex justify-content-center align-items-center" style="height:300px"><div>No data</div><img width="100" height="100" src="https://tscproaudio.com/images/svg/box.svg" alt="box-icon" /></div>';
          pagination.style.display = "none";
          return;
        }

        const listSpeaker = data.content;
        const totalProducts = data.total;

        listSpeaker.forEach((product) => {
          const list = `
                <div class="col-12 col-md-6 col-lg-4 col-xl-4 product-col">
                      <div class="item_product_main">
                          <div class="variants wishItem">
                              <div class="product-thumbnail">
                                  <a class="product_overlay"
                                      href="https://tscproaudio.com/detail/speaker/${product.id}"
                                      title="${product.n9SpeakerSeriesName}"></a>
                                  <a class="image_thumb" href="https://tscproaudio.com/detail/speaker/${product.id}"
                                      title="${product.n9SpeakerSeriesName}" >
                                      <img class="lazyload image-speaker" width="200" height="200"
                                          src="${product.imgId}"
                                          alt="${product.n9SpeakerSeriesName}">
                                  </a>
  
                              </div>
                              <div class="product-info">
                                  <h3 class="product-name">
                                      <a
                                          href="https://tscproaudio.com/detail/speaker/${product.id}"
                                          title="${product.n9SpeakerSeriesName}">
                                          ${product.n9SpeakerSeriesName}
                                      </a>
                                  </h3>
                              </div>
                          </div>
                      </div>
                </div>
                  `;
          listProduct.insertAdjacentHTML("beforeend", list);
        });
        const totalPages = Math.ceil(totalProducts / productsPerPage);
        displayPagination(totalPages, page);
      })
      .catch((error) => console.log("Error fetching products:", error));
  }

  function displayPagination(totalPages, currentPage) {
    if (totalPages <= 1) {
      pagination.style.display = "none";
      return;
    } else {
      pagination.style.display = "block";
    }

    pagination.innerHTML = "";

    const prevButton = document.createElement("button");
    prevButton.textContent = "Previous";
    prevButton.classList.add("page-btn");
    prevButton.disabled = currentPage === 1;
    prevButton.addEventListener("click", () => {
      if (currentPage > 1) fetchListProduct(currentPage - 1);
    });
    pagination.appendChild(prevButton);

    for (let i = 1; i <= totalPages; i++) {
      const pageButton = document.createElement("button");
      pageButton.textContent = i;
      pageButton.classList.add("page-btn");
      if (i === currentPage) {
        pageButton.classList.add("active");
      }
      pageButton.addEventListener("click", () => fetchListProduct(i));
      pagination.appendChild(pageButton);
    }

    const nextButton = document.createElement("button");
    nextButton.textContent = "Next";
    nextButton.classList.add("page-btn");
    nextButton.disabled = currentPage === totalPages;
    nextButton.addEventListener("click", () => {
      if (currentPage < totalPages) fetchListProduct(currentPage + 1);
    });
    pagination.appendChild(nextButton);
  }

  fetchListProduct(currentPage);
});
