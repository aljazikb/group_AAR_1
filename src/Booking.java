/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renad
 */
public abstract class Booking {
    protected String clientName;
    protected String date;
    protected String time;

    public Booking(String clientName, String date, String time) {
        this.clientName = clientName;
        this.date = date;
        this.time = time;
    }

    public abstract void displayDetails();
}
    

