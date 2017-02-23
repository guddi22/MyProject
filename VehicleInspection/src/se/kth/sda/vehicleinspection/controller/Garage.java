/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.controller;

/**
 *
 * @author - Shubha , Payal , Vimala
 * This Garage class contains garage methods for Next Customer and 
 * open,close garage door.
 */
public class Garage {

    private Queue queue;
    private Boolean door;

    /**
     * Garage Constructor
     */
    public Garage() {
        queue = new Queue();
        openDoor();
    }

    /**
     * This method is to get the next Customer queue number
     * @return - Returns integer queue number. 
     */
    public int nextCustomer() {
        return (queue.incrementQueueNumber());
    }

    /**
     * This method open Door for the customer.
     */
    public void openDoor() {
        this.door = true;
    }

    /**
     * This method closes Door after customer is inside.
     */
    public void closeDoor() {
        this.door = false;
    }
}
