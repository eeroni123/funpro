let lampotilat15 = [-7.5, -9.6, 13.5, 17.1, 21.7, 25.4, 31.4, 27.8, 22.0, 18.0, 14.3, -11.3];
let lampotilat16 = [-6.5, -5.3, 12.8, 19.8, 27.7, 28.6, 29.1, 26.1, 23.2, 16.2, -8.5, -9.1];

function keskiarvo(x, y) {
    return (x + y) / 2;
}

let lampotilat = lampotilat15.map((x, i) => keskiarvo(x, lampotilat16[i]));
console.log(lampotilat); // output [ -7, -7.449999999999999,13.15,18.450000000000003,24.7,27,30.25,26.950000000000003,22.6,17.1,2.9000000000000004,-10.2 ]
console.log("\n");

console.log(lampotilat.filter(x => x > 0)); // output: [ 13.15, 18.450000000000003, 24.7 ,27, 30.25, 26.950000000000003, 22.6 17.1, 2.9000000000000004 ]
console.log("\n");

let karvo = lampotilat.reduce(((total, amount, index, array) => {
    total += amount;
    if (index === array.length - 1) {
        return total / array.length;
    } else {
        return total;
    }
}));
console.log(karvo);  // output: 13.204166666666667