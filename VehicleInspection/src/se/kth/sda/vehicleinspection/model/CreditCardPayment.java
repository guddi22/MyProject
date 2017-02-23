/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.model;

import se.kth.sda.vehicleinspection.DTO.*;
import se.kth.sda.vehicleinspection.integration.*;

/**
 *
 * @author - Shubha , Payal , Vimala
 *  This class CreditCardPayment is used to deal with the Credit Card Transaction 
 *  when Payment mode is Credit card and implements Payment interface.
 */
public class CreditCardPayment implements Payment {

    private CreditCardDTO creditCard;
    private Float cost;

    /**
     * This method is the CreditCardPayment class Constructor.
     * @param creditDTO - Contains the Credit Card Details.
     * @param cost - Contains the Inspection cost to be paid.
     */
    public CreditCardPayment(CreditCardDTO creditDTO, Float cost) {
        creditCard = creditDTO;
        this.cost = cost;
    }

      /**
     * This is Override method to Perform Payment Transaction 
     * by calling the Credit card Authorization
     * @return - Give the information whether the Transaction was successful or 
     *  not in boolean format.
     */
    @Override
    public boolean performTransaction() {
        System.out.println("Credit Payment initiated");
        CreditCardAuthorization creditCardAuthorization = new CreditCardAuthorization();
        creditCardAuthorization.getCreditCardAuthorization(creditCard);
        return true;
    }

       /**
     * This is Override method to get the Payment Message
     * @return - Gives the Payment message in String format.
     */
    @Override
    public String getPaymentMessage() {
        return "Thanks for your credit card payment of: " + cost;
    }
}
