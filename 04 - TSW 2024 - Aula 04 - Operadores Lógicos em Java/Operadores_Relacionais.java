import java.util.Scanner;;

public class Operadores_Relacionais {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de x:");
        int x = sc.nextInt();

        System.out.println("Digite o valor de y:");
        int y = sc.nextInt();
        
        // Operador de igualdade ==
        boolean igual = (x==y);
        System.out.println("X e y são iguais: "+igual);

        // Operador de desigualdade !=
        boolean diferente = (x!=y);
        System.out.println("X e y são diferentes: "+diferente);

        // Operador >
        boolean maior = (x>y);
        System.out.println("X é maior que Y:"+maior);

        // Operador >=
        boolean maiorQue = (x>=y);
        System.out.println("X é >= y: "+maiorQue);

        // Operador <
        boolean menor = (x<y);
        System.out.println("X < y : "+menor);

        // Operador <=
        boolean menorQue= (x<=y);
        System.out.println("X <=y : "+menorQue);

        sc.close();
    }
    
}
