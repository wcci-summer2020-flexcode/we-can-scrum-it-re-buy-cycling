import body_image from "../../assets/body.jpg";
export default function navDonateBike() {
  return `
  <div class="donateMoney_Title">
    
  </div>
<div class="donation-container">
  <div class="volunteer-title">
  </div>
  <div class="donate-main">
      <form name="donation form" id="donate_frm" action="#">
          
          <div id="personal-info" class="personal-info">
             
              <label class="personal-info_label">User Name</label>
              <input class="username" type="text" name="first_name" id="username"><br>
              <label class="personal-info_label">Email Address</label>
              <input class="email" type="text" name="last_name" id="email"><br>
              <label class="personal-info_label">Password</label>
              <input class="password" type="text" name="password" id="password"><br>
              <label class="personal-info_label">Confirm Password</label>
              <input class="password2" type="text" name="password2" id="password2"><br>


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