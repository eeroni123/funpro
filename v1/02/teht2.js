let lampotilat15 = [7.5, 9.6, 13.5, 17.1, 21.7, 25.4, 31.4, 27.8, 22.0, 18.0, 14.3, 11.3];
let lampotilat16 = [6.5, 5.3, 12.8, 19.8, 27.7, 28.6, 29.1, 26.1, 23.2, 16.2, 8.5, 9.1];

const f = function () {
    return function (x, y) {
        if (x > y) {
            return 1;
        } else if (y > x) {
            return -1
        } else {
            return 0;
        }
    }
}();

function laskeLampotilat(f, arr1, arr2) {
    let laskuri = 0;
    for (let i = 0; i < arr1.length; i++) {
        if (f(arr1[i], arr2[i]) === -1) {
            laskuri++;
        }
    }
    return laskuri;
}

console.log(laskeLampotilat(f, lampotilat15, lampotilat16)); // outputs 4