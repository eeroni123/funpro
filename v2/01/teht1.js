/*
function toCelsius(fahrenheit) {
    return (5/9) * (fahrenheit-32);
}
function area(radius)
{
    return Math.PI * radius * radius;
};
 */

let toCelsius = fahrenheit => (5 / 9) * (fahrenheit - 32);

let area = radius => Math.PI * radius ** 2;

console.log(toCelsius(100));
console.log(area(100));