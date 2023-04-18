package JogoDaVelha;

import java.util.Scanner;

public class Regras {
    Scanner input = new Scanner(System.in);
    public void regras(){
        System.out.println("JOGO DA VELHA");
        System.out.println("As regras sao simples, basta digitar a linha e coluna que deseja jogar separado por uma virgula");
        System.out.println("Exemplo: 1,1");
        System.out.println("Onde 0,0 é a primeira linha e primeira coluna");
        System.out.println("Boa sorte!");
        System.out.println("Pressione ENTER para continuar");
        input.nextLine();
    }
}
