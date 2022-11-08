package designerPatterns.builder;

public class ToyBuilder {
    private String name;
    private String madeOf;
    private String type;
    private int year;

    public ToyBuilder name(String name) {
        this.name = name;
        return this;
    }

    public ToyBuilder madeOf(String madeOf) {
        this.madeOf = madeOf;
    return this;
    }

    public ToyBuilder type(String type) {
        this.type = type;
        return this;
    }

    public ToyBuilder year(int year) {
        this.year = year;
        return this;
    }

    public Toy build(){
        return new Toy(name,madeOf,type,year);
    }
}
