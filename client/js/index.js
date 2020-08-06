import { default as Header } from "./components/Header";
import { default as Footer } from "./components/Footer";
import Support from "./components/Support";
import OurMission from "./components/OurMission";
import HowItWorks from "./components/HowItWorks";
import FAQ from "./components/FAQ";
import Home from "./components/Home";
import crud from "./crud/crud";
import Bikes from "./components/Bikes";
import Bike from "./components/Bike";
import DonateMoney from "./components/DonateMoney";
import Volunteer from "./components/Volunteer";
import Results from "./components/results";
import navResults from "./components/results";

buildPage();

function buildPage() {
  header();
  navSupport();
  navOurMission();
  navFAQ();
  navHome();
  navBikes();
  navDonateMoney();

  footer();
  footerHome();
  footerOurMission();
  footerBikes();
  footerFAQ();
  footerDonateMoney();
  footerVolunteer();

  bikesLink();
  checkAlert();
  navResults();
}

function header() {
  const headerElem = document.querySelector(".header");
  headerElem.innerHTML = Header();
}

function footer() {
  const footerElem = document.querySelector(".footer");
  footerElem.innerHTML = Footer();
}

function navSupport() {
  const supportElm = document.querySelector(".nav-list_support");
  supportElm.addEventListener("click", () => {
    if (event.target.classList.contains("nav-list_faq")) {
      const app = document.querySelector("#app");
      app.innerHTML = FAQ();
    } else if (event.target.classList.contains("nav-list_donate_money")) {
      const app = document.querySelector("#app");
      app.innerHTML = DonateMoney();
    } else if (event.target.classList.contains("nav-list_volunteer")) {
      const app = document.querySelector("#app");
      app.innerHTML = Volunteer();
      app.addEventListener("click", () => {
        if (event.target.classList.contains("volunteer-btn")) {
          console.log("Hello!");
          const app = document.querySelector("#app");
          app.innerHTML = Results();
        }
      });
    }
  });
}

function navDonateMoney() {
  const supportElm = document.querySelector(".nav-list_donate_money");
  const app = document.querySelector("#app");
  supportElm.addEventListener("click", () => {
    app.innerHTML = DonateMoney();
  });

  // MODAL FUNCTIONALITY
  app.addEventListener("click", () => {
    if (event.target.classList.contains("donate-button")) {
      var modal = document.getElementById("myModal");
      var btn = document.getElementById("myBtn");
      var span = document.getElementsByClassName("close")[0];

      //FORM VARIABLES
      var donationConfirmation = document.getElementById("confirmation");
      var personFirst = document.getElementById("firstName");
      var email = document.getElementById("email");
      var donationAmount = document.getElementById("other");
      var donationThirty = document.getElementById("thirty");
      var donationFifty = document.getElementById("fifty");
      var donationHundred = document.getElementById("hundred");
      var donationOther = document.getElementById("other");

      //FUNCTIONALITY FOR MODAL BOX

      modal.style.display = "block";

      span.onclick = function () {
        modal.style.display = "none";
      };

      window.onclick = function (event) {
        if (event.target == modal) {
          modal.style.display = "none";
        }
      };

      // CONFIRMATION MESSAGE
      donationConfirmation.innerHTML =
        personFirst.value +
        ", thank you for your donation of $" +
        donationAmount.value +
        ". For tax purposes, a gift receipt has been emailed to you at " +
        email.value +
        ".";
    }
  });
}

function footerDonateMoney() {
  const supportElm = document.querySelector(".footerDonateMoney");
  const app = document.querySelector("#app");
  supportElm.addEventListener("click", () => {
    console.log("meow");
    app.innerHTML = DonateMoney();
  });
}

function footerVolunteer() {
  const supportElm = document.querySelector(".footerVolunteer");
  const app = document.querySelector("#app");
  supportElm.addEventListener("click", () => {
    console.log("meow");
    app.innerHTML = Volunteer();
  });
}

function navOurMission() {
  const ourMissionElm = document.querySelector(".nav-list_ourMission");
  ourMissionElm.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = OurMission();
  });
}

function footerOurMission() {
  const ourMissionElm2 = document.querySelector(".footerOurMission");
  ourMissionElm2.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = OurMission();
  });
}

function navFAQ() {
  const faqElm = document.querySelector(".nav-list_faq");
  const app = document.querySelector("#app");
  faqElm.addEventListener("click", () => {
    app.innerHTML = FAQ();
  });

  app.addEventListener("click", () => {
    if (event.target.classList.contains("accordion")) {
      var acc = document.getElementsByClassName("accordion");
      var i;

      for (i = 0; i < acc.length; i++) {
        event.target.classList.toggle("active");
        var panel = event.target.nextElementSibling;
        if (panel.style.maxHeight) {
          panel.style.maxHeight = null;
        } else {
          panel.style.maxHeight = panel.scrollHeight + "px";
        }
      }
    }
  });
}

function footerFAQ() {
  const faqElm = document.querySelector(".footerFAQ");
  const app = document.querySelector("#app");
  faqElm.addEventListener("click", () => {
    app.innerHTML = FAQ();
  });
}

