import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria p1 = new ContaBancaria();
        p1.saldo = 2800;
        p1.numConta = "05149605-0";
        int op;

        do{
            System.out.println("[1] - EXTRATO");
            System.out.println("[2] - SAQUE");
            System.out.println("[3] - DEPOSITO");
            System.out.println("[0] - SAIR");
            System.out.print("OPÇÃO: ");
            op = sc.nextInt();

            System.out.println();

            switch (op){
                case 1:
                    System.out.println("EXTRATO: ");
                    p1.Extrato();
                    System.out.println();
                break;

                case 2:
                    System.out.println("SAQUE: ");
                    p1.Saque();
                    System.out.println();
                break;

                case 3:
                    System.out.println("DEPOSITO: ");
                    p1.Deposito();
                    System.out.println();
                break;
            }

        }while(op != 0);

        p1.Extrato();

    }
}