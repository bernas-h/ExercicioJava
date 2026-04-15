public class main_carro {
    public static void main(String[] args) {
        carro meuCarro = new carro("Toyota", 2024, 4);

        System.out.println("--- Dados do Veículo ---");
        meuCarro.exibirDados();
    }
}