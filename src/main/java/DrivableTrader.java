/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.ArrayList;

public class DrivableTrader extends Trader<Drivable> {

    public DrivableTrader(ArrayList<Drivable> inventory, ArrayList<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int money) {
        super(new ArrayList<Drivable>(), new ArrayList<Drivable>(), money);
    }

    public int getSellingPrice(Drivable object) {
        if (object instanceof Tradable) {
            return ((Tradable) object).getPrice() + object.getMaxSpeed();
        } else {
            return Tradable.MISSING_PRICE;
        }
    }
}
