public class VerificadorIdade {
    public void verificarIdade(int idade)
            throws MenorDeIdadeException {

        if (idade < 18) {

            throw new MenorDeIdadeException(
                "Usuário menor de idade!"
            );
        }

        System.out.println(
            "Usuário pode dirigir."
        );
    }
}
