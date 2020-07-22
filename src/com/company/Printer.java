package com.company;

public class Printer {
    private int tonerLevel;
    private int numberOfPrintedPages;
    private boolean duplex;

    public Printer(int tonerLevel, int numberOfPrintedPages, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPrintedPages = numberOfPrintedPages;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public boolean isDuplex() {
        return duplex;
    }
    public void fillToner(){

        this.tonerLevel = 100;
    }
    public void printPage(int howManyPagesYouWantToPrint){
        if(howManyPagesYouWantToPrint > this.tonerLevel){
            System.out.println("za malo tuszu");
        }
        else {
            this.tonerLevel -= howManyPagesYouWantToPrint;

            if (this.duplex)
                howManyPagesYouWantToPrint = (howManyPagesYouWantToPrint / 2) + (howManyPagesYouWantToPrint % 2);
            this.numberOfPrintedPages += howManyPagesYouWantToPrint;
            System.out.println("Wydrukowano " + numberOfPrintedPages + " stron.");
        }

    }
}

