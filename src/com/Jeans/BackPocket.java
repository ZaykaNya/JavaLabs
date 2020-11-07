package com.Jeans;

public class BackPocket extends JeansParts{
    private Button backPocketButton;

    public BackPocket(String material, double materialSize, String color, Button backPocketButton) {
        super(material, materialSize, color);
        this.backPocketButton = backPocketButton;
    }

    public Button getBackPocketButton() {
        return backPocketButton;
    }

    public void setBackPocketButton(Button backPocketButton) {
        this.backPocketButton = backPocketButton;
    }

    @Override
    public void print() {
        System.out.println("Back pocket");
        System.out.println("material: " + material);
        System.out.println("material size: " + materialSize + "(m2)");
        System.out.println("color: " + color);
        backPocketButton.print();
    }
}
