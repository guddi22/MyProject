/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.model;

/**
 *
 * @author - Shubha , Payal , Vimala
 * This is Payment Interface for Payment Transaction.
 */
public interface Payment {

    /**
     * This method is used to PerformTransaction
     * @return - Gives success or failed transaction in boolean format.
     */
    public boolean performTransaction();

    /**
     * This is method to get the Payment Message
     * @return - Gives Payment Message in String format.
     */
    public String getPaymentMessage();
}
