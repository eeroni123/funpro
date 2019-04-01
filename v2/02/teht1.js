function laskePisteet(kPiste, lisapisteet) {
    return function (hypynPituus) {
        let pisteet = (hypynPituus - kPiste) * lisapisteet;
        return 60 + pisteet;
    };
}

let normaaliLahti = laskePisteet(75, 2);
let suurLahti = laskePisteet(120, 1.8);
let hyppy1 = normaaliLahti(77);
let hyppy2 = suurLahti(130);
console.log("Lahden normaalimäki. Hypyn pituus: 77\nPisteet: " + hyppy1);
console.log("Lahden suurmäki. Hypyn pituus: 130\nPisteet: " + hyppy2);

let hypyt = [100, 120, 122, 121, 111, 123, 150, 102];

console.log("Hyppyjen pituudet: " + hypyt + "\nHyppyjen pisteet: " + hypyt.map(x => suurLahti(x)));
