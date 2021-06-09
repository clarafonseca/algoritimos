let input = require('fs').readFileSync('ordem-sequencial/stdin', 'utf8') 

let verificaOrdenação = num => {
    if (num < 0) {
        return 'ERRO: A entrada não é inteira e positiva'
    }

    let numeros = num.split('')
    for (let i = 0; i < numeros.length - 1; i++) { 
        let diferenca = numeros[i + 1] - numeros[i]
        if (diferenca !== 1 && diferenca > 1) {
            return 'Não está ordenado'
        }
    }
    return 'Está ordenado'
}

console.log(verificaOrdenação(input))