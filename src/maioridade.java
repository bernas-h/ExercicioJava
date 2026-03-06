import java.util.Scanner;
public class maioridade {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        int idade = ent.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }
        ent.close();
    }
}
