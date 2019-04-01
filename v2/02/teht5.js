const Immutable = require('immutable');

const persons = [
    {name: "Davon", bornIn: 1988},
    {name: "Tiana", bornIn: 1983},
    {name: "Ricardo", bornIn: 2001},
    {name: "Izzie", bornIn: 1995},
    {name: "Abbas", bornIn: 1999}
];

const selectedPeople = Immutable.fromJS(persons)
    .toSeq()
    .map(x => x.set("age", 2019 - x.get("bornIn")))
    .filter(x => x.get("age") > 20);

selectedPeople.forEach(person => {
    console.log(person);
});