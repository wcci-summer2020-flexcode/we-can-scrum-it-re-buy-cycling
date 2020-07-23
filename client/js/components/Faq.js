export default function faq() {
  return `
    <h1>Frequently Asked Questions</h1>
   
    <div class ="accordion_menu">
    
      <button class="accordion">How old does my child need to be to participate in this program?</button>
        <div class="panel">
          <p class="faq_p">Children in the program must be between the ages of 2 and 14 at the time of the exchange.</p>
        </div>

      <button class="accordion">Can adults participate in this program?</button>
        <div class="panel">
          <p class="faq_p">Currently, the program is only available for children between the ages of 2 and 14.</p>
        </div>

      <button class="accordion">Is this program available in my community?</button>
        <div class="panel">
          <p class="faq_p">This program is only open to residents of Cleveland and Columbus, OH. </p>
        </div>

        <button class="accordion">Can I participate in the program if I don’t have a bike to trade in?</button>
        <div class="panel">
          <p class="faq_p">Yes. In place of trading a bike in, residents can make a small donation (ranging between $20 - $75) in exchange for their first bike from 
          existing inventory.  </p>
        </div>

      <button class="accordion">Can I donate a bike to the program without taking one in exchange?</button>
        <div class="panel">
          <p class="faq_p">Yes. We welcome donations of new and gently used bikes. Please visit the Donate a Bike section for more details. Monetary 
          donations can also be made in the <a href=".nav-list_donate_money">Donate Now</a> section.</p>
        </div>

        <button class="accordion">Are helmets and accessories included with each bike?</button>
        <div class="panel">
          <p class="faq_p">Thanks to the support of our generous partners at Chicks Sporting Goods, each child in the program will receive a new helmet at exchange. At this time, this program does not offer additional accessories, trailers or tag along bikes.</p>
        </div>

      <button class="accordion">What types of children’s bikes are acceptable for the exchange program?</button>
        <div class="panel">
          <p class="faq_p">We accept any size and style of bike for the program. In order to be eligible, bikes must be in “good” condition meeting the following criteria. </p>
          <ul>
          <li class="faq_p_li">Clean.</li>
          <li class="faq_p_li">Paint may have minor scratches but otherwise good looking.</li>
          <li class="faq_p_li">Original accessories are mostly present and in good condition (streamers, fenders, basket, pads).</li>
          <li class="faq_p_li">May have a little rust in bolt heads but none on chain or elsewhere.</li>
          <li class="faq_p_li">Tire wear less than 50%.</li>
          <li class="faq_p_li">Grips are intact, may not look new but not torn or worn significantly.</li>
          <li class="faq_p_li">12” or 16” bikes have training wheels in good condition (not bent and tires roll smoothly)</li>
          <li class="faq_p_li">If geared, derailleurs are free of any damage and fully functional</li>
          <li class="faq_p_li">If rim brake: rim and brake pads have over 50% life left</li>
          </ul>
        </div>
    </div>
   `;
}
