let movies = require('./movies.js');
console.log("\nmovies before filter:\n");
console.log(movies);

let movies2 = movies.filter(x => x.release > 2011);
console.log("\nmovies after filter:\n");
console.log(movies2);