package designerPatterns.creaction.builder;

public class Toy {
    private String name;
    private String madeOf;
    private String type;
    private int year;

    public Toy(final String name, final String madeOf, final String type, final int year) {
        this.name = name;
        this.madeOf = madeOf;
        this.type = type;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return "Toy: " + "\n name: " + name
                + "\n type: " + type
                + "\n made of: " + madeOf
                +"\n production year: " + year;
    }
}
