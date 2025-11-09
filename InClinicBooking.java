/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aljaz
 */
public class InClinicBooking extends Booking {
    
    private String veterinarianName;

    public InClinicBooking(String clientName, String date, String time, String veterinarianName) {
        super(clientName, date, time);
        this.veterinarianName = veterinarianName;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- In-Clinic Appointment ---");
        System.out.println("Client: " + clientName);
        System.out.println("Vet: " + veterinarianName);
        System.out.println("Date: " + date + " | Time: " + time);
    }
}

