/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aljaz
 */
public class HomeVisitBooking extends Booking {
    
    private String address;

    public HomeVisitBooking(String clientName, String date, String time, String address) {
        super(clientName, date, time);
        this.address = address;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Home Visit Appointment ---");
        System.out.println("Client: " + clientName);
        System.out.println("Address: " + address);
        System.out.println("Date: " + date + " | Time: " + time);
    }
} 
