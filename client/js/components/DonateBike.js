export default function navDonateBike() {
  return `
  <div class="donateBike_Title">
    
  </div>
<div class="donation-container">
  <div class="volunteer-title">
  </div>
  <div class="donate-main">
      <form name="donation form" id="donate_frm" action="#">
          
          <div id="personal-info" class="personal-info"> 
          
          <label class="personal-info_label">Username</label>
          <input class="username" type="text" name="user_name" id="username" placeholder="Enter username"><br>
          
          <label class="personal-info_label">Email Address</label>
          <input class="emailAddress" type="text" name="email_address" id="emailAddress" placeholder="Enter email address"><br>      

          <label class="personal-info_label">Password</label>
          <input class="password" type="text" name="password" id="password" placeholder="Enter password"><br> 


          <label class="personal-info_label">Confirm Password</label>
          <input class="confirmPassword" type="text" name="confirm_password" id="confirmPassword" placeholder="Confirm password"><br> 


          </div>

          <button class="donate-bike-button" id="donate-bike-button"> Donate Now</button>
            
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
