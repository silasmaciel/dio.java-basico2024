/*
 * Todo:
 * 1 - Conhecer e importar a classe Scanner
 * 2 - Exibir as mensagens para o nosso usuário
 * 3 - Obter pelo comando scanner os valores digitados no Terminal
 * 4 - Exibir a mensagem conta criada
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        int numeroAgencia;
        String nome;
        double saldo = 237.48;
        int palavraPasse;

        System.out.println("Informe o Nome do Cliente!: ");
        nome = scanner.nextLine();
        System.out.println("Bem Vindo!: " + nome);

        System.out.println("Informe o Número da Conta!: ");
        numeroConta = scanner.nextInt();
        System.out.println("Sua conta é: " + numeroConta);

        System.out.println("Informe a Agencia!: ");
        numeroAgencia = scanner.nextInt();
        System.out.println("Sua Agência é: " + numeroAgencia);

        System.out.println("Informe sua Senha!: ");
        palavraPasse = scanner.nextInt();
        System.out.println("Senha Confirmada!");

        System.out.println("Seu Saldo é: R$ " + saldo);

        System.out
                .println("Olá " + nome + " Obrigado por criar uma conta em nosso banco, sua agencia é: " + numeroAgencia
                        + " Sua Conta é: " + numeroConta + " e seu saldo é: R$ " + saldo + " Já Disponível para saque");

        System.out.println("Obrigado Por Acessar o Nosso Banco DIOCLARO!");

    }
}
