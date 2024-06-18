import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o usuário
        //Obter pela classe scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da sua conta:");
        int numero_conta = scanner.nextInt();

        System.out.println("Digite sua Agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu saldo:");
        float saldoF = scanner.nextFloat();

        //Exibir a mensagem final
        System.out.println("Olá " +nome+ " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero_conta +  " e seu saldo R$" + saldoF + " já está disponível para saque");
    }
}
