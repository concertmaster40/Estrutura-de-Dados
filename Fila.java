
public class Fila {
    private int primeiro;
    private int ultimo;
    private int dados[];
    private int capacidade;


    public Fila(int capacidade){
        this.primeiro = -1;
        this.ultimo = -1;
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
    }

    public boolean vazia(){
        return primeiro == -1;
    }

    public boolean cheia(){

        return dados[ultimo] == dados[capacidade - 1];  
    }

    public void imprime() {
        if (vazia()) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.print("Elementos da pilha: ");
        for (int i = 0; i < capacidade; i++) {
            System.out.print(dados[i]);
        }
    }    

    public void insere(int valor){
        if(vazia()){
            primeiro++;
            System.out.println("Primeiro elemento: "+primeiro);
            ultimo++;
            dados[0] = valor;
        }
        else{
            for(int i = 1; i < capacidade; i++){
                if(dados[i] == 0){
                    dados[i] = valor;
                    ultimo++; break;
                }
                else if(cheia()){
                    System.out.println("Fila cheia!");
                }
            }
        }
    }

    public void remove(){
        if(cheia()){
            dados[primeiro] = 0;
            primeiro++;
            System.out.println(dados[primeiro]);
            ultimo = primeiro;
        }
    }

    public static void main(String[] args) {
        Fila fila = new Fila(4);

        fila.imprime();
        fila.insere(1);
        fila.imprime();
        fila.insere(2);
        fila.imprime();
        fila.insere(3);
        fila.imprime();
        fila.insere(4);
        fila.imprime();
        fila.remove();
        fila.imprime();
        fila.remove();
        fila.imprime();
    }
}
