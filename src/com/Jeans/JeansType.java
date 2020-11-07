package com.Jeans;

public enum JeansType {
    straight,
    slim,
    skinny,
    wide,
    flare;

    public void showJeansTypes() {
        System.out.println("Jeans Types: ");
        String strForSplit = "straight slim skinny wide flare";
        String[] result =  strForSplit.split(" ");
        for(String word: result) {
            System.out.println(word);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString().toUpperCase();
    }
}


