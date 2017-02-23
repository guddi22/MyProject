/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.integration;

import java.util.ArrayList;

/**
 *
 * @author Shubha , Payal , Vimala
 * This class SingleVehicleInspectionForAllDatesResults creating a Single Vehicle 
 * Inspection History Details for All the Dates
 */
public class SingleVehicleInspectionForAllDatesResults {

    // TODO fix private / public

    /**
     * ArrayList to store the Data containing single vehicle inspection for Single date.
     */
    public ArrayList<SingleVehicleInspectionForSingleDateResults> singleVehicleInspectionForAllDatesResults = new ArrayList<>();

    /**
     *  This the Constructor method of SingleVehicleInspectionForAllDatesResults class.
     * @param s - ArrayList containing single vehicle inspection data for Single date  
     */
    public SingleVehicleInspectionForAllDatesResults(SingleVehicleInspectionForSingleDateResults s) {
        singleVehicleInspectionForAllDatesResults.add(s);
    }

    /**
     *  This method is used to print the Details in ArrayList called
     *  singleVehicleInspectionForAllDatesResults
     */
    public void printSingleVehicleInspectionForAllDatesResults() {
        for (SingleVehicleInspectionForSingleDateResults s : singleVehicleInspectionForAllDatesResults) {
            s.printSingleVehicleInspectionForSingleDateResults();
        }
    }
}
