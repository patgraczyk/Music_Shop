package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay {

    private String material;
    private String colour;
    private InstrumentType type;

    public Instrument (String material, String colour, InstrumentType type){
        this.material = material;
        this.colour = colour;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType() {
        return type;
    }
}


//assuming that not all instruments are on sale