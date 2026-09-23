import java.util.Scanner;
public class ContaTerminal {
    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da agencia\n");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o numero da conta\n");
        int conta = scanner.nextInt();
        System.out.println("Por favor, digite seu nome\n");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite seu saldo\n");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta" +
                "em nosso banco, sua agencia é " + agencia +" conta " + conta +
                " com saldo R$ " + saldo + "ja esta disponivel para saque");
    }
}


