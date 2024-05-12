import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        

        try (Scanner scanner = new Scanner(System.in)) {
            double limiteDiario = scanner.nextDouble();
            double saque = 0;


            while (true) {
                saque = scanner.nextDouble();
                double restante = limiteDiario - saque;
                limiteDiario -=saque;
                if (saque > limiteDiario) {
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    return;
                }else if (saque == 0){
                    System.out.println("Transacoes encerradas.");
                    return;
                }else{
                    System.out.println("Saque realizado. Limite restante: " + restante);
                }
            }
        }
    }
    
}