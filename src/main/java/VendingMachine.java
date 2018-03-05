import java.util.HashMap;

public class VendingMachine {

    private double credit;
    HashMap<Selection, Tray> products;
    double cash;


    public VendingMachine(HashMap<Selection, Tray> products, double cash) {
        this.products = products;
        this.cash = cash;
        this.credit = 0.00;
    }


    public double getCredit() {
        return credit;
    }

    public double getCash() {
        return cash;
    }

    public void addMoney(double amountEntered){
        credit += amountEntered;
    }

    public double giveRefund() {
        //figure out how much credit there is in the machine
        double refundAmount = credit;

        //Reset Credit variable
        credit = 0;

        //return that amount back out of the function
        return refundAmount;
    }
}
