public class main_cliente {
    public static void main(String[] args) {

        cliente_fisico cf = new cliente_fisico(1, "Rua A", "João", "12345678901");
        cf.exibirDados();
        cf.localizarEndereco();


        cliente_juridico cj = new cliente_juridico(2, "Rua 33", "Empresa Google", "12345678000199");
        cj.exibirDados();
        cj.localizarEndereco();
    }
}
