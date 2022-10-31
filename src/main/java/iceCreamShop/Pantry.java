package iceCreamShop;

import java.util.Map;

public class Pantry {
    Map<Taste,Integer> tasteQuantity;
    int coneWafflePantry;

    public Map<Taste, Integer> getTasteQuantity(Taste taste, int quntityOfIce) {
        tasteQuantity.remove(taste,quntityOfIce);
        return tasteQuantity;
    }

    public int getConeWafflePantry(int coneWaffle) {
        coneWafflePantry = coneWafflePantry - coneWaffle;
        return coneWafflePantry;
    }


}
