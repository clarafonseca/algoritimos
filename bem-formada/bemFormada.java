import java.io.IOException;

public class bemFormada {

    static class Char {

        private char valor;

        Char(char valor) {
            this.valor = valor;
        }

        Char() {
            this.valor = '\u0000';
        }

        public char getValor() {
            return this.valor;
        }

        public void setValor(char valor) {
            this.valor = valor;
        }

        public void imprimir() {
            System.out.println(valor);
        }
    }

    static class Celula {

        private Char charr;
        private Celula proximo;

        Celula(Char charr) {
            this.charr = charr;
            this.proximo = null;
        }

        Celula() {
            this.charr = new Char();
            this.proximo = null;
        }

        public Char getPalavra() {
            return this.charr;
        }

        public void setPalavra(Char charr) {
            this.charr = charr;
        }

        public Celula getProximo() {
            return this.proximo;
        }

        public void setProximo(Celula proximo) {
            this.proximo = proximo;
        }
    }

    static class Pilha {

        private Celula fundo;
        private Celula topo;

        Pilha() {
            Celula sentinela;

            sentinela = new Celula();
            fundo = sentinela;
            topo = sentinela;
        }

        public boolean pilhaVazia() {

            boolean resp;

            resp = fundo == topo;

            return resp;
        }

        public void empilhar(Char charr) {

            Celula nova;

            nova = new Celula(charr);
            nova.setProximo(topo);
            topo = nova;
        }

        public Char desempilhar() throws Exception {

            Char desempilhado;

            if (!pilhaVazia()) {
                desempilhado = topo.getPalavra();
                topo = topo.getProximo();
            } else
                throw new Exception("Não foi possível desempilhar: a pilha está vazia!");

            return desempilhado;
        }

        public Char getTopo() throws Exception {

            Char top;

            if (!pilhaVazia()) {
                top = topo.getPalavra();
            } else
                throw new Exception("Não há char no topo da pilha: a pilha está vazia!");
            return top;
        }
    }

    public static void palavraBemFormada(String entrada) {
        Pilha pilha = new Pilha();
        boolean bemformada = true;
        char[] entradaCharArray = entrada.toCharArray();
        for (char c : entradaCharArray) {
            switch (c) {
                case '(':
                case '[':
                    try {
                        Char d = new Char(c);
                        pilha.empilhar(d);
                    } catch (Exception ignored) {
                    }
                    break;
                case ')':
                    try {
                        if (pilha.getTopo().getValor() != '(') {
                            bemformada = false;
                        } else
                            pilha.desempilhar();
                    } catch (Exception e) {
                        bemformada = false;
                    }
                    break;
                case ']':
                    try {
                        if (pilha.getTopo().getValor() != '[') {
                            bemformada = false;
                        } else pilha.desempilhar();
                    } catch (Exception e) {
                        bemformada = false;
                    }
                    break;
            }
        }
        if (pilha.pilhaVazia() && bemformada)
            System.out.println("correto");
        else
            System.out.println("incorreto");
    }

    public static void main(String[] args) throws IOException {
        String entrada;
        while (!(entrada = MyIO.readLine()).equals("FIM")) {
            palavraBemFormada(entrada);
        }
    }
}

