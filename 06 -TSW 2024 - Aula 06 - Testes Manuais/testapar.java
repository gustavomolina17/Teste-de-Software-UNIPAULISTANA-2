import java.util.Scanner;

public class testapar {

    public static void main(String[] args) {
        testarNumeroPar();
    }

    public static void testarNumeroPar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        if (numero%2==0) {
            System.out.println("Teste bem-sucedido: É PAR!!!!");    
        } else{
            System.out.println("Teste falhou: Não é Par");
        }
        sc.close();
    }   
}

