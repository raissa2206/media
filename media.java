import java.util.Scanner;

public class media {
    private static Object console;

    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        float recuperacao, numero1,numuro2,media;
        String nome;
        
        System.out.println("Digite nome no aluno:");
        nome = ler.nextLine();
        System.out.println("Digite a primeira nota:" );
        numero1 = ler.nextFloat();
        System.out.println("Digite a sugunda nota:");
        numuro2 = ler.nextFloat();
        media = (numero1+numero1)/2;
        System.out.println("Media:"+media);
        if (media>6){
            System.out.println("Aluno " +nome+ " aprovado: "+ media);
        }

        else {
             System.out.println("Aluno " +nome+ " reprovado, digite a nota da recuperaçao: ");
        recuperacao = ler.nextInt();

        
        if (recuperacao>=6) {
            System.out.println("Aluno "  +nome+ " aprovado: "+ recuperacao);

        }
        else {
            System.out.println("Aluno " +nome+ " reprovado: "+ recuperacao);

        }
        }




    }
    
}
