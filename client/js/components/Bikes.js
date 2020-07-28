export default function Bikes(bikes) {
  return `
 
    <h1>Search Our Bikes</h1>
      <form name="CheckBoxForm"
      class ="Check"
      action="#"
      >
    
        <h2> Shops</h2>

          <label for="1">
            Columbus
          </label>
          <input type="checkbox"
            name="Columbus"
            id="Columbus"
            value="1"/>
     
            <br>

          <label for="2">
            Cleveland
          </label>
          <input type="checkbox"
            name="Cleveland"
            id="Cleveland"
            value="2">
      </div>

    
        <h2> Gender</h2>

        <label for="3">
            Male
        </label>
        <input type="checkbox"
            name="Male"
            id="Male"
            value="3">
     
            <br>

        <label for="4">
            Female
        </label>
        <input type="checkbox"
            name="Female"
            id="Female"
            value="4">

            <br>

        <label for="5">
            Neutral
        </label>
        <input type="checkbox"
            name="Neutral"
            id="Neutral"
            value="5">
      </div>

     
        <h2> Suggested Age Range</h2>
        <label for="6">
            12-24 Months
        </label>
        <input type="checkbox"
            name="12-24 Months"
            id="Months12-24"
            value="6">

            <br>

        <label for="7">
            Age 2-4
        </label>
        <input type="checkbox"
            name="Age 2-4"
            id="Age 2-4"
            value="7">

            <br>

        <label for="8">
            Age 5-7
          </label>
          <input type="checkbox"
            name="Age 5-7"
            id="Age 5-7"
            value="8">

            <br>

        <label for="9">
          Age 8-11
        </label>
        <input type="checkbox"
          name="Age 8-11"
          id="Age 8-11"
          value="9">

          <br>

        <label for="10">
          Age 12-15
        </label>
        <input type="checkbox"
          name="Age 12-15"
          id="Age 12-15"
          value="10">
      </div>
      </form>
      <br>
      
        <ul class = "bikes-list">
        ${bikes
      .map((bike) => {
        return `
        <li class="bike_item"> 
      
        
        <input type = "hidden" id="bikeId" value="${bike.id}">
        <img class = "bike_image" src="${bike.imageUrl}"/>
        <p class="bikes-list_brandName">${bike.brandName} </p>
        
        </li> 
        `;
      })
      .join("")}
    </ul>
    `;
}