public class produtoImportado extends produto {
    double taxaDeImportacao;

    public produtoImportado(String nome, double preco, double taxaDeImportacao) {
        super(nome, preco);
        this.taxaDeImportacao = taxaDeImportacao;
    }

    public double calcularPrecoFinal() {
        return this.preco + this.taxaDeImportacao;
    }
}
