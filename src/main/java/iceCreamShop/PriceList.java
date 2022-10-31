package iceCreamShop;

 class PriceList {

    private int priceIce = 2; // one ice cream scoop price
    private int priceConeWafle = 1;
    private int totalAccount = 1000;

     int iceCreamCost(int quantity,Taste taste, int coneWaffle){
       return quantity*priceIce+coneWaffle*priceConeWafle;
    }

    int getTotalAccount(int balance) {
        return totalAccount + balance;
    }

}
