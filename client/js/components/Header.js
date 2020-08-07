import logo_image from "../../assets/Logo2.png";
export default function Header() {
  return `
  
  <div class="header">
  
  <div class="logo">
    <img
      class= "logo-image" 
      src="${logo_image}"
      >
  </div>
  
 <ul class ='nav-list'>
    <span class= "navigation">
      <li class='nav-list_home'>
        <h2>
          Home
        </h2>
      </li>
      <li class='nav-list_ourMission'>
        <h2>
          Our Mission
        </h2>
      </li>
    <li class='nav-list_faq'>
      <h2>
        FAQ
      </h2>
    </li>
    <li class='nav-list_bikes'>
      <h2>
        Bikes
      </h2>
    </li>
    <li class='nav-list_support'>
      <h2>   
        Support
      </h2>
      <ul>
        <li class='nav-list_donate_bike'>
        Donate Bike </li>
        <li class='nav-list_donate_money'>
        Donate Money </li>
        <li class='nav-list_volunteer'>
        Volunteer</li>
        </ul>
        </li>
  </ul
  </div>
  </span>
  `;
}
