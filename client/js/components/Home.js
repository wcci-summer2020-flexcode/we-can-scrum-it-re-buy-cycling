import letsmove from "../../assets/sponsors/lets-move-converted.png";
import ODH from "../../assets/sponsors/ODH+logo.png";
import careSource from "../../assets/sponsors/caresource.png";
import huntington from "../../assets/sponsors/Huntington Logo.png";
import unitedWay from "../../assets/sponsors/United-Way-Logo.png";
import dicks from "../../assets/sponsors/dicks.png";
import huffy from "../../assets/sponsors/Huffybicycleslogo.png";
import chase from "../../assets/sponsors/chase.png";
import medicalMutual from "../../assets/sponsors/medical-mutual-logo.png";

export default function home() {
  return `
  <header class="header"></header>
  <div id="app">
    <div class="index_title">
    </div>
    
    <div class="howItWorks">
      <span class="donateABikeLink">

      </span>
      <span class="bikesLink">

      </span>
    </div>
    <div class="sponsors">
      <h2> Thank you to our sponsors!</h2>
      <br>
      <br>
      <br>
      <div class="sponsors_scroll"></div>
      <a href="https://letsmove.obamawhitehouse.archives.gov/" target="_blank"><img class="sponsor_logo"
      src="${letsmove}"  /></a>
      <a href="https://odh.ohio.gov/wps/portal/gov/odh/home" target="_blank"><img class="sponsor_logo"
          src="${ODH}" /></a>
      <!-- <a href="https://www.caresource.com/" target="_blank"><img class="sponsor_logo"
          src="${careSource}" /></a> -->
      <a href="https://www.huntington.com/" target="_blank"><img class="sponsor_logo"
          src="${huntington}" /></a>
      <a href="https://www.unitedwaycleveland.org/" target="_blank"><img class="sponsor_logo"
          src="${unitedWay}" /></a>
      <a href="https://www.dickssportinggoods.com/" target="_blank"><img class="sponsor_logo"
          src="${dicks}" /></a>
      <a href="https://https://www.huffybikes.com/" target="_blank"><img class="sponsor_logo"
          src="${huffy}" /></a>
      <a href="https://www.chase.com/" target="_blank"><img class="sponsor_logo" src="${chase}" /></a>
      <a href="https://www.medmutual.com/" target="_blank"><img class="sponsor_logo"
          src="${medicalMutual}" /></a>

    </div>
  </div>
    <footer class="footer"></footer>
  </div>
  
  <script src="./js/index.js"></script>

   `;
}
