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

    //check that we can't add items beyond a tray's capacity


}
