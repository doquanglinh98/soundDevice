const API_URL = "https://tscproaudio.com/manager";

const path = window.location.pathname;
const amplifierId = path.split("/").pop();
const getNumberId = parseInt(amplifierId);

const basicAuth = localStorage.getItem("basicAuth");

document.addEventListener("DOMContentLoaded", function () {
  function productDetails() {
    fetch(`${API_URL}/ampli/${amplifierId}`)
      .then((response) => response.json())
      .then((product) => {
        document.getElementById("imgId").value = product.imgId || "";
        document.getElementById("description").value =
          product.description || "";
        document.getElementById("model").value = product.model || "";
        document.getElementById("stereoPower8OHM").value =
          product.stereoPower8OHM || "";
        document.getElementById("stereoPower4OHM").value =
          product.stereoPower4OHM || "";
        document.getElementById("stereoPower2OHM").value =
          product.stereoPower2OHM || "";
        document.getElementById("btl8OHM").value = product.btl8OHM || "";
        document.getElementById("btl4OHM").value = product.btl4OHM || "";
        document.getElementById("frequencyResponse").value =
          product.frequencyResponse || "";
        document.getElementById("thdPlus").value = product.thdPlus || "";
        document.getElementById("sSourceNRatio").value =
          product.sSourceNRatio || "";
        document.getElementById("slewRatio").value = product.slewRatio || "";
        document.getElementById("dampingFactor").value =
          product.dampingFactor || "";
        document.getElementById("crossTalk").value = product.crossTalk || "";
        document.getElementById("inputImpedance").value =
          product.inputImpedance || "";
        document.getElementById("inputSensitivity").value =
          product.inputSensitivity || "";
        document.getElementById("gWeight").value = product.gWeight || "";
        document.getElementById("dimension").value = product.dimension || "";
        document.getElementById("packingSize").value =
          product.packingSize || "";
        document.getElementById("protectPowerAmplifier").value =
          product.protectPowerAmplifier || "";
        document.getElementById("outputCircuitry").value =
          product.outputCircuitry || "";
        document.getElementById("gain").value = product.gain || "";
        document.getElementById("optionalGian").value =
          product.optionalGian || "";
        document.getElementById("degreeOfSeparation").value =
          product.degreeOfSeparation || "";
        document.getElementById("dissipateHeat").value =
          product.dissipateHeat || "";
        document.getElementById("appearanceVolume").value =
          product.appearanceVolume || "";
        window.editorInstance.setData(product.other);
      })
      .catch((error) => {
        console.error("Error fetching product details:", error);
      });
  }
  productDetails();

  const submitButton = document.querySelector(".btn-submit-form");

  const editForm = document.getElementById("edit-amplifier-form");
  if (editForm) {
    editForm.addEventListener("submit", function (event) {
      event.preventDefault();
      const editorContent = window.editorInstance.getData();

      submitButton.disabled = true;
      submitButton.textContent = "Updating...";

      const formData = new FormData(editForm);
      const data = {};
      formData.forEach((value, key) => {
        data[key] = value;
      });
      data.id = getNumberId;
      data.other = editorContent;

      fetch(`${API_URL}/ampli/edit`, {
        method: "PUT",
        headers: {
          Authorization: basicAuth,
          "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
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
  }
});
