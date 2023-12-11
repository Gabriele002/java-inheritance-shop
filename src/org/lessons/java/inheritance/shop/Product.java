package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;


public class Product {
    // ATTRIBUTI
    private int code;
    private String name;
    private String description;

    private BigDecimal price;
    private BigDecimal vat;




    // COSTRUTTORI
    public Product(){
        this.code = generateCode();
    }

    public Product(String name, String description, BigDecimal price, BigDecimal vat) throws IllegalArgumentException{
        validateName(name);
        validatePrice(price);
        validateVat(vat);
        this.code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;

    }
    // GETTER e SETTER

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setName(String name) throws IllegalArgumentException{
        validateName(name);
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) throws IllegalArgumentException{
        validatePrice(price);
        this.price = price;
    }

    public void setVat(BigDecimal vat) throws IllegalArgumentException{
        validateVat(vat);
        this.vat = vat;
    }
    // METODI

    public BigDecimal getFullPrice(){
        BigDecimal vatOnPrice = price.multiply(vat);
        return price.add(vatOnPrice).setScale(2, RoundingMode.HALF_EVEN);
    }
    public String getFullName(){
        return code + " " + name;
    }
    private int generateCode(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(0, 10000);
    }

    // metodi di validazione
    private void validateName(String name) throws IllegalArgumentException{
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("name empty");
        }
    }

    private void validatePrice(BigDecimal price) throws IllegalArgumentException{
        if(price == null || price.compareTo(new BigDecimal(0)) < 0){
            throw new IllegalArgumentException("price negative " + price);
        }
    }

    private void validateVat(BigDecimal vat) throws IllegalArgumentException {
        if (vat == null || vat.compareTo(new BigDecimal(0)) < 0) {
            throw new IllegalArgumentException("vat negative " + vat);
        }


    }
}