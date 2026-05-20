public class main_contabancaria {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(500);

        conta.depositar(200);

        try {

            conta.sacar(1000);

        } catch (SaldoInsuficienteException e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }
}
