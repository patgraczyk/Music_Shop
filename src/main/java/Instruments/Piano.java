package Instruments;

import Interfaces.ISell;

public class Piano extends Instrument implements ISell {

        private int numberOfKeys;
        private int priceBoughtFor;
        private int priceSoldFor;

        public Piano(String material, String colour, InstrumentType type, int numberOfKeys, int priceBoughtFor, int priceSoldFor) {
        super(material, colour, type);
        this.numberOfKeys = numberOfKeys;
        this.priceBoughtFor = priceBoughtFor;
        this.priceSoldFor = priceSoldFor;
    }

    @Override
    public String play() {
        return "Piano Sound";
    }

    @Override
    public double calculateMarkup() {
        return (priceSoldFor - priceBoughtFor)/priceBoughtFor;
    }

//    markup - profit margin / unitprice

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public int getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public int getPriceSoldFor() {
        return priceSoldFor;
    }
}


//can play and can sell