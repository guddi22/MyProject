/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.integration;

import se.kth.sda.vehicleinspection.DTO.CreditCardDTO;

/**
 *
 * @author - Shubha , Payal , Vimala
 * The class CreditCardAuthorization get the CardCredit Detail 
 * authorized by external system.
 */
public class CreditCardAuthorization {

    /**
     * Credit Card Authorization Constructor
     */
    public CreditCardAuthorization() {

    }

    /**
     * This method get Credit Card Authorization by calling external 
     * Authorization System.
     * @param creditCardDTO - Contains the Credit Card Details
     * @return - If authorization is sucessful it returns True 
     *           else if authorization fails it retuns False.
     */
    public boolean getCreditCardAuthorization(CreditCardDTO creditCardDTO) {
        System.out.println("Credit card authorized. Payment approved");
        return true;
    }

}
