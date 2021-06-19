public class Funcoes 
{
    public static void exibirMensagem() 
    {
        System.out.println("Hoje é um belo dia.");    
    }

    public static void exibirSaudacao(String nome)
    {
        System.out.println("Bom dia " + nome);
    }

    public static void exibirResultado(double resultado, String operacao)
    {
        System.out.println("O resultado da " + operacao + " foi " + resultado + "!\n\n");
    }

    public static void soma(double valor1, double valor2)
    {
        double resultado;

        resultado = valor1 + valor2;

        System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);

        exibirResultado(resultado, "SOMA");
    }

    public static void subtracao(double valor1, double valor2)
    {
        double resultado;

        resultado = valor1 - valor2;

        System.out.println("\n\nRealizando a substração entre " + valor1 + " e " + valor2);

        exibirResultado(resultado, "SUBTRAÇÃO");
    }

    public static void divisao(double valor1, double valor2)
    {
        double resultado;

        if (valor2 != 0)
        {

        resultado = valor1 / valor2;

        System.out.println("\n\nRealizando a divisão entre " + valor1 + " e " + valor2);

        exibirResultado(resultado, "DIVISÃO");
        }
        else
        {
            System.out.println("Não é possível dividir por ZERO.");
        }
    }

    public static void multiplicacao(double valor1, double valor2)
    {
        double resultado;

        resultado = valor1 * valor2;

        System.out.println("\n\nRealizando a multiplicação entre " + valor1 + " e " + valor2);

        exibirResultado(resultado, "MULTIPLICAÇÃO");
    }

}
