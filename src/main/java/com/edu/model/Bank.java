package com.edu.model;

import java.util.HashSet;
import java.util.Random;

public class Bank {

    private HashSet<String> currencies;

    public Bank() {
        currencies = new HashSet<>();
    }

    public void addCurrency(String c) {
        currencies.add(c);
    }

    public double convert(Summary amount, String from, String to) {
        Random rnd = new Random();
        int delta = (int) (rnd.nextFloat()*100);
        return (((amount.Main*100)+(amount.Sub))*delta)/100;
    }

}
