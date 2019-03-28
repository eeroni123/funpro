let movies = require('./movies.js');
console.log("\nmovies before map:\n");
console.log(movies);

let movies2 = movies.map(m => (
    {
        title: m.title,
        release: m.release
    })
);

console.log("\nmovies after map:\n");
console.log(movies2);

