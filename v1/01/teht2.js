function syt(p, q) {
    if (q === 0) {
        return p;
    }
    return syt(q, p % q);
}

console.log(syt(15,12));


/*
Jos q on 0, palauta p.
    Muuten
selvitä rekursiivisella metodikutsulla, mikä on suurin yhteinen tekijä q:lle ja p%q:lle,
    ja
palauta sama luku, jonka rekursiivinen kutsukin palautti.
*/