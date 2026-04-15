public class carro extends veiculo {
    int nPortas;

    public carro(String marca, int ano, int nPortas) {
        super(marca, ano);
        this.nPortas = nPortas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Portas: " + nPortas);
    }
}