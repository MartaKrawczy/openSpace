package designerPatterns.creaction.factoryMethod;

public class ChessGameCreator implements GameFactory{
    @Override
    public Game create() {
        return new BoardGame("Chess","strategy", 2);
    }
}
