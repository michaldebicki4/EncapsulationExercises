package com.company;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(90,0,true);

        System.out.println(printer.getTonerLevel());
	printer.printPage(20);
        //System.out.println(printer.getNumberOfPrintedPages());
	printer.printPage(20);
        //System.out.println(printer.getNumberOfPrintedPages());
        System.out.println(printer.getTonerLevel());
        printer.fillToner();
        System.out.println(printer.getTonerLevel());

    }
}
