package com.Jeans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum JeansType {
    straight,
    slim,
    skinny,
    wide,
    flare;

    private static final Logger logger = LogManager.getLogger(JeansType.class.getName());
    
    public void showJeansTypes() {
        logger.info("Jeans Types: ");
        String strForSplit = "straight slim skinny wide flare";
        String[] result =  strForSplit.split(" ");
        for(String word: result) {
            logger.info(word);
        }
    }

    @Override
    public String toString() {
        return super.toString().toUpperCase();
    }
}


