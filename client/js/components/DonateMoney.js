export default function navDonateMoney() {
	return `
    <div class="donation-container">
            
            <div class="donation-box">
	            <div class="title">Donation Information</div>
	            
	            <div class="fields">
		            <input type="text" id="firstName" placeholder="First Name"> </input>
		            <input type="text" id="lastName" placeholder="Last Name"> </input>
		            <input type="text" id="email" placeholder="Email"> </input>
	            </div>
	            
	            <div class="amount">
		            <div class="button">$30</div>
		            <div class="button">$50</div>
		            <div class="button">$100</div>
		            <div class="button">$<input type="text" class="set-amount" placeholder=""> </input></div>
	            </div>
	            
	            <div class="switch">
					<input type="radio" class="switch-input" name="view" value="One-Time" id="one-time" checked="">
					<label for="one-time" class="switch-label switch-label-off">One-Time</label>
					<input type="radio" class="switch-input" name="view" value="Monthly" id="monthly">
					<label for="monthly" class="switch-label switch-label-on">Monthly</label>
					<span class="switch-selection"></span>
			    </div>
			    
			    <div class="checkboxes">
					<input type="checkbox" id="receipt" class="checkbox" />
					<label for="receipt">Email Me A Receipt</label>
					<br />
					<input type="checkbox" id="anon" class="checkbox" />
					<label for="anon">Give Anonymously</label>
					<br />
					<input type="checkbox" id="list" class="checkbox" />
					<label for="list">Keep me Updated!</label>
			    </div>
			    
			    <div class="confirm">
				    
			    </div>
	            
	            <div class="donate-button"><i class="fa fa-credit-card"></i> Donate Now</div>
            </div>
            
        </div>
<script>var firstName = "";
var lastName = "";
var email = "";
var dType = "";
var receipt = "";
var anon = "";
var list = "";
var amount = "";

$('.set-amount').autoGrow(0);


//Set & Highlight Donation Amount
$(".button").click(function () {
    $(".button").removeClass("selected");
    $(this).addClass("selected");

    $(this).find("input").focus();
});

//Grow the donation box if they type more than 4 numbers
$(".set-amount").keyup(function () {

    if (this.value != this.value.replace(/[^0-9\.]/g, '')) {
        this.value = this.value.replace(/[^0-9\.]/g, '');
    }

});


$("input").on("change", function () {
    // $(".donation-box").css("height", "500px");

    firstName = $("#firstName").val();
    lastName = $("#lastName").val();
    email = $("#email").val();

    if ($("#one-time").prop("checked")) {
        dType = "One-Time";
    }
    if ($("#monthly").prop("checked")) {
        dType = "Monthly";
    }

});</script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="https://raw.githubusercontent.com/jerryluk/jquery.autogrow/master/jquery.autogrow-min.js"></script>
     `;
}
