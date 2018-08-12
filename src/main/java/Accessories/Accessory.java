package Accessories;

import Interfaces.ISell;

public abstract class Accessory implements ISell {

    private String description;
    private int priceBoughtFor;
    private int priceSoldFor;

    public Accessory(String description, int priceBoughtFor, int priceSoldFor) {
        this.description = description;
        this.priceBoughtFor = priceBoughtFor;
        this.priceSoldFor = priceSoldFor;

    }

    public String getDescription() {
        return description;
    }

    public int getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public int getPriceSoldFor() {
        return priceSoldFor;
    }

    @Override
    public double calculateMarkup() {
        return (priceSoldFor - priceBoughtFor)/priceBoughtFor;
    }

}
