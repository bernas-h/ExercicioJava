package revisao;

public class carro {
    String marca;
    String modelo;
    int ano;
    int km;
    boolean abastecido;

    void caracteristicas(){
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Ano: " + ano);
    System.out.println("Quilometragem: " + km);
}
    void funcionar(){
        if(abastecido==true){
            System.out.println("O carro está funcionando.");
        } else {
            System.out.println("O carro não funciona. Abasteça-o primeiro.");
        }
    }

}
