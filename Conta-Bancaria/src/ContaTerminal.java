import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {   


        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        // Predefinindo as variáveis e seus "valores": 
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

         
        System.out.println("Digite o número da Conta: ");
        numeroConta = scanner.nextInt(); // Leitura do número da Conta.
        
        System.out.println("Digite o número da Agência: ");
        agencia = scanner.next(); // Leitura do número da Agência.

        System.out.println("Digite seu Nome: ");
        scanner.nextLine(); // Consumir a quebra de linha pendente
        nomeCliente = scanner.nextLine(); // Leitura do nome do usuário

        System.out.println("Digite o Saldo atual R$:");
        saldo = scanner.nextDouble(); // Leitura do Saldo

        // Mensagem final com todas as informações registradas inseridas pelo usuário:
        String mensagem = "Olá, " + nomeCliente + "!" + " Obrigado por criar uma conta em nosso banco. " + "Sua agência é: " + agencia + ", Conta: " + numeroConta + " e seu Saldo é: " + "R$ " + saldo + " já disponível para saque.";
        System.out.println(mensagem);


        // Fechando o scanner
        scanner.close();
          

        
    }
}
