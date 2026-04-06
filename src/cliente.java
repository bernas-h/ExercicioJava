public class cliente {
   private int codigo;
    private String endereco;

    public cliente(int codigo, String endereco) {
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public void localizarEndereco() {
        System.out.println("Endereço: " + endereco);
    }
}
