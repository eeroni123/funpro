function onPalindromi(merkkijono) {
    if (merkkijono.length === 0 || merkkijono.length === 1) {
        return true;
    } else if (merkkijono.charAt(0) !== merkkijono.charAt(merkkijono.length - 1)) {
        return false;
    } else {
        let merkkijono2 = merkkijono.slice(1, -1);
        console.log(merkkijono2);
        onPalindromi(merkkijono2);
        return true;
    }
}

console.log(onPalindromi("saippuakauppias")); // true
console.log(onPalindromi("eipalidromi"));  // false

/*Jos merkkijonon pituus on 0 tai 1, palauta true.
    Muuten jos merkkijonon ensimmäinen ja viimeinen merkki ovat erilaiset, palauta false.
    Muissa tapauksissa ota jonon keskiosa, josta puuttuvat ensimmäinen ja viimeinen merkki,
    selvitä rekursiivisella metodikutsulla, onko keskiosa palindromi, ja
palauta sama totuusarvo, jonka rekursiivinen kutsukin palautti.
*/