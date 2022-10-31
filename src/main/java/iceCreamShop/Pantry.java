package iceCreamShop;

import java.util.Map;

 class Pantry {
   private Map<Taste,Integer> tasteQuantity;
   private int coneWafflePantry;

    private Map<Taste, Integer> getTasteQuantity(Taste taste, int quntityOfIce) {
        tasteQuantity.remove(taste,quntityOfIce);
        return tasteQuantity;
    }

    private int getConeWafflePantry(int coneWaffle) {
        coneWafflePantry = coneWafflePantry - coneWaffle;
        return coneWafflePantry;
    }


}
