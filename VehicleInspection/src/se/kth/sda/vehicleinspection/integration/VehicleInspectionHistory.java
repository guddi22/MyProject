/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.integration;

import java.util.HashMap;
import java.util.Map.Entry;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;

/**
 *
 * @author Shubha , Payal , Vimala
 * This class VehicleInspectionHistory contains methods to get Vehicle Inspection 
 * History.
 */
public class VehicleInspectionHistory {

    private static HashMap<VehicleDTO, SingleVehicleInspectionForAllDatesResults> allVehiclesHistory = new HashMap<>();

    /**
     * This method is used to Check if Inspection History Exist for a Vehicle ID
     * @param vehicleDTO - Contain the Vehicle Details to be Inspected
     * @return - Gives Vehicle Inspection Details for All Dates in Inspection History 
     */
    public static SingleVehicleInspectionForAllDatesResults checkIfInspectionHistoryExists(VehicleDTO vehicleDTO) {
        return allVehiclesHistory.get(vehicleDTO);
    }

    /**
     * This method is used to get Latest Inspection Results for given Vehicle details.
     * @param vehicleDTO - Contains the vehicle Detail to be Inspected
     * @return - Gives Vehicle Inspection Details for Single Date,
     */
    public static SingleVehicleInspectionForSingleDateResults getLatestInspectionResults(VehicleDTO vehicleDTO) {
        SingleVehicleInspectionForAllDatesResults r = checkIfInspectionHistoryExists(vehicleDTO);
        if (r != null) {
            return r.singleVehicleInspectionForAllDatesResults.get(
                    r.singleVehicleInspectionForAllDatesResults.size() - 1);
        } else {
            return new SingleVehicleInspectionForSingleDateResults();
        }
    }

    /**
     * This method is used to Commit the New Inspection Results.
     * @param vehicleDTO - Contains the Vehicle Details to be Inspected.
     * @param singleVehicleInspectionForAllDatesResults - Contains the Vehicle Inspection Details
     * of All Dates in Inspection History.
     */
    public static void commitNewInspectionResults(VehicleDTO vehicleDTO, SingleVehicleInspectionForAllDatesResults singleVehicleInspectionForAllDatesResults) {
        allVehiclesHistory.put(vehicleDTO, singleVehicleInspectionForAllDatesResults);
        printAllVehicleHistory();
    }

    /**
     * This method is used to Print the Single Vehicle History for all dates. 
     */
    public static void printAllVehicleHistory() {
        for (Entry<VehicleDTO, SingleVehicleInspectionForAllDatesResults> entry : allVehiclesHistory.entrySet()) {
            String vehicleNumber = entry.getKey().getNumber();
            System.out.println(vehicleNumber);
            entry.getValue().printSingleVehicleInspectionForAllDatesResults();
        }
    }
}
