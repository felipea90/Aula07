import java.util.Scanner;

public class FuncoesComArgumento 
{
    //public static String nome;
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);

        String nome;

        String nomes[] = 
        {
            "Felipe",
            "Ricardo",
            "Tassia",
            "Thiago",
            "Bruno"
        };

        for (int i=0; i<nomes.length; i++)
        {
            Funcoes.exibirSaudacao(nomes[i]);
        }

        System.out.println("Digite seu nome:");
        nome = leitor.nextLine();

        System.out.println("Mensagem da main antes de chamar a função.");

        Funcoes.exibirMensagem();

        System.out.println("Mensagem da main depois de chamar a função.");

        Funcoes.exibirSaudacao(nome);

        leitor.close();
    }
}
