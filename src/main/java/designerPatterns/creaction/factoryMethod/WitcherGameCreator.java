package designerPatterns.creaction.factoryMethod;

public class WitcherGameCreator implements GameFactory{
    @Override
    public Game create() {
        return new ComputerGame("The Witcher 3: Wild Hunt","adventure", 1,1,false);
    }
}
