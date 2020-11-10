package com.Jeans;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JeansType types = JeansType.straight;
        types.showJeansTypes();

        try {
            Jeans myJeans = new Jeans(new ArrayList<>(), "Collins", 30, 32, JeansType.skinny);
            Jeans myJeans2 = new Jeans(new ArrayList<>(), "Name", 28, 30, JeansType.flare);

            myJeans.addPart(new BackPocket("Denim", 0.5, "blue",
                    new Button("steel", 0.02, "black", "Pocket Button")))
                    .addPart(new BottomHem("Denim", 0.1, "blue"))
                    .addPart(new Button("steel", 0.05, "black", "Common Button"))
                    .addPart(new FrontPocket("Denim", 0.3, "blue"))
                    .addPart(new InsidePart("Cotton", 5, "black"))
                    .addPart(new OutsidePart("Denim", 5, "blue",
                            new OutsidePart.Pattern("Round", "Medium", "white")))
                    .addPart(new Zipper("Steel", 0.1, "black", 0.15));

            printJeans(myJeans);

            myJeans2.addPart(new BackPocket("Denim", 0.6, "blue",
                    new Button("steel", 0.02, "black", "Pocket Button")))
                    .addPart(new BottomHem("Denim", 0.1, "blue"))
                    .addPart(new Button("steel", 0.04, "black", "Common Button"))
                    .addPart(new FrontPocket("Denim", 0.2, "blue"))
                    .addPart(new InsidePart("Cotton", 6, "black"))
                    .addPart(new OutsidePart("Denim", 6, "blue",
                            new OutsidePart.Pattern("Round", "Medium", "white")))
                    .addPart(new Zipper("Steel", 0.1, "black", 0.2));

            System.out.println(myJeans.equals(myJeans2));
            System.out.println();

        } catch (JeansException e) {
            System.err.println(e.getMessage());
        }


        Button button = new Button("steel", 0.04, "black", "Common Button");
        Button button2 = new Button("plastic", 0.05, "grey", "Common Button");

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
