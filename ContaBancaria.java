import java.util.Scanner;

/*
Crie uma classe que representa uma conta bancaria que possua o número da conta e saldo. Está classe também deve executar os seguintes métodos:
extrato (Mostra na tela o número e o saldo da conta)
saque (Recebe como parâmetro um valor e retira este valor do saldo da conta)
deposito (recebe como parâmetro um valor e adiciona este valor ao saldo da conta)
Ao final das operações saque e deposito, sua classe deve imprimir o número e o saldo da conta.

Crie uma classe para testar os métodos da classe conta bancaria.
 */
public class ContaBancaria {

    Scanner sc = new Scanner(System.in);

    float saqueConta, depositoConta;
    String numConta;
    float saldo;

    void Extrato(){
        System.out.println("Número da conta: " + this.numConta);
        System.out.println("Saldo: R$" + this.saldo);
    }

    void Saque(){
        System.out.println("Digite o valor a ser sacado: R$");
        saqueConta = sc.nextFloat();

        saldo -= saqueConta;
    }

    void Deposito(){
        System.out.println("Digite o valor a ser depositado: R$");
        depositoConta = sc.nextFloat();

        saldo += depositoConta;
    }

}
