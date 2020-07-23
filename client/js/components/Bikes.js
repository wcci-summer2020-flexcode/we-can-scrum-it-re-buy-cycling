export default function Bikes(bikes) {
  return `
    <h1>Bikes</h1>
    <ul class = "bikes-list">
    ${bikes
      .map((bike) => {
        return `
        <li class="bikes-list_brandName">${bike.brandName}
          <input type = "hidden" id="bikeId" value="${bike.id}">
          </li>
        `;
      })
      .join("")}
    </ul>
    `;
}
