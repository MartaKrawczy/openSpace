package iceCreamShop;

public class PriceList {

    int priceIce = 2; // one ice cream scoop price
    int priceConeWafle = 1;
    int totalAccount = 1000;

     int iceCreamCost(int quantity,Taste taste, int coneWaffle){
       return quantity*priceIce+coneWaffle*priceConeWafle;
    }

    public int getTotalAccount(int balance) {
        return totalAccount + balance;
    }

}
