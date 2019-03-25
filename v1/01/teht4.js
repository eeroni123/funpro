function potenssi(luku, potenssiarvo) {
    if (potenssiarvo === 0) {
        return 1;
    } else {
        return luku * potenssi(luku, potenssiarvo - 1);
    }
}

console.log(potenssi(2, 4));
