const Immutable = require('immutable');

const auto = Immutable.Map({
    matkamittari: 0,
    tankki: 10
});

console.log(auto.get("matkamittari"));
console.log(auto.get("tankki"));
auto.set("matkamittari", 100);
console.log(auto.get("matkamittari"));