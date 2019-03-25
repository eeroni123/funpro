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


console.log(f(3, 5)); // outputs -1
console.log(f(5, 3)); // outputs 1
console.log(f(3, 3)); // outputs 0
