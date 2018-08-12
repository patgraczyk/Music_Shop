package Instruments;

public class Violin extends Instrument {

    private int numOfStrings;

    public Violin(String material, String colour, InstrumentType type, int numOfStrings) {
        super(material, colour, InstrumentType.BRASS);
        this.numOfStrings = numOfStrings;
    }

    @Override
    public String play() {
        return "Violin sound";
    }
}
