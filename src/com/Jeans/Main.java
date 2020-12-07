package com.Jeans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.OptionalInt;

public class Main {

    public static void main(String[] args) {

        JeansType types = JeansType.straight;
        types.showJeansTypes();

        try {
            Jeans myJeans = new Jeans(new ArrayList<>(), "Collins", 30, 32, JeansType.skinny);
            Jeans myJeans2 = new Jeans(new ArrayList<>(), "Name", 28, 30, JeansType.flare);

            myJeans.addPart(new BackPocket("Denim", 0.5, "blue",
                    new Button("steel", 0.02, "black", "Pocket Button", 150), 150))
                    .addPart(new BottomHem("Denim", 0.1, "blue", 150))
                    .addPart(new Button("steel", 0.05, "black", "Common Button", 250))
                    .addPart(new FrontPocket("Denim", 0.3, "blue", 150))
                    .addPart(new InsidePart("Cotton", 5, "black", 150))
                    .addPart(new OutsidePart("Denim", 5, "blue",
                            new OutsidePart.Pattern("Round", "Medium", "white"), 150))
                    .addPart(new Zipper("steel", 0.1, "black", 0.15, 150));

            printJeans(myJeans);

            myJeans2.addPart(new BackPocket("Denim", 0.6, "blue",
                    new Button("steel", 0.02, "black", "Pocket Button", 200), 200))
                    .addPart(new BottomHem("Denim", 0.1, "blue", 200))
                    .addPart(new Button("steel", 0.04, "black", "Common Button", 200))
                    .addPart(new FrontPocket("Denim", 0.2, "blue", 200))
                    .addPart(new InsidePart("Cotton", 6, "black", 200))
                    .addPart(new OutsidePart("Denim", 6, "blue",
                            new OutsidePart.Pattern("Round", "Medium", "white"), 200))
                    .addPart(new Zipper("steel", 0.1, "black", 0.2, 200));

            System.out.println(myJeans.equals(myJeans2));
            System.out.println();


            int price = myJeans.getParts().stream().filter(part -> part.getMaterial().equals("steel"))
                    .mapToInt(part -> part.getPrice()).reduce(0, (left, right) -> left + right);

            System.out.println("Price: " + price);


            OptionalInt maxPrice = myJeans.getParts().stream().mapToInt(part -> {
                if (part.getMaterial().equals("steel")) {
                    return part.getPrice();
                }
                return 0;
            }).max();

            System.out.println("Max Price: " + maxPrice.getAsInt());


            int averagePrice = myJeans.getParts().stream().filter(part -> part.getMaterial().equals("steel"))
                    .mapToInt(part -> part.getPrice()).reduce(0, (left, right) -> left + right)
                    / myJeans.getParts().stream().filter(part -> part.getMaterial() == "steel").toArray().length;

            System.out.println("Average Price: " + averagePrice);


            ArrayList<String> suitableArray = new ArrayList<>();
            ArrayList<String> unsuitableArray = new ArrayList<>();
            myJeans.getParts().stream().filter(part -> {
                if (!part.getMaterial().equals("steel")) {
                    unsuitableArray.add(part.getColor());
                    return false;
                }
                return true;
            }).forEach(part -> suitableArray.add(part.getColor()));

            System.out.println("Suitable Array: " + suitableArray);
            System.out.println("Unsuitable Array: " + unsuitableArray);


            ArrayList<Jeans> jeansList = new ArrayList<>();
            jeansList.add(myJeans);
            jeansList.add(myJeans2);

            int totalPrice = jeansList.stream().flatMap(jeans -> jeans.getParts().stream())
                    .mapToInt(part -> part.getPrice()).reduce(0, Integer::sum);

            System.out.println("Total price: " + totalPrice);


        } catch (JeansException e) {
            System.err.println(e.getMessage());
        }


        Button button = new Button("steel", 0.04, "black", "Common Button", 200);
        Button button2 = new Button("plastic", 0.05, "grey", "Common Button", 200);

        System.out.println(button.equals(button2));
        System.out.println();

        int number1 = 10;
        int number2 = 20;
        String word = "Hello number ";
        String result = word + number1 + number2;
        System.out.println(result);

    }

    public static void printJeans(Jeans myJeans) {
        System.out.println("Your jeans");
        String str = "Brand: ";
        StringBuffer strBuffer = new StringBuffer(str);
        strBuffer.append(myJeans.getName());
        strBuffer.append(" width: ");
        strBuffer.append(myJeans.getWidth());
        strBuffer.append(" length: ");
        strBuffer.append(myJeans.getLength());
        strBuffer.append(" jeans type: ");
        strBuffer.append(myJeans.getType());
        strBuffer.append("\n");
        System.out.println(strBuffer.toString());
        myJeans.print();
    }
}
