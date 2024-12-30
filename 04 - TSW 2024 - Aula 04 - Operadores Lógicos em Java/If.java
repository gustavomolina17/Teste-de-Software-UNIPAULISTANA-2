import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in); // Instanciação do objeto sc

        System.out.println("Digite um número inteiro");
        int num = sc.nextInt();

        if (num>0){ //SE
            System.out.println("O número: "+num+" é POSITIVO");
        }else if(num<0){ // SENÃO SE
            System.out.println("O número: "+num+" é NEGATIVO");
        }else{ //SENÃO
            System.out.println("O número: "+num+" é ZERO!!!!");
        }

        sc.close();


    }
    
}
