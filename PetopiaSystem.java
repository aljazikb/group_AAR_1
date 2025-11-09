/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author aljaz
 */

public class PetopiaSystem {
    private static Scanner input = new Scanner(System.in);
    private static ArrayList<Client> clients = new ArrayList<Client>();
    private static ArrayList<Booking> bookings = new ArrayList<Booking>();
    private static Client currentClient = null;
    
    
     public static void main(String[] args) {
         
       mainMenu();
    }
     
    
     
     
   private static void mainMenu() {
    while (true) {  
        
        if (currentClient == null) {
            System.out.println("\nWelcome! What would you like to do?");
            System.out.println("1. Signup");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {
                signup();
            } else if (choice == 2) {
                login();
            } else if (choice == 3) {
                System.out.println("Goodbye, See you next time.");
                break;  
            } else {
                System.out.println("Oops! That’s not a valid choice. Please try again.");
            }

        } else { 
            System.out.println("\nWelcome back, " + currentClient.getName() + "! What would you like to do today?");
            System.out.println("1. View your account information");
            System.out.println("2. Book an In-Clinic Appointment");
            System.out.println("3. Book a Home Visit");
            System.out.println("4. Book a Grooming Appointment");
            System.out.println("5. View all your bookings");
            System.out.println("6. Add a new pet to your account");
            System.out.println("7. Logout");

            System.out.print("Please enter your choice: ");
            int C = Integer.parseInt(input.nextLine().trim());
            
            if (C == 1) {
                currentClient.displayAccountInfo();
            } else if (C == 2) {
                bookInClinic();
            } else if (C == 3) {
                bookHomeVisit();
            } else if (C == 4) {
                bookGrooming();
            } else if (C == 5) {
                viewMyBookings();
            } else if (C == 6) {
                addPetToCurrentUser();
            } else if (C == 7) {
                logout();
            } else {
                System.out.println("Oops! That’s not a valid choice. Please try again.");}}}}

     
    private static void signup() {
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Prevent duplicates
        if (findClientByName(name) != null) {
            System.out.println(" That name is already taken. Try logging in.");
            return; }

        System.out.print("Enter your email: ");
        String email = input.nextLine();
        System.out.print("Enter your phone: ");
        String phone = input.nextLine();
        System.out.print("Create a password: ");
        String password = input.nextLine();

        Client newClient = new Client(name, email, phone, password);
        clients.add(newClient);
        System.out.println(" Account created successfully! You can now log in.");
    }
    
    private static void login() {
        
    System.out.print("Enter your name: ");
    String name = input.nextLine().trim();
    System.out.print("Enter your password: ");
    String pass = input.nextLine().trim();

    Client client = findClientByName(name);
    if (client != null && client.checkPassword(pass)) {
        currentClient = client;
        System.out.println(" Login successful! Welcome, " + currentClient.getName());
    } else {
        System.out.println("Invalid name or password.");
    }
}

    
    private static void logout() {
        System.out.println(" Logged out successfully. Bye " + currentClient.getName() + "!");
        currentClient = null;
    }
    
    /////////////
    private static void bookInClinic() {
        
        System.out.print("Enter the date (MM/DD/YYYY):");
        String date = input.nextLine();
        System.out.print("Enter time: ");
        String time = input.nextLine();
        System.out.print("Enter veterinarian name: ");
        String vet = input.nextLine();

        bookings.add(new InClinicBooking(currentClient.getName(), date, time, vet));
        System.out.println("In-clinic booking created!");
    }
     //////////// 
    private static void bookHomeVisit() {
        
        System.out.print("Enter the date (MM/DD/YYYY):");
        String date = input.nextLine();
        System.out.print("Enter time: ");
        String time = input.nextLine();
        System.out.print("Enter address: ");
        String address = input.nextLine();

        bookings.add(new HomeVisitBooking(currentClient.getName(), date, time, address));
        System.out.println("Home visit booking created!");
    }
    ////////////////  
    private static void bookGrooming() {
        
        System.out.print("Enter the date (MM/DD/YYYY):");
        String date = input.nextLine();
        System.out.print("Enter time: ");
        String time = input.nextLine();
        System.out.print("Enter pet type: ");
        String petType = input.nextLine();

        bookings.add(new GroomingBooking(currentClient.getName(), date, time, petType));
        System.out.println("Grooming booking created!");
    }
    
    
    private static void viewMyBookings() {
       
    
    }
     
    private static void addPetToCurrentUser() {
     
     
    }
    
    
    private static Client findClientByName(String name) {
         
        return null;
    }
    
}
