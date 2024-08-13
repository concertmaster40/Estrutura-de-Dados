public class Pilha {
    public int capacidade;
    public int topo;
    public int[] dados;

    // Método Construtor com capacidade
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void insere(int valor) {
        if (cheia()) {
            System.out.println("A pilha está cheia");
        } else {
            dados[++topo] = valor;
        }
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Pilha está vazia!");
            return -1; // erro
        } else {
            return dados[topo--];
        }
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.println(dados[i]);
            }
        }
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(4);

        pilha.insere(3);
        pilha.insere(6);
        pilha.insere(9);
        pilha.insere(12);

        pilha.imprime();

        pilha.remove();

        pilha.imprime();
    }
}
