package Instruments;

import Interfaces.ISell;

public class Saxophone extends Instrument implements ISell {

    private int priceBoughtFor;
    private int priceSoldFor;
    private int numOfValves;

    public Saxophone(String material, String colour, InstrumentType type, int priceBoughtFor, int priceSoldFor, int numOfValves) {
        super(material, colour, InstrumentType.BRASS);
        this.priceBoughtFor = priceBoughtFor;
        this.priceSoldFor = priceSoldFor;
        this.numOfValves = numOfValves;
    }

    @Override
    public String play() {
        return "Saxophone Sound";
    }

    @Override
    public double calculateMarkup() {
        return (priceSoldFor - priceBoughtFor)/priceBoughtFor;
    }


    public int getPriceBoughtFor() {
        return priceBoughtFor;
    }

    public int getPriceSoldFor() {
        return priceSoldFor;
    }

    public int getNumOfValves() {
        return numOfValves;
    }
}


//IPlay and I sell