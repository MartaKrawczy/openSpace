package iceCreamShop;

import java.util.Scanner;

 class CashBox {


     static void main(String[] args) {
        PriceList iceCream = new PriceList();
        Scanner scan = new Scanner(System.in);
        int quntityOfIce = scan.nextInt();
        int coneWaffle= scan.nextInt();
        int balance =  iceCream.iceCreamCost(quntityOfIce,Taste.CHOCOLATE,coneWaffle);
        iceCream.getTotalAccount(balance);
    }

}
