package com.Jeans;

public class OutsidePart extends JeansParts {
    private Pattern pattern;

    public OutsidePart(String material, double materialSize, String color, Pattern pattern, int price) {
        super(material, materialSize, color, price);
        this.pattern = pattern;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    @Override
    public void print() {
        System.out.println("Outside part");
        System.out.println("material: " + material);
        System.out.println("material size: " + materialSize + "(m2)");
        System.out.println("color: " + color);
        pattern.print();
    }

    public static class Pattern {
        private String pattern;
        private String patternSize;
        private String patternColor;

        public Pattern(String pattern, String patternSize, String patternColor) {
            this.pattern = pattern;
            this.patternSize = patternSize;
            this.patternColor = patternColor;
        }

        public String getPattern() {
            return pattern;
        }

        public void setPattern() {
            this.pattern = "default";
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        public String getPatternSize() {
            return patternSize;
        }

        public void setPatternSize(String patternSize) {
            this.patternSize = patternSize;
        }

        public String getPatternColor() {
            return patternColor;
        }

        public void setPatternColor(String patternColor) {
            this.patternColor = patternColor;
        }

        public void print() {
            System.out.println("Pattern");
            System.out.println("pattern: " + pattern);
            System.out.println("pattern size: " + patternSize);
            System.out.println("pattern color: " + patternColor);
            System.out.println();
        }
    }
}
