package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell item){
        stock.add(item);
    }

    public boolean removeFromStock(ISell item){
        return stock.remove(item);
    }


}

//has an array of items of type ISell