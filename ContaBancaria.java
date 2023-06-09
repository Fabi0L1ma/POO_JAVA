import java.util.Scanner;

public class ContaBancaria {

    Scanner sc = new Scanner(System.in);

    float saqueConta, depositoConta;
    String numConta;
    float saldo;

    void Extrato(){
        System.out.println("EXTRATO: ");
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println();
    }

    void Saque(){
        System.out.println("SAQUE: ");
        System.out.print("Digite o valor a ser sacado: R$");
        saqueConta = sc.nextFloat();
        saldo -= saqueConta;
        System.out.println();
    }

    void Deposito(){
        System.out.println("DEPOSITO: ");
        System.out.print("Digite o valor a ser depositado: R$");
        depositoConta = sc.nextFloat();
        saldo += depositoConta;
        System.out.println();
    }

}
