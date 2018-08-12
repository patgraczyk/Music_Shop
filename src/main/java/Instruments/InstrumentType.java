package Instruments;

public enum InstrumentType {

    WIND ("wind"),
    BRASS ("brass"),
    KEYBOARD ("keyboard");

    private String type;

    InstrumentType( String instrumentType){
        this.type = type;
    }

    public String getInstrumentType() {
        return type;
    }
}
