function potenssi(luku, potenssiarvo) {
    if (potenssiarvo <= 0) {
        return 1;
    }
    return apu(luku, potenssiarvo, luku);
}

function apu(luku, potenssiarvo, numero) {
    if (potenssiarvo === 1) {
        return numero;
    } else {
        return apu(luku, potenssiarvo - 1, luku * numero);
    }
}

console.log(potenssi(2,4)); // outputs 16