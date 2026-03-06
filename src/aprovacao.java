import java.util.Scanner;
public class aprovacao {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        double nota1 = ent.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = ent.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if(media >= 5 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        ent.close();
    }
}
