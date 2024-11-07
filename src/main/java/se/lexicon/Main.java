package se.lexicon;

import se.lexicon.model.Currency;

public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello world!");

        SevenElevenMachine machine = new SevenElevenMachine();

        machine.addCurrency(Currency.FIVEHUNDRED);
        System.out.println(machine.getBalance());

        machine.request(1);
        machine.endSession();
        System.out.println(machine.getBalance());


    }
}