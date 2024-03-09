import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Contador meuContador = new Contador();
        char resposta;

        System.out.println("seu numero inicial é 0");

        do {

            System.out.println("Você deseja: 1-Incrementar 2-Decrementar ");
            int escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                    meuContador.incrementar();
                    meuContador.exibirValor();
                    break;

                case 2:
                    meuContador.decrementar();
                    meuContador.exibirValor();
                    break;
            }

            System.out.println("Deseja continuar? (s/n): ");
            resposta = ler.next().charAt(0);

        } while (resposta != 'n' && resposta != 'N');

        System.out.println("Programa encerrado");
        ler.close();
    }
}
