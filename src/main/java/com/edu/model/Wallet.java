package com.edu.model;

import java.util.HashMap;

public class Wallet {
    private HashMap<String, Summary> money;

    public Wallet() {
        money = new HashMap<>();
    }

    public void addMoney(String currency, double amount) {
        Summary mon = money.get(currency);
        if (mon == null) {
            mon = new Summary();
            money.put(currency, mon);
        }
        mon.Add(amount);
    }

    public double removeMoney(String currency, double amount) {
        Summary s = money.get(currency);
        if (s == null) {
            return 0;
        }

        if (amount > s.getAmount()) {
            return 0;
        }

        s.remove(amount);
        return s.getAmount();
    }

    public double getMoney(String currency) {
        Summary s = money.get(currency);
        if (s == null) {
            return 0;
        }
        return s.getAmount();
    }

}
