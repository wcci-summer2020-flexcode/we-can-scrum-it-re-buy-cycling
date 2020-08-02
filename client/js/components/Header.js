import logo_image from "../../assets/logo_placeholder_image.png";
export default function Header() {
  return `
  
  <div class="header">
  
  

 <ul class ='nav-list'>
 <div class="logo"><img class="logo-image" src="${logo_image}" alt="child riding bike"></div>
    <li class='nav-list_home'>
        Home
    </li>
    <li class='nav-list_ourMission'>
        Our Mission
    </li>
    <li class='nav-list_howItWorks'>
        How It Works
    </li>
    <li class='nav-list_faq'>FAQ
    </li>
    <li class='nav-list_bikes'>
      Bikes
    </li>
    <li class='nav-list_support'>
       Support
      <ul>
        <li class='nav-list_faq'>
        Donate Bike </li>
        <li class='nav-list_donate_money'>
        Donate Money </li>
        <li class='nav-list_volunteer'>
        Volunteer</li>
        </ul>
        </li>
    <li class='nav-list_contact'>
            Contact Us
    </li>
  </ul
  </div>
  `;
}
