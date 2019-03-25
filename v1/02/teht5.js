'use strict';
let Moduuli = function () {
    let x;
    x = 1;
    return {
        kasvata: function () {
            return ++x;
        },
        vahenna: function () {
            return --x;
        },
    };
}();

console.log('call to g(): ' + Moduuli.vahenna()); // outputs 0
console.log('call to f(): ' + Moduuli.kasvata()); // outputs 1