package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class Tv extends Product{
    int pollici;
    boolean smart;

    //COSTRUTTORI

    public Tv(String name, String description, BigDecimal price, BigDecimal vat, int pollici, boolean smart) throws IllegalArgumentException {
        super(name, description, price, vat);
        this.pollici = pollici;
        this.smart = smart;
    }


    //GETTER E SETTER

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }


    //METTODI
}
