public class testestring {

    public static void main(String[] args) {
        testarStringVazia();
    }

    public static void testarStringVazia(){

        String texto = "Hoje é terça-feira";

        if (texto.isEmpty()){
            System.out.println("Teste bem-sucedido: A String está vazia");
        }else{
            System.out.println("Teste falhou: String não vazia");
        }
    }

   

    
}