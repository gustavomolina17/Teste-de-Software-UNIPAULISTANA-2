import java.util.*;
import java.time.LocalDate; //Import para trabalhar com data AAAA-MM-DD

public class testadata {

    public static void main(String[] args) {
        testeData();
    }

    public static void testeData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a primeira data (no formato AAAA-MM-DD)");
        String data1Input = sc.nextLine();
        LocalDate data1 = LocalDate.parse(data1Input);

        System.out.println("Insira a segunda data (no formato AAAA-MM-DD)");
        String data2Input = sc.nextLine();
        LocalDate data2 = LocalDate.parse(data2Input);

        if (data2.isAfter(data1)) {
            System.out.println("SUCESSO"); 
        } else{
            System.out.println("O teste falhou");
        }
        sc.close();
    }
}
