/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.integration;

import java.io.IOException;
import se.kth.sda.vehicleinspection.DTO.CustomerDTO;
import se.kth.sda.vehicleinspection.DTO.VehicleDTO;
import java.util.HashMap;
import java.util.Map.Entry;
import se.kth.sda.vehicleinspection.DTO.AddressDTO;

/**
 *  @author - Shubha , Payal , Vimala
 *  This class VehicleRegistry contains methods to check Vehicle exist in Registry 
 *  create new Vehicle Registry and Print Vehicle Registry.
 */
public class VehicleRegistry {

    public static final HashMap<VehicleDTO, CustomerDTO> vehicleRegistry = new HashMap<>();

    /**
     * This method checks if the Vehicle exist in Registry,if not new Vehicle Registry
     * is created for the New Vehicle and Customer Details
     * @param vehicleDTO - Contains the Vehicle Details.
     * @param customerDTO - Contains the Customer Details.
     * @exception - Vehicle does not exist in Registry.
     */
    public static void ensureVehicleExistsInRegistry(VehicleDTO vehicleDTO, 
        CustomerDTO customerDTO) throws Exception {
        
         VehicleDTO vehicleDTO1 = new VehicleDTO("AOH 1254", "Car", "VOLVO", "SUV", "BLACK");
         VehicleDTO vehicleDTO2 = new VehicleDTO("AOH 2458", "Car", "VOLVO", "SUV", "BLUE");
         VehicleDTO vehicleDTO3 = new VehicleDTO("AOH 3245", "Car", "VOLVO", "SUV", "RED");
         AddressDTO addressDTO = new AddressDTO("Vidangsvage", "Stockholm", "16735", "Stockhlm", "Sweden");
         CustomerDTO customerDTO1 = new CustomerDTO("CustPay 234LK", "Vimala", addressDTO,
                "9873645344", "user@yahoo.com");
         
         
         VehicleRegistry.vehicleRegistry.put(vehicleDTO1, customerDTO1);
         VehicleRegistry.vehicleRegistry.put(vehicleDTO2, customerDTO1);
         VehicleRegistry.vehicleRegistry.put(vehicleDTO3, customerDTO1);
         
        System.out.println("Check if vehicle was serviced in the garage before" + "");
        printVehicleRegistry();

        // if (!(VehicleRegistry.vehicleRegistry.containsKey(vehicleDTO))) 
        //     throw new IOException(" Vehicle Details does not exist in Registry. ");

         if (!(VehicleRegistry.vehicleRegistry.containsKey(vehicleDTO))) {
            createNewVehicleEntry(vehicleDTO, customerDTO);
         }
    }
    

    /**
     * This method creates new Vehicle Entry in Vehicle Registry.
     * @param vehicleDTO - Contains the Vehicle Details.
     * @param customerDTO - Contains the Customer Details.
     */
    public static void createNewVehicleEntry(VehicleDTO vehicleDTO, CustomerDTO customerDTO) {
        VehicleRegistry.vehicleRegistry.put(vehicleDTO, customerDTO);
        System.out.println("Vehicle regisrty created successfully");
        printVehicleRegistry();
    }

    /**
     * This method prints the Vehicle Registry Details
     */
    public static void printVehicleRegistry() {
        for (Entry<VehicleDTO, CustomerDTO> entry : vehicleRegistry.entrySet()) {
            String key = entry.getKey().getNumber();
            String value = entry.getValue().getName();
            System.out.println("Vehicle Number: " + key + " Customer Name: " + value);
        }
    }
}
