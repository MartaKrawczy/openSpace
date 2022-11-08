package designerPatterns.factoryMethod;

public class BoardGame implements Game {

    private String name;
    private String type;
    private int maxPlayersNumber;

    public BoardGame(final String name, final String type, final int maxPlayersNumber) {
        this.name = name;
        this.type = type;
        this.maxPlayersNumber = maxPlayersNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return 2;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxPlayersNumber;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return false;
    }

    @Override
    public String toString(){
        return "Board Game: "
                + "\n Name: " + name
                + "\n Type: " + type
                + "\n Maximum players: " + maxPlayersNumber;
    }

}
