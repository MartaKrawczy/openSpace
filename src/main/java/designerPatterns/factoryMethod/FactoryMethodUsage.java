package designerPatterns.factoryMethod;

import java.util.Scanner;

public class FactoryMethodUsage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        GameFactory gameFactory;
        if (type.equals("Computer")) {
            gameFactory = new WitcherGameCreator();
        } else if (type.equals("Board")){
            gameFactory = new ChessGameCreator();
        } else {
            throw new RuntimeException("unknown game type");
        }

        Game createdGame = gameFactory.create();
        System.out.println("Created game " + createdGame);
    }
}