function navHome() {
  const homeElm = document.querySelector(".nav-list_home");
  homeElm.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = Home();
  });
}

function footerHome() {
  const homeElm2 = document.querySelector(".footerHome");
  homeElm2.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = Home();
  });
}

function navBikes() {
  const bikeElm = document.querySelector(".nav-list_bikes");
  bikeElm.addEventListener("click", () => {
    const app = document.querySelector("#app");
    crud.getRequest("http://localhost:8080/api/bikes", (bikes) => {
      app.innerHTML = Bikes(bikes);
    });
    renderBikeInfo();
  });
}
function bikesLink() {
  const bikeElm2 = document.querySelector(".bikesLink");
  bikeElm2.addEventListener("click", () => {
    const app = document.querySelector("#app");
    crud.getRequest("http://localhost:8080/api/bikes", (bikes) => {
      app.innerHTML = Bikes(bikes);
    });
    renderBikeInfo();
  });
}

function footerBikes() {
  const bikeElm3 = document.querySelector(".footerBikes");
  bikeElm3.addEventListener("click", () => {
    const app = document.querySelector("#app");
    crud.getRequest("http://localhost:8080/api/bikes", (bikes) => {
      app.innerHTML = Bikes(bikes);
    });
    renderBikeInfo();
  });
}

function renderBikeInfo() {
  const app = document.querySelector("#app");
  app.addEventListener("click", () => {
    if (event.target.parentElement.classList.contains("bike_item")) {
      const bikeId = event.target.parentElement.querySelector("#bikeId").value;
      crud.getRequest(`http://localhost:8080/api/bikes/${bikeId}`, (bike) => {
        app.innerHTML = Bike(bike);
      });
    }
  });
}

function checkAlert() {
  const app = document.querySelector("#app");
  app.addEventListener("click", () => {
    let filteredBikes = [];
    if (event.target.parentElement.classList.contains("CheckBoxSection")) {
      crud.getRequest(`http://localhost:8080/api/bikes`, (bikes) => {
        // id
        const checkboxColumbus = document.querySelector("#Columbus");
        const checkboxCleveland = document.querySelector("#Cleveland");
        const checkboxMale = document.querySelector("#Male");
        const checkboxFemale = document.querySelector("#Female");
        const checkboxNeutral = document.querySelector("#Neutral");
        const checkbox1224 = document.querySelector("#Age1224");
        const checkbox24 = document.querySelector("#Age24");
        const checkbox57 = document.querySelector("#Age57");
        const checkbox811 = document.querySelector("#Age811");
        const checkbox1215 = document.querySelector("#Age1215");
        const submitButton = document.querySelector(".submit");

        submitButton.addEventListener("click", () => {
          if (
            checkboxColumbus.checked === true &&
            checkboxMale.checked === true &&
            checkbox24.checked === true
          ) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (
                bike.shop.location === "Columbus" &&
                bike.gender.genderType === "Male" &&
                bike.suggestedAge.suggestedAgeRange === "2-4 Years"
              ) {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (
            checkboxCleveland.checked === true &&
            checkboxMale.checked === true &&
            checkbox24.checked === true
          ) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (
                bike.shop.location === "Cleveland" &&
                bike.gender.genderType === "Male" &&
                bike.suggestedAge.suggestedAgeRange === "2-4 Years"
              ) {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (
            checkboxCleveland.checked === true &&
            checkboxMale.checked === true &&
            checkbox57.checked === true
          ) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (
                bike.shop.location === "Cleveland" &&
                bike.gender.genderType === "Male" &&
                bike.suggestedAge.suggestedAgeRange === "5-7 Years"
              ) {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (
            checkboxCleveland.checked === true &&
            checkboxFemale.checked === true &&
            checkbox57.checked === true
          ) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (
                bike.shop.location === "Cleveland" &&
                bike.gender.genderType === "Female" &&
                bike.suggestedAge.suggestedAgeRange === "5-7 Years"
              ) {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (checkboxCleveland.checked === true) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (bike.shop.location === "Cleveland") {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (checkboxColumbus.checked === true) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (bike.shop.location === "Columbus") {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (checkboxMale.checked === true) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (bike.gender.genderType === "Male") {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (checkboxFemale.checked === true) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (bike.gender.genderType === "Female") {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (checkbox1224.checked === true) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (bike.suggestedAge.suggestedAgeRange === "12-24 Months") {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (checkboxNeutral.checked === true) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (bike.gender.genderType === "Neutral") {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (checkbox24.checked === true) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (bike.suggestedAge.suggestedAgeRange === "2-4 Years") {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          } else if (checkbox57.checked === true) {
            filteredBikes = [];
            bikes.map((bike) => {
              // name
              if (bike.suggestedAge.suggestedAgeRange === "5-7 Years") {
                filteredBikes.push(bike);
                console.log(bike);
                app.innerHTML = Bikes(filteredBikes);
              }
            });
          }
        });
      });
    }
  });
}