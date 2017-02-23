/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import se.kth.sda.vehicleinspection.DTO.InspectionParts;
import se.kth.sda.vehicleinspection.DTO.InspectionResults;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.integration.SingleVehicleInspectionForSingleDateResults;

/**
 *
 * @author Shubha , Payal , Vimala
 * This class InspectionResult is to get the Inspection Result and Print Inspection Details
 */
public class InspectionResult {

    private Map<InspectionParts, InspectionResults> inspectionResult = new HashMap<>();
    private VehicleDTO vehicleDTO;

    /**
     * This method is Constructor of InspectionResult class
     * @param vehicle - Contains the Vehicle Details
     * @param inspectedResult - Contains the Inspection Results
     */
    public InspectionResult(VehicleDTO vehicle, Map<InspectionParts, InspectionResults> inspectedResult) {
        this.vehicleDTO = vehicle;
        this.inspectionResult = inspectedResult;
    }

    /**
     * This method is used to Print the Inspection Result.
     */
    public void printInspectionResult() {
        System.out.println("Inspection results of vehicle: " + vehicleDTO.getNumber());
        for (Entry<InspectionParts, InspectionResults> entry : inspectionResult.entrySet()) {
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }
    }

    /**
     * This method is used to add Inspection Result to Vehicle History
     * @return - Gives the Vehicle Inspection Details for Single Date.
     */
    public SingleVehicleInspectionForSingleDateResults addInspectionResultToVehicleHistory() {
        Date date = new Date();
        return new SingleVehicleInspectionForSingleDateResults(date, inspectionResult);
    }

}
