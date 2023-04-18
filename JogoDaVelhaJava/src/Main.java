import JogoDaVelha.*;
import java.util.Scanner;

public class Main {
    private static final String PECAS[] = {"X", "O"};

    public static void main(String[] args) {
        Regras regras = new Regras();
        String jogVez = PECAS[0];
        String[][] tabuleiro = new String[3][3];
        DesenhaVelha.prenchVelha(tabuleiro);

        Scanner input = new Scanner(System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();
        regras.regras();

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            DesenhaVelha.desenhaVelha(tabuleiro);
            System.out.printf("Digite a posição linha e coluna VEZ DO (%s): ", jogVez);

            String position = input.next().trim().strip();
            if (Jogada.jogada(tabuleiro, position, jogVez)) {
                if (VerificaVencedor.verific(tabuleiro, jogVez)) {
                    System.out.printf("\nQuer jogar novamente? (S/N): ");
                    String jogarNovamente = input.next().trim().strip();
                    if (jogarNovamente.equalsIgnoreCase("s") || jogarNovamente.isBlank()){
                        jogVez = PECAS[0];
                        DesenhaVelha.prenchVelha(tabuleiro);
                        continue;
                    } else {
                        break;
                    }
                }
                jogVez = (jogVez.equals(PECAS[0])) ? PECAS[1] : PECAS[0];
            }
        }
        
        input.close();
    }
}
