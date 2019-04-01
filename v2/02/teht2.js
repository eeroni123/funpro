const Auto = (function () {

    const suojatut = new WeakMap();

    class Auto {

        constructor(tankki, mittari) {
            this.tankki = tankki;
            suojatut.set(this, {matkamittari: mittari});
        }

        getTankki() {
            return this.tankki;
        }

        getMatkamittari() {
            return suojatut.get(this).matkamittari;
        }

        lisaaPolttoainetta(maara) {
            this.tankki += maara;
        }

        aja() {
            console.log("ajetaan");
            this.tankki--;
            suojatut.set(this, {matkamittari: this.getMatkamittari() + 10});
        }


    }

    return Auto;
})();


let auto1 = new Auto(10, 0);
console.log(auto1.getMatkamittari());
console.log(auto1.getTankki());
auto1.aja();
console.log(auto1.getMatkamittari());
console.log(auto1.getTankki());
auto1.lisaaPolttoainetta(50);
auto1.tankki = auto1.tankki + 50; // toimii myös, koska tankki ei ole suojattu
console.log(auto1.getTankki());
