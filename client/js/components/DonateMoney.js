export default function navDonateMoney() {
    return `
    <div class="donateMoney_Title">
    
    </div>
	<div class="donation-container">
    <div class="volunteer-title">
    </div>
    <div class="donate-main">
        <form name="donation form" id="donate_frm" action="#">
            <span class="donation-options">
                <button class="amount-button_thirty" id="thirty" value="30"> $30</button>
                <button class="amount-button_fifty" id="fifty" value="50"> $50</button>
                <button class="amount-button_hundred" id="hundred" value="100"> $100 </button> 
                <span class="amount-other">Other<input class="custom" type="text" name="amount" id="custom"></span>
                <p id="support" class="support"></p>
            </span>
            <div id="personal-info" class="personal-info">
               
                <label class="personal-info_label">First Name</label>
                <input class="firstname" type="text" name="first_name" id="firstName"><br>
                <label class="personal-info_label">Last Name</label>
                <input class="lastname" type="text" name="last_name" id="lastName"><br>
                <label class="personal-info_label">Address</label>
                <input class="address" type="text" name="address" id="address"><br>
                <label class="personal-info_label">City</label>
                <input class="city" type="text" name="city" id="city"><br>
                <label class="personal-info_label">Zip</label>
                <input class="zip" type="text" name="zip" id="zip"><br>
                <label class="personal-info_label">Phone</label>
                <input class="phone" type="text" name="phone" id="phone"><br>
                <label class="personal-info_label">Email</label>
				<input class="email" type="text" name="email" id="email"><br>
				

            </div>

			<button class="donate-button" id="myBtn"> Donate Now</button>
            
		    <div id="myModal" class="modal">
			<div class="modal-content">
				<span class="close">&times;</span>
				<p id="confirmation"></p>
			</div>

        </form>

    </div>

   
	</div>

	<script src="./js/DonationForm.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script src="https://raw.githubusercontent.com/jerryluk/jquery.autogrow/master/jquery.autogrow-min.js"></script>
     `;
}
