document.addEventListener("DOMContentLoaded", function () {
  const token = localStorage.getItem("token");

  if (!token) {
    alert("Please login to access");
    window.location.href = "/admin";
  }

  function logout() {
    localStorage.removeItem("token");
    window.location.href = "/admin";
  }

  document.getElementById("logoutBtn").addEventListener("click", logout);
});
