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

    public void addToStock(ISell product){
        stock.add(product);
    }

    public void removeFromStock(ISell product){
        stock.remove(product);
    }

//    calculate all potential profit
//    for each item in ISell add MARKUP

    public double calculatePotentialProfit(){
        double totalProfit = 0;
        for (ISell product : stock){
            totalProfit += product.calculateMarkup();
        }
        return totalProfit;

    }

}

//has an array of items of type ISell
//


//    double weightTotal = 0;
//        for(PieceOfRubbish pieceOfRubbish : allRubbish ){
//                weightTotal += pieceOfRubbish.getWeight();
//                }
//                return weightTotal;
//                }