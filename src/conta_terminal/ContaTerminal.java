package conta_terminal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in).useLocale(Locale.US);
		
		if (args.length > 0) {
            System.out.println("Argumentos passados pela linha de comando:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("Nenhum argumento foi passado pela linha de comando.");
        }
		
		System.out.println("Digite o numero da sua conta: ");
		int numero = s.nextInt();
		
		System.out.println("Digite a sua agencia: ");
		String agencia = s.next();
		
		System.out.println("Informe seu nome: ");
		String nomeCliente = s.next();
		
		System.out.println("Informe o saldo: ");
		double saldo = s.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco.%n", nomeCliente);
        System.out.printf("Sua agência é %s, conta %s e seu saldo de R$ %.2f já está disponível para saque.%n", agencia, numero, saldo);
    }
		
		

}


