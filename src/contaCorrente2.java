public class contaCorrente2 extends conta2 {
    public contaCorrente2(String titular, double saldo) {
        super(titular, saldo);
    }

    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("O saldo atual: R$ " + saldo);
    }
}
