package JogoDaVelha;

public class Jogada {
    public static boolean jogada(String[][] arr, String pos, String jogVez) {
        String[] posSplit = pos.split(",");
        if (posSplit.length == 2) {
            int line = Integer.parseInt(posSplit[0]);
            int col = Integer.parseInt(posSplit[1]);
            if (line < arr.length && col < arr.length) {
                if (arr[line][col].equals(" ")) {
                    arr[line][col] = jogVez;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
}
