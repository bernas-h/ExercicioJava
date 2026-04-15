public class mercado {
    public static void main(String[] args) {
        produtoImportado note = new produtoImportado("Smartphone", 2500.00, 450.00);

        note.exibirPreco(); 
        
        double precoFinal = note.calcularPrecoFinal(); 
        System.out.println("Taxa de Importação: R$ " + note.taxaDeImportacao);
        System.out.println("Preço Final (com taxas): R$ " + precoFinal);
    }
}
