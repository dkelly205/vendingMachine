import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class TestVendingMachine {

    private VendingMachine vending machine;

    @Before
    public void setUp() throws Exception {
        HashMap<Selection, Tray> products = new HashMap<>();

            for(Selection selection:Selection.values()) {

                Tray tray = new Tray(0.50, 10);
                for (int i = 0; i < 5; i++) {
                    Sweet refreshers = new Sweet("Refreshers", 10);
                    tray.addItem(refreshers);
                }

                products.put(selection, tray);
            }

        vendingMachine = new VendingMachine(products, 10.00);
    }


}

