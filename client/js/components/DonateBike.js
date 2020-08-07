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
          <div class="form-control">
          <label for="username">Username</label>
          <input type="text" id="username" placeholder="Enter username" />
        
        </div>
        <div class="form-control">
          <label for="email">Email Address</label>
          <input type="text" id="email" placeholder="Enter email" />
         
        </div>
        <div class="form-control">
          <label for="password">Password</label>
          <input type="password" id="password" placeholder="Enter password" />
        
        </div>
        <div class="form-control">
          <label for="password2">Confirm Password</label>
          <input
            type="password"
            id="password2"
            placeholder="Enter password again"


          </div>

          <button class="donate-bike-button" id="myBtn"> Donate Now</button>
            
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
