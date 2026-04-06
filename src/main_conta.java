public class main_conta {
    public static void main(String[] args) {
        contacorrente cc = new contacorrente(1, "João", 1200, 500);
        cc.exibirInfo();
        cc.usarLimite(1300);

        contapoupanca cp = new contapoupanca(2, "Bernardo", 2000, 0.05);
        cp.exibirInfo();
        cp.aplicarRendimento();

        contasalario cs = new contasalario(3, "Julio", 1000, "Empresa Google");
        cs.exibirInfo();
        cs.receberSalario(5000);
    }
}
