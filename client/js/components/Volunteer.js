import body_image from "../../assets/body.jpg";
export default function navVolunteer() {
  return `


<body>

<div class="volunteer-title"><h1>Volunteer Registration</h1></div>
<div class="main">
<form>
<div id="name">


<label class="firstlabel">First Name</label>
<input class="fname" type="text" name="first_name"><br>
<label class="secondlabel">Last Name</label>
<input class="lname" type="text" name="last_name"><br>
<label class="thirdlabel">Address</label>
<input class="address" type="text" name="address"><br>
<label class="fourthlabel">City</label>
<input class="city" type="text" name="city"><br>
<label class="fifthlabel">Zip</label>
<input class="zip" type="text" name="zip"><br>
<label class="sixthlabel">Phone</label>
<input class="phone" type="text" name="phone"><br>
<label class="seventhlabel">Email</label>
<input class="email" type="text" name="email"><br>
<label class="eighthlabel">Employer</label>
<input class="employer" type="text" name="employer"><br>
<label class="ninthlabel">Position</label>
<input class="position" type="text" name="position"><br><br>
<div id="weekdays">
<p class="days">Days Available</p>
<input type="checkbox" id="monday" name="monday" value="Monday">
<label for="monday"> Monday</label>
<input type="checkbox" id="tuesday" name="tuesday" value="tuesday">
<label for="tuesday">Tuesday</label>
<input type="checkbox" id="wednesday" name="wednesday" value="wednesday">
<label for="wednesday">Wednesday</label>
<input type="checkbox" id="thursday"
name="thursday" value="thursday"> 
<label for="thursday">Thursday</label>
<input type="checkbox" id="friday" name="friday" value="friday">
<label for="friday">Friday</label><br>
<p>Time Availability</p>
<textarea rows="5" cols="50" name="description">
Provide details on hours available</textarea><br><br>
<input type="submit" id="submit" value="submit" /><br><br>
</div>
</div>
</form>
</div>
<body>

</html>





  `;

}

