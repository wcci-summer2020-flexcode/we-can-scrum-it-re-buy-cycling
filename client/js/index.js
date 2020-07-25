import { default as Header } from "./components/Header";
import { default as Footer } from "./components/Footer";
import Contact from "./components/Contact";
import Support from "./components/Support";
import OurMission from "./components/OurMission";
import HowItWorks from "./components/HowItWorks";
import FAQ from "./components/FAQ";
import Home from "./components/Home";
import crud from './crud/crud';
import Bikes from "./components/Bikes";
import Bike from "./components/Bike";
import DonateMoney from "./components/DonateMoney";

buildPage();

function buildPage() {
  header();
  footer();
  navContact();
  navSupport();
  navOurMission();
  navHowItWorks();
  navFAQ();
  navHome();
  navBikes();
  navDonateMoney();
}

function header() {
  const headerElem = document.querySelector(".header");
  headerElem.innerHTML = Header();
}

function footer() {
  const footerElem = document.querySelector(".footer");
  footerElem.innerHTML = Footer();
}

function navContact() {
  const contactElm = document.querySelector(".nav-list_contact");
  contactElm.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = Contact();
  });
}

function navSupport() {
  const supportElm = document.querySelector(".nav-list_support");
  supportElm.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = Support();
  });
}

function navDonateMoney() {
  const supportElm = document.querySelector(".nav-list_donate_money");
  const app = document.querySelector("#app");

  supportElm.addEventListener("click", () => {
    app.innerHTML = DonateMoney();
  });

  // MODAL FUNCTIONALITY
  app.addEventListener('click', () => {
    if (event.target.classList.contains('donate-button')) {
      var modal = document.getElementById("myModal");
      var btn = document.getElementById("myBtn");
      var span = document.getElementsByClassName("close")[0];

      btn.onclick = function () {
        modal.style.display = "block";
      }

      span.onclick = function () {
        modal.style.display = "none";
      }

      window.onclick = function (event) {
        if (event.target == modal) {
          modal.style.display = "none";
        }
      }
    }
  });
}


function navOurMission() {
  const ourMissionElm = document.querySelector(".nav-list_ourMission");
  ourMissionElm.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = OurMission();
  });
}
function navHowItWorks() {
  const ourHowItWorksElm = document.querySelector(".nav-list_howItWorks");
  ourHowItWorksElm.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = HowItWorks();
  });
}

function navFAQ() {
  const faqElm = document.querySelector(".nav-list_faq");
  const app = document.querySelector("#app");

  faqElm.addEventListener("click", () => {
    app.innerHTML = FAQ();
  });

  app.addEventListener('click', () => {
    if (event.target.classList.contains('accordion')) {
      var acc = document.getElementsByClassName("accordion");
      var i;

      for (i = 0; i < acc.length; i++) {
        event.target.classList.toggle("active");
        var panel = event.target.nextElementSibling;
        if (panel.style.display === "block") {
          panel.style.display = "none";
        } else {
          panel.style.display = "block";
        }
      }
    }
  })

}

function navHome() {
  const homeElm = document.querySelector(".nav-list_home");
  homeElm.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = Home();
  });
}

function navBikes() {
  const bikeElm = document.querySelector('.nav-list_bikes');
  bikeElm.addEventListener('click', () => {
    const app = document.querySelector('#app');
    crud.getRequest('http://localhost:8080/api/bikes', bikes => {
      app.innerHTML = Bikes(bikes);
    });
    renderBikeInfo();
  });
}

function renderBikeInfo() {
  const app = document.querySelector('#app');
  app.addEventListener('click', () => {
    if (event.target.classList.contains('bikes-list_brandName')) {
      const bikeId = event.target.querySelector('#bikeId').value;
      crud.getRequest(`http://localhost:8080/api/bikes/${bikeId}`, bike => {
        app.innerHTML = Bike(bike);
      })
    }
  });

}
