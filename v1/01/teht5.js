function kaannaLista(lista) {
    if (lista.length === 0 || lista.length === 1) {
        return lista;
    } else {
        return kaannaLista(lista.slice(1)).concat(lista[0]);
    }
}

let lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(kaannaLista(lista));