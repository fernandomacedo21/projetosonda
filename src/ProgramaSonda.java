import java.util.Scanner;

public class ProgramaSonda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] espacoTotal = scanner.nextLine().split(" ");

        String[] entradaPrimeiraSonda = scanner.nextLine().split(" ");

        String[] comandosPrimeiraSonda = scanner.nextLine().split("");

        String[] entradaSegundaSonda = scanner.nextLine().split(" ");

        String[] comandosSegundaSonda = scanner.nextLine().split("");

        Sonda primeiraSonda = Sonda.createNewSonda(entradaPrimeiraSonda[0], entradaPrimeiraSonda[1], entradaPrimeiraSonda[2]);

        for (int posicaoComando = 0; posicaoComando < comandosPrimeiraSonda.length; posicaoComando++) {
            primeiraSonda.executaComando(comandosPrimeiraSonda[posicaoComando]);
        }

        Sonda segundaSonda = Sonda.createNewSonda(entradaSegundaSonda[0], entradaSegundaSonda[1], entradaSegundaSonda[2]);

        for (int posicaoComando = 0; posicaoComando < comandosSegundaSonda.length; posicaoComando++) {
            segundaSonda.executaComando(comandosSegundaSonda[posicaoComando]);
        }

        System.out.println(primeiraSonda.imprimirCoordenadas());
        System.out.println(segundaSonda.imprimirCoordenadas());

    }
}
