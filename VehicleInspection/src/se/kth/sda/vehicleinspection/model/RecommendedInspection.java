/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.model;

import java.util.HashSet;
import java.util.Set;
import se.kth.sda.vehicleinspection.DTO.InspectionParts;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;
import se.kth.sda.vehicleinspection.integration.VehicleInspectionHistory;

/**
 *
 * @author - Shubha , Payal , Vimala
 * This class RecommendedInspection gets Recommended Inspection Details.
 */
public class RecommendedInspection {

    private Set<InspectionParts> recommendedInspectionParts;

    /**
     * This method is used to get the Recommended Inspection Parts
     * @return - Gives Recommended Inspection Parts.
     */
    public Set<InspectionParts> getRecommendedInspectionParts() {
        return recommendedInspectionParts;
    }

    /**
     * This method is Constructor of RecommendedInspection class.
     * @param ip - Contains the Recommended Inspection Parts.
     */
    public RecommendedInspection(Set<InspectionParts> ip) {
        recommendedInspectionParts = ip;
    }

    /**
     * This method is to get Recommended Inspection for given Vehicle Information
     * @param vehicleDTO - Contains the Vehicle Details
     * @return - Gives the Recommended Inspection Details.
     */
    public static RecommendedInspection getRecommendedInspections(VehicleDTO vehicleDTO) {
        Set<InspectionParts> prevFailures
                = VehicleInspectionHistory.getLatestInspectionResults(vehicleDTO).getFailedInspections();
        if (prevFailures.isEmpty()) {
            return createDefaultRecomendedInspections();
        }
        return new RecommendedInspection(prevFailures);
    }

    /**
     * This method creates Default Recommended Inspection Details if the Vehicle has
     * no History of Inspection.
     * @return - Gives the Default Recommended Inspection.
     */
    public static RecommendedInspection createDefaultRecomendedInspections() {
        Set<InspectionParts> s = new HashSet<>();
        for (InspectionParts p : InspectionParts.values()) {
            s.add(p);
        }
        return new RecommendedInspection(s);
    }

    /**
     * This method is used to print the Recommended Inspection Details
     */
    public void print() {
        System.out.println("Recommended inspections for your vehicle:");
        for (InspectionParts p : recommendedInspectionParts) {
            System.out.println(p);
        }
    }

}
