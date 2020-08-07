import body_image from "../../assets/body.jpg";
export default function navVolunteer() {
  return `

  <div class="volunteer_Title">
    
  </div>

<div class="main">
<form id="volunteer">
<div class="form-div">


<label class="label">First Name</label>
<input class="name" type="text" name="first_name"><br>
<label class="label">Last Name</label>
<input class="name" type="text" name="last_name"><br>
<label class="label">Address</label>
<input class="name" type="text" name="address"><br>
<label class="label">City</label>
<input class="name" type="text" name="city"><br>
<label class="label">Zip</label>
<input class="name" type="text" name="zip"><br>
<label class="label">Phone</label>
<input class="name" type="text" name="phone"><br>
<label class="label">Email</label>
<input class="name" type="text" name="email"><br>
<label class="label">Employer</label>
<input class="name" type="text" name="employer"><br>
<label class="label">Position</label>
<input class="name" type="text" name="position"><br>
<div id="weekdays">
<p class="days">Days Available</p>
<input type="checkbox" id="weekday" name="monday" value="Monday">
<label id="weekday"> Monday</label>
<input type="checkbox" id="weekday" name="tuesday" value="tuesday">
<label id="weekday">Tuesday</label>
<input type="checkbox" id="weekday" name="wednesday" value="wednesday">
<label id="weekday">Wednesday</label>
<input type="checkbox" id="weekday"
name="thursday" value="thursday"> 
<label id="weekday">Thursday</label>
<input type="checkbox"  name="friday" value="friday">
<label id="weekday">Friday</label><br>
<p>Time Availability</p>
<textarea rows="5" cols="50" name="description">
Provide details on hours available</textarea><br>
<input class="volunteer-btn" type="submit" id="submit" value="SUBMIT" /><br><br>

  </div>
</div>
</div>
</div>
</form>
</div>




  `;
}

