package JogoDaVelha;

public class VerificaVencedor {

    public static boolean verific(String[][] arr, String jogVez){
        for(int i = 0; i < 3; i++) {
            if (arr[i][0].equals(jogVez) && arr[i][1].equals(jogVez) && arr[i][2].equals(jogVez)) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                DesenhaVelha.desenhaVelha(arr);
                System.out.printf("Jogador %s venceu!", jogVez);
                return true;
            }
            if (arr[0][i].equals(jogVez) && arr[1][i].equals(jogVez) && arr[2][i].equals(jogVez)) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                DesenhaVelha.desenhaVelha(arr);
                System.out.printf("Jogador %s venceu!", jogVez);
                return true;
            }
        }
        if (arr[0][0].equals(jogVez) && arr[1][1].equals(jogVez) && arr[2][2].equals(jogVez)) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            DesenhaVelha.desenhaVelha(arr);
            System.out.printf("Jogador %s venceu!", jogVez);
            return true;
        }
        if (arr[0][2].equals(jogVez) && arr[1][1].equals(jogVez) && arr[2][0].equals(jogVez)) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            DesenhaVelha.desenhaVelha(arr);
            System.out.printf("Jogador %s venceu!", jogVez);
            return true;
        }
        if (arr[0][0].equals(" ") || arr[0][1].equals(" ") || arr[0][2].equals(" ") || arr[1][0].equals(" ")
                || arr[1][1].equals(" ") || arr[1][2].equals(" ") || arr[2][0].equals(" ") || arr[2][1].equals(" ")
                || arr[2][2].equals(" ")) {
            return false;
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            DesenhaVelha.desenhaVelha(arr);
            System.out.println("Deu velha!");
            return true;
        }

    }
}
