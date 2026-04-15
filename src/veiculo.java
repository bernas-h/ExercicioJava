public class veiculo {
    String marca;
    int ano;
    public veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca + " | Ano: " + ano);
    }
}
    
