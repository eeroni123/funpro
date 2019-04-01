const Immutable = require('immutable');

const set1 = Immutable.Set(['punainen', 'vihreä', 'keltainen']);
const set2 = set1.add('ruskea');
const set3 = set2.add('ruskea');

console.log(set1);
console.log(set2);
console.log(set3);

console.log(set1 === set2);  // outputs: false
console.log(set2 === set3); // outputs: true, verrataan arvoina. Seteillä on samat arvot.