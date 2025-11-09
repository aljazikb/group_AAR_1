/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renad
 */
public class GroomingBooking extends Booking {
    
 private String petType;

    public GroomingBooking(String clientName, String date, String time, String petType) {
        super(clientName, date, time);
        this.petType = petType;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Grooming Appointment ---");
        System.out.println("Client: " + clientName);
        System.out.println("Pet Type: " + petType);
        System.out.println("Date: " + date + " | Time: " + time);
    }   
}
