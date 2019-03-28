let fs = require("fs");
let text = fs.readFileSync("./kalevala.txt").toString();
let wordArr = text.split(" ");

console.log(wordArr);

let newWordArr = wordArr
    .map(x => x.toLowerCase())
    .sort()
    .reduce(function (allWords, word) {
        if (word in allWords) {
            allWords[word]++;
        } else {
            allWords[word] = 1;
        }
        return allWords;
    }, {});

console.log(newWordArr);



