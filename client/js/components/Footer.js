export default function Footer() {
  return `
    
    <footer id="footer">
    <section>
    <h3>Re-Buy-Cycling</h3>
    <ul id="footer-list-sections">
        <div class ="footerHome">
            Home
        </div>
        <br>
        <div class ="footerOurMission"> Our Mission </div>
        <br>
        <div class ="footerBikes"> Bikes </div>
        <br>
        <div class ="footerFAQ"> FAQ</div>
        <br>
        <div class="footerDonateBike"> Donate Bike </div>
        <br>
        <div class ="footerDonateMoney"> Donate Money </div>
        <br>
        <div class="footerVolunteer"> Volunteer</div>
        <br><br><br><br>
        </section>
    <section><h3>Subscribe</h3><br>
    <ul class='social-list'>
    <a href="https://www.facebook.com/" 
        class="fa fa-facebook"
        target="blank"
        >  
    </a>

    <a href="https://twitter.com/" 
        class="fa fa-twitter"
        target="blank"
        >
    </a>
    <a href="https://www.instagram.com/" 
        class="fa fa-instagram"
        target="blank"
        >
    </a>
</ul>
    <form>
        <p id="subscribe">
        </p>
        <p id="join">Join our newsletter to get
        the latest information.</p>
        <input type="email" id="email" name="email">
        <button type="submit">Subscribe </button> </p>
        </form>
</section>
    <section>
    <h3>Contact Us</h3>
   
    <a href="tel:"> 1.844.932.2626</a>
    <br>
    <br>
    <a href="mailto:rebuycycling@gmail.com">rebuycycling@gmail.com </a>
    <br>
    <br>
    
    <p id="address"> 
    Columbus Store:
    <br>
    1234 Main St<br>
        Columbus, OH 43026 </p>
    
        <p id="address">
        Cleveland Store:
        <br>
        5678 Main St<br>
            Cleveland, OH 44101 </p>  
        <br><br><br>
        
        </section>

    </footer>
    `;
}
