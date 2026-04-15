public class produto {
    String nome;
    double preco;

    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirPreco() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço Base: R$ " + preco);
    }
}
