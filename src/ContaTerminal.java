import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        int agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Agora digite seu saldo: ");
        saldo = scanner.nextDouble();

        //Exibindo a mensagem final ao cliente:

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está dísponivel para saque.");



    }

}
