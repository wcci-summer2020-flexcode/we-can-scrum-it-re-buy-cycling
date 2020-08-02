import body_image from "../../assets/body.jpg";
import projectfitamerica from "../../assets/pfa-banner.jpg";
import oac from "../../assets/oac.png";
import unitedway from "../../assets/unitedway.jpg";

export default function navResults() {
    return `
    
    
    <h1>Thank you!</h1>
    <p> We have received your information and we will contact you as soon as possible! </p><br>
    <p> We appreciate you taking the time to actively support our organization.  In the meantime, please reach out to other organizations and sponsors that we receive support from.</p>
    <div class="container">
    <br>
  
    <a href="http://www.projectfitamerica.org/index.html">
<img class="page-image" alt="pfa" src="${projectfitamerica}" width="100" height="100">
</a>
<br><br>
<a href="https://www.ohioathletics.com/">
<img class="page-image" alt="oac" src="${oac}" width="100" height="100">
</a>
<br><br>
<p id="unitedway">United Way<br>
<a href="https://www.unitedway.org/">
<img class="page-image" alt="oac" src="${unitedway}" width="100" height="100">
</a>
   </p> 

    `;


}


