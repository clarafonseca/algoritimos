let input = require('fs').readFileSync('possibilidades/stdin', 'utf8') 

let possibilidades = n => {
    if (n > 1) {
        return n * possibilidades(n - 1);
    }
    return 1;
}
console.log(`Existem ${possibilidades(input)} modos para ${input} amigos tirarem uma foto`)
