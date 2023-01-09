public class Fluxos {
    public static void main(String[] args) {

        int idade = 19;
        int qtdPessoas = 3;

        boolean acompanhado = qtdPessoas >= 2; //Variável local não tem valor padrão!

        if (idade >= 18 && acompanhado) {
            System.out.println("Maior de idade");
        } else
            System.out.println("Você é menor de idade");


    }
}
