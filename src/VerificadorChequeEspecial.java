import java.util.Scanner;

public class VerificadorChequeEspecial {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double limiteChequeEspecial = 500;
        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double saldoComChque = saldo + limiteChequeEspecial;

        if (saque > saldo) {
                if (saque > saldoComChque) {
                    System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
                } else {
                    System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
                }
            }else{
                System.out.println("Transacao realizada com sucesso.");
            }

        scanner.close();
    }
}
