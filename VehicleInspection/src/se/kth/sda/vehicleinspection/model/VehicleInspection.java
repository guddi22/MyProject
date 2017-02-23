/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import se.kth.sda.vehicleinspection.DTO.InspectionParts;
import se.kth.sda.vehicleinspection.DTO.InspectionResults;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.integration.SingleVehicleInspectionForAllDatesResults;
import se.kth.sda.vehicleinspection.integration.SingleVehicleInspectionForSingleDateResults;
import se.kth.sda.vehicleinspection.integration.VehicleInspectionHistory;

/**
 *
 * @author - Shubha , Payal , Vimala
 */
public class VehicleInspection {

    private RecommendedInspection actualInspection;
    VehicleDTO vehicle;
    Random r = new Random();

    /**
     * This method is Constructor of VehicleInspection class
     * @param vehicleDTO - Contains the Vehicle Details
     * @param recommendedInspections - Contains the Recommended Inspection Details.
     */
    public VehicleInspection(VehicleDTO vehicleDTO, RecommendedInspection recommendedInspections) {
        this.actualInspection = recommendedInspections;
        vehicle = vehicleDTO;
    }

    /**
     * This method is used to Perform Inspection.
     * @return - Gives the Inspection performed result.
     */
    public InspectionResult performInspection() {
        Map<InspectionParts, InspectionResults> inspectedParts = new HashMap<>();
        for (InspectionParts p : actualInspection.getRecommendedInspectionParts()) {
            if (r.nextInt(10) < 5) {
                inspectedParts.put(p, InspectionResults.PASS);
            } else {
                inspectedParts.put(p, InspectionResults.FAIL);
            }
        }
        InspectionResult finalResults = new InspectionResult(vehicle, inspectedParts);
        addInspectionResultToVehicleHistory(vehicle, finalResults);
        return finalResults;
    }

    /**
     * This method is used to add Inspection Result to the Vehicle History.
     * @param vehicleDTO - Contains the Vehicle Details.
     * @param inspectionResult - Contains the Inspection Performed Result.
     */
    public void addInspectionResultToVehicleHistory(VehicleDTO vehicleDTO, InspectionResult inspectionResult) {
        SingleVehicleInspectionForSingleDateResults s = inspectionResult.addInspectionResultToVehicleHistory();
        SingleVehicleInspectionForAllDatesResults a = new SingleVehicleInspectionForAllDatesResults(s);
        VehicleInspectionHistory.commitNewInspectionResults(vehicleDTO, a);
    }
}
