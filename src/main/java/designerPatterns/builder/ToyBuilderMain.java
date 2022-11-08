package designerPatterns.builder;

public class ToyBuilderMain extends ToyBuilder{
    public static void main(String[] args) {
        final Toy toy = new ToyBuilder()
                .name("Barbie").
                type("doll").
                madeOf("China").
                year(2021).
                build();

        System.out.println(toy);
    }

}
