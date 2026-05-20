public class Conversor {
    public void converterNumero(String texto) {

        try {

            int numero = Integer.parseInt(texto);

            System.out.println("Número convertido: " + numero);

        } catch (NumberFormatException e) {

            System.out.println("Erro: entrada inválida!");
        }
    }
}
