package JogoDaVelha;

public class DesenhaVelha {
    public static void desenhaVelha(String[][] arr){
        System.out.println("   0  1  2");

        for(int line = 0; line < arr.length; line++){
            System.out.printf("%s   ",line);
            for(int col = 0; col < arr[0].length; col++){
                if(col == 0 || col == 1){
                    if(line == 0 || line == 1)System.out.printf("\u001B[4m%s\u001B[0m|", arr[line][col]);
                    else System.out.printf("%s|", arr[line][col]);
                } else {
                    if(line == 0 || line == 1)System.out.printf("\u001B[4m%s\u001B[0m", arr[line][col]);
                    else System.out.printf("%s", arr[line][col]);
                }
                
            }
            System.out.println();
        }
    }

    public static void prenchVelha(String[][] arr){
        for(int line = 0; line < arr.length; line++){
            for(int col = 0; col < arr[0].length; col++){
                arr[line][col] = " ";
            }
        }
    }
}
