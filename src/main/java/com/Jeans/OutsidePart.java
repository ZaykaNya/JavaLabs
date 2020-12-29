package com.Jeans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OutsidePart extends JeansParts {
    private Pattern pattern;
    private static final Logger logger = LogManager.getLogger(OutsidePart.class.getName());

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
        logger.info("Outside part");
        logger.info("material: " + material);
        logger.info("material size: " + materialSize + "(m2)");
        logger.info("color: " + color);
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
            logger.info("Pattern");
            logger.info("pattern: " + pattern);
            logger.info("pattern size: " + patternSize);
            logger.info("pattern color: " + patternColor);
        }
    }
}
