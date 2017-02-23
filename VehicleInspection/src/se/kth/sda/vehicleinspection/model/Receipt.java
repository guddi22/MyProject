/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.model;

/**
 *
 * @author - Shubha , Payal , Vimala
 */
public class Receipt {
    
    /**
     * This method is Constructor of Receipt class.
     */
    public Receipt(){
        System.out.println(setStandardMessage());
    }

    /**
     * This method prints the standard message of both Payment and Inspection Receipt
     * @return - Gives the message in String format to be Printed.
     */
    public String setStandardMessage() {
        StringBuilder str = new StringBuilder();
        str.append("\n");
        str.append("*******KTH Garage*******");
        str.append("\n");
        str.append("Brinellvägen 8, 114 28 Stockholm");
        str.append("\n");
        str.append("***************************");
        str.append("\n");
        return str.toString();
    }

}
