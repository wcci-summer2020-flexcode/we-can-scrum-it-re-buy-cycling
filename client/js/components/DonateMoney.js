export default function navDonateMoney() {
    return `
    <div class="donateMoney_Title">
    
    </div>
	<div class="donation-container">

    <div class="volunteer-title">
        <h1>Make a Donation</h1>
    </div>
    <div class="main">
        <form name="donation form" id="donate_frm" action="#">
            <div id="personal-info">
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
				<label class="personal-info_label">Donation Amount</label>
				<input class="set-amount" type="text" name="amount" id="other"><br>

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
