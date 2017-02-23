/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.model;

import se.kth.sda.vehicleinspection.DTO.CustomerDTO;

/**
 *
 * @author - Shubha , Payal , Vimala
 * This class InspectionReceipt is for printing the Inspection Receipt
 */
public class InspectionReceipt extends Receipt {

    private InspectionResult result;
    private CustomerDTO customer;

    /**
     * This method is the Constructor of InspectionReceipt class
     * @param inspectionResult - Contains the Inspection Result
     * @param customer - Contains the customer Details
     */
    public InspectionReceipt(InspectionResult inspectionResult, CustomerDTO customer) {
        this.customer = customer;
        this.result = inspectionResult;
    }

    /**
     * This method is used to generate the Inspection Receipt
     */
    public void generateReceipt() {
        System.out.println("=================\nInspection Receipt\n");
        System.out.println("Customer Name: " + customer.getName());
        result.printInspectionResult();
        System.out.println("\n=================");
    }

}
