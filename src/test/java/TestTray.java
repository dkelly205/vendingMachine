import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTray {

    private Tray tray;

    @Before
    public void setUp() throws Exception {
        //arraylist should be empty to start so don't need it initialize it
        //pass price in initally and capacity
        tray = new Tray(0.50, 10);
    }


    //check trays have a price
    @Test
    public void testTrayPrice() {
        assertEquals(0.50, tray.getPrice(), 0.01);
    }

    //check trays report the number of items they contain

    @Test
    public void testStockLevelInitiallyZero(){
        assertEquals(0, tray.getStockLevel());
    }

    // check we can add item to tray

    @Test
    public void testCanAddItem(){
        Drink drink = new Drink("Ice Tea", 500);
        tray.addItem(drink);
        assertEquals(1, tray.getStockLevel());
    }

    //check we can remove item from tray

    @Test
    public void testTrayEjectsItem() {
        Drink drink1 = new Drink("Ice Tea", 500);
        Drink drink2 = new Drink("Ice Tea", 500);
        tray.addItem(drink1);
        tray.addItem(drink2);

//        Drink ejectedDrink = (Drink) tray.ejectProduct();   //(Drink) that is called casting, converting a Product to Drink
//       or we could do this

        Product ejectedProduct = tray.ejectProduct();

        assertEquals(drink1, ejectedProduct);
    }


    //check that we can't add items beyond a tray's capacity


    @Test
    public void testTrayCapacityCannotBeBreached() {
        for(int i = 0; i < 11; i++){
            Drink drink = new Drink("Irn Bru", 333);
            tray.addItem(drink);
        }

        assertEquals(10, tray.getStockLevel());
    }
}
