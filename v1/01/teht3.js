function syt(p, q) {
    if (q === 0) {
        return p;
    }
    return syt(q, p % q);
}

function kjl(p, q) {
    if (syt(p, q) === 1) {
        return true;
    } else {
        return false;
    }
}

console.log(kjl(35,18)); // true
console.log(kjl(30,15)); // false