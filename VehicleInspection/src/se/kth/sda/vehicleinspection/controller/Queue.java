/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.sda.vehicleinspection.controller;

/**
 * @author - Shubha , Payal , Vimala
 * The Queue class contains the Queue number and the method for
 * incrementing next Queue number.
 * 
 */
public class Queue {

    private int number;

    /**
     * Queue Constructor 
     */
    public Queue() {
        number = 0;
    }

    /**
     * This is method to Increament Queue number
     * @return Integer value of Incremented number.
     */
    public int incrementQueueNumber() {
        number++;
        return number;
    }
}
