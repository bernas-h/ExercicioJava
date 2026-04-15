public class empresa {
    public static void main(String[] args) {
        desenvolvedor dev = new desenvolvedor("Bento Alves", 5000.0, "Java");

        dev.exibirInformacoes();
        
        double salarioAnual = dev.calcularSalarioAnual();
        System.out.println("Salário Anual: R$ " + salarioAnual);
    }
}
