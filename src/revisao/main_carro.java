package revisao;

public class main_carro {
    public static void main(String[] args) {
        carro meuCarro = new carro();
        meuCarro.marca = "Fusca";
        meuCarro.modelo = "Fusca 1300";
        meuCarro.ano = 1972;
        meuCarro.km = 100000;
        meuCarro.abastecido = false;
        

        meuCarro.caracteristicas();
        meuCarro.funcionar();
    }
}
