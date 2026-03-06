import java.util.Scanner;
public class mediadevetor {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int[] vet = new int[5];
        int soma = 0;
        for(int i = 0; i < 5; i++){
            System.out.printf("Digite a posição %d do vetor: ", i);
            vet[i] = ent.nextInt();
        }
        
        for(int i = 0; i < 5; i++){
            soma = soma + vet[i];
        }
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + ((double) soma / 5));
        ent.close();
    }
}
