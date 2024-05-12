import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        try (Scanner scanner = new Scanner(System.in)) {


            String conta;
            conta = scanner.nextLine();
            try {
                verificarNumeroConta(conta);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } 
    }

    private static void verificarNumeroConta(String conta) {
        if (conta.length() == 8) {
            System.out.println("Numero de conta valido."); 
        }else{
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    } 
}   
   

