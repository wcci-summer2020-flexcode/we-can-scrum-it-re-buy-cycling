export default function Bike(bike) {
    return `
    <h1>
    ${bike.brandName}
    </h1>
    

    <h3>
    Shop Location:
    ${bike.shop.location}
    </h3>

    <h3>
    Current Status:
    ${bike.currentStatus}
    </h3>
    
    <img src="${bike.imageUrl}"/>
    
    <h3>
    Bicycle Type:
    ${bike.bicycleType}
    </h3>

    <h3>
    Bicycle Gender:
    ${bike.gender.genderType}
    </h3>

    <h3>
    Wheel Size:
    ${bike.wheelSize}
    </h3>

    <h3>
    Suggested Age:
    ${bike.suggestedAge.suggestedAgeRange}
    </h3>

    <h3>
    Buy In Price: 
    ${bike.buyInPrice}
    </h3>

    <h3>
    Donated By:
    ${bike.donatedBy}
    </h3>
   
    `;
}