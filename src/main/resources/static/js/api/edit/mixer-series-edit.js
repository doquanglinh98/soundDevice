const API_URL = "https://tscproaudio.com/manager";

const path = window.location.pathname;
const mixerId = path.split("/").pop();
const getNumberId = parseInt(mixerId);
const basicAuth = localStorage.getItem("basicAuth");

document.addEventListener("DOMContentLoaded", function () {
  function productDetails() {
    fetch(`${API_URL}/mixer-series/${mixerId}`)
      .then((response) => response.json())
      .then((product) => {
        document.getElementById("seriesName").value = product.seriesName || "";
        document.getElementById("imgId").value = product.imgId || "";
      })
      .catch((error) => {
        console.error("Error fetching product details:", error);
      });
  }
  productDetails();

  const submitButton = document.querySelector(".btn-edit-mixer");
  const editForm = document.getElementById("edit-series-mixer");

  editForm.addEventListener("submit", function (event) {
    event.preventDefault();

    submitButton.disabled = true;
    submitButton.textContent = "Updating...";

    const formData = new FormData(editForm);
    const data = {};
    formData.forEach((value, key) => {
      data[key] = value;
    });
    data.id = getNumberId;

    fetch(`${API_URL}/mixer-series/edit`, {
      method: "PUT",
      headers: {
        Authorization: basicAuth,
        "Content-Type": "application/json",
      },
      body: JSON.stringify(formData),
    })
      .then((response) => response.json())
      .then((data) => {
        console.log("Update successful:", data);
        alert("Product updated successfully!");
        submitButton.disabled = false;
        submitButton.textContent = "Edit";
      })
      .catch((error) => {
        console.error("Error updating product:", error);
        alert("Failed to update the product.");
        submitButton.disabled = false;
        submitButton.textContent = "Edit";
      });
  });
});
