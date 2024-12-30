import java.util.Scanner;

public class media {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a 1ª nota: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        double n2 = sc.nextDouble();

        double media = (n1+n2)/2;

        if (media>=7 && media<=10){
            System.out.println("Aluno APROVADO com média: "+media);
        } else if(media>=5 && media <=6.99){
            System.out.println("Aluno DE EXAME com média: "+media);
        }else{
            System.out.println("Aluno REPROVADP com média: "+media);
        }

        sc.close();
        
    }
    
}
