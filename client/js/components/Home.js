import home_image from "../../assets/boy_on_bike_path.jpg";
export default function home() {
  return `
    
    <img class="home-image" src="${home_image}" alt="child riding bike">
    <article>
    <h1 class="home-header">Re-Buy-Cycle</h1>
    <h2 class="home-subhead">Children's Bicycle Trade-Up Program</h2> 
    <p class="intro_paragraph">We know that kids grow fast, but it's easy to keep them on a high-quality bike 
    with the new Re-Buy-Cycle program. In exchange for the donation of a gently used bike or a small monetary donation,  
    we will help you ensure that your child always has an awesome, safe bike to ride as they mature. When it's 
    time to move to a bigger size, just bring that bike back to any location and we will exchange it for a larger kid’s bike - free!</p>
    </article>
   `;
}
