***3 - Crie uma função que recebe uma string com qualquer sequência dos seguintes caracteres*** `'[', '{', '(', ')', '}', ']'` ***e retorne se a sequência é uma sequência válida ou não. Uma sequência é válida se as chaves, parênteses e colchetes abrem e fecham corretamente***
> Exemplo:<br/>
> `{ [ ( ) ( ) { } [ ] ] { } }` é uma sequência válida<br/>
> `{ [ ( ( ) ] }` não é uma sequência válida (Há um parêntese posicionado incorretamente)<br/>
> `{ } [ ] ( )` é uma sequência válida<br/>
> `( ( ) { } [ [ ] )` não é uma sequência válida (Há uma chave posicionado incorretamente)
> `[ { } ( [ ) ] ]` não é uma sequência válida (O número de caracteres está correto, mas o posicionamento de uma chave/parêntese está incorreto)

Nota: Os espaços nos exemplos são apenas para favorecer a leitura.<br/>
Espaços não farão parte das strings de teste

/*Essa eu já tinha feito na materia de AEDs 2*/