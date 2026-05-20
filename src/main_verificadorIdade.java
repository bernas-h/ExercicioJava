import java.util.Scanner;

public class main_verificadorIdade {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        VerificadorIdade verificador =
                new VerificadorIdade();

        try {

            System.out.print("Digite sua idade: ");

            int idade = sc.nextInt();

            verificador.verificarIdade(idade);

        } catch (MenorDeIdadeException e) {

            System.out.println("Erro: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Entrada inválida!");
        }

        sc.close();
    }
}
