package designerPatterns.factoryMethod;

public class ComputerGame implements Game{
    private final String name;
    private final String type;
    private final int minNumberOfPlayers;
    private final int maxPlayersNumber;
    private final boolean isOnline;

    public ComputerGame(final String name, final String type, final int minNumberOfPlayers,final int maxPlayersNumber, final boolean isOnline) {
        this.name = name;
        this.type = type;
        this.minNumberOfPlayers = minNumberOfPlayers;
        this.maxPlayersNumber = maxPlayersNumber;
        this.isOnline = isOnline;
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
        return minNumberOfPlayers;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxPlayersNumber;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return isOnline;
    }

    @Override
    public String toString(){
        return "Computer Game: "
                + "\n Name: " + name
                + "\n Type: " + type
                + "\n Minimum players: " + minNumberOfPlayers
                + "\n Maximum players: " + maxPlayersNumber
                + "\n Is online <- " + isOnline;
    }

}
