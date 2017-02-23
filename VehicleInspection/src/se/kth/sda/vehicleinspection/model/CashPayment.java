/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.model;

    /**
     *
     * @author - Shubha , Payal , Vimala
     *  This class CashPayment is used to deal with the Cash Transaction when Payment mode 
     * is cash and implements Payment interface.
     */
public class CashPayment implements Payment {

    public Float amount;
    public Float paidAmount;

    /**
     * This method is Constructor of CashPayment class.
     * @param amount - Amount of Inspection Cost 
     * @param paidAmount - Amount paid by Customer
     */
    public CashPayment(Float amount, Float paidAmount) {
        System.out.println("Cash payment started");
        this.amount = amount;
        this.paidAmount = paidAmount;
        calculateChange();
    }

    /**
     * This method is used to Calculate the Change.
     * @return - Gives the change amount in Float format.
     */
    public float calculateChange() {
        float changeAmt;
        changeAmt = paidAmount - amount;
        System.out.println("You paid: " + paidAmount);
        System.out.println("Total inspection cost: " + amount);
        System.out.println("Change: " + changeAmt);
        return changeAmt;
    }

    /**
     * This is Override method to Perform Payment Transaction
     * @return - Give the information whether the Transaction was successful or 
     *  not in boolean format.
     */
    @Override
    public boolean performTransaction() {
        System.out.println("Doing Cash Transaction");
        System.out.println("Cash Transaction approved");
        return true;
    }

    /**
     * This is Override method to get the Payment Message
     * @return - Gives the Payment message in String format.
     */
    @Override
    public String getPaymentMessage() {
        return "Thanks for paying by cash: " + amount;
    }
}
