package designerPatterns.creaction.factoryMethod;

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
        return this.name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return this.minNumberOfPlayers;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return this.maxPlayersNumber;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return this.isOnline;
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
