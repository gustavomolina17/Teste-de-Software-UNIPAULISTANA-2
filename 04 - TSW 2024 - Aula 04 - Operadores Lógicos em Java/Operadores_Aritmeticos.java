import  java.util.Scanner; 
import  java.lang.Math;

public class Operadores_Aritmeticos {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        int a = sc.nextInt();

        System.out.println("Digite o valor de b: ");
        int b = sc.nextInt();

        System.out.println("Digite um valor para calcular a raiz: ");
        int raiz = sc.nextInt();

        int soma = a+b;
        System.out.println("Soma = "+soma);

        int sub = a-b;
        System.out.println("Sub = "+sub);

        int mult = a*b;
        System.out.println("Mult = "+mult);

        double exp = Math.pow(2,3);
        System.out.println("Exp = "+exp);

        double res = Math.sqrt(raiz);
        System.out.println("Raiz Quadrada = "+res);

        int div = a/b;
        System.out.println("Div = "+div);

        int mod = a % b;
        System.out.println("Resto da divisão = "+mod);

        // Operador de Incremento
        a++;
        System.out.println("Incremento de a: "+a);
        // Operador de Decremento
        b--;
        System.out.println("Decremento de b: "+b);

       sc.close();
    }
    
}
