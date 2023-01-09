import java.math.BigDecimal;

public class Variaveis {
    public static void main(String[] args) {

        /**
         * Java: staticamente e fortemente tipada
         *
         * Staticamente -> as variáveis precisam ser declaradas
         * Fortemente tipada -> os tipos das variáveis devem ser declaradas
         *      ex. int numero = 19;
         *
        **/

        int idade;
        idade = 19;

        double salario = 999.5;


        //Não é tipo primitivo!
        String nome = "Vinícius";

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSalário: " + salario);

        // int divisaoErrada = 1.2 / 2; // - NÃO COMPILA
        int divisaoInt = 5 / 2; // COMPILA - mas int não possui ponto flutuante, logo vai arredondar pra 2!

        System.out.println("(int) 5 / 2 = " + divisaoInt);

        double divisaoDouble = 5 / 2; // 2.0 - evaluation!! - está dividindo 2 INTEIROS, depois disso,
        // ele joga dentro de um DOUBLE com ponto flutuante

        System.out.println("(double) 5 / 2 = " + divisaoDouble);

        double novaDivisaoDouble = 5.0 / 2;

        System.out.println("(double) 5 / 2 = " + divisaoDouble);
        System.out.println("(double) 5.0 / 2 = " + novaDivisaoDouble + "\n\n");


        //Casting
        int salarioInt = (int) salario;
        System.out.println("Salário - casting: " + salarioInt + "\n\n");

        // 64bits!
        long numeroGrande = 6519856546516521l;
        System.out.println("(long) Número grande: " + numeroGrande + "\n");

        // O problema com double
        double num1 = 0.1;
        double num2 = 0.2;

        System.out.println(num1 + num2); // Resultado = 0.30000000000000004

        float numFloat1 = .1F;
        float numFloat2 = .2F;

        System.out.println("Num Float: " + (numFloat1 + numFloat2) + "\n");

        //Java não guarda a referência! mas sim o valor das variáveis:
        int primeiro = 5;
        int segundo = 7;

        segundo = primeiro;
        primeiro = 10;

        // quanto vale o segundo?

        System.out.println(segundo); // 5 - não guarda a referência da variável, mas sim o valor!

    }
}

