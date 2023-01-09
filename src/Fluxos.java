public class Fluxos {
    public static void main(String[] args) {

        int idade = 19;
        int qtdPessoas = 3;

        boolean acompanhado = qtdPessoas >= 2; //Variável local não tem valor padrão!

        if (idade >= 18 && acompanhado) {
            System.out.println("Maior de idade");
        } else
            System.out.println("Você é menor de idade");

        int count = 0;
        int total = 0;
        while(count <= 10){
            total += count;
            System.out.println(count);
            count++;
        }
        System.out.println(total);

        //Laços encadeados:
        for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if ( coluna > linha ) {
                    break;
                }
                System.out.print( coluna + 1 );
            }
            System.out.println();
        }

    }
}
