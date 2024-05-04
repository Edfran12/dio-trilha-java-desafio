
import java.util.Locale;
import java.util.Scanner;

/**
 * Esta classe representa um terminal de conta bancária.
 * Foi desenvolvida como parte de um desafio proposto por Gleyson Sampaio.
 * @author: Édfran Almeida
 */

 
public class ContaTerminal {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Olá , faça parte do nosso time!");

        System.out.println("Digite seu nome por favor: ");
        String nome = scanner.next();

        System.out.println("Digite o número da Agência :");
        String agencia = scanner.next();
   

        System.out.println("Digite o número da conta : ");
        int numero_Conta = scanner.nextInt();
        
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero_Conta + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();//indica que terminei de usar objeto Scanner 

    }

}
