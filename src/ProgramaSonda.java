import java.util.Scanner;

public class ProgramaSonda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] espacoTotal = scanner.nextLine().split(" ");

        String[] entradaPrimeiraSonda = scanner.nextLine().split(" ");

        String[] comandosPrimeiraSonda = scanner.nextLine().split("");

        String[] entradaSegundaSonda = scanner.nextLine().split(" ");

        String[] comandosSegundaSonda = scanner.nextLine().split("");

        Sonda primeiraSonda = Sonda.criarNovaSonda(entradaPrimeiraSonda[0],
                entradaPrimeiraSonda[1], entradaPrimeiraSonda[2], comandosPrimeiraSonda) ;

        primeiraSonda.executarComandos();
        System.out.println(primeiraSonda.imprimirCoordenadas());

        Sonda segundaSonda = Sonda.criarNovaSonda(entradaSegundaSonda[0],
                entradaSegundaSonda[1], entradaSegundaSonda[2], comandosSegundaSonda);

        segundaSonda.executarComandos();
        System.out.println(segundaSonda.imprimirCoordenadas());

    }
}
