package revisao;

public class produto {
    String nome;
    double preco;
    int quantidade;

    double valorTotal() {
        return preco * quantidade;
    }
}
