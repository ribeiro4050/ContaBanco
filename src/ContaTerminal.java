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

        System.out.println("Por favor, digite o numero da agencia");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o numero da conta");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta " +
                "em nosso banco, sua agencia é " + agencia +" ,conta: " + conta +
                ", com saldo R$ " + saldo + " ja esta disponivel para saque");
    }
}


