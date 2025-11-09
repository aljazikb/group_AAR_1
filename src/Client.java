/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Renad
 */
public class Client {
    private String name;
    private String email;
    private String phone;
    private String password;
    private ArrayList<Pet> pets;
  
    
    public Client(String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.pets = new ArrayList<Pet>();
    }
    
    public String getName() { 
        return name;
    }
    public String getEmail() { 
        return email; 
    }
    public boolean checkPassword(String pass) { 
        return password.equals(pass); 
    }
    
    
    
    public ArrayList<Pet> getPets() { 
        return pets; }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void displayAccountInfo() {
        System.out.println("\n=== Account Information ===");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Number of pets: " + pets.size());
        System.out.println("--- Pets ---");
        if (pets.isEmpty()) {
            System.out.println("No pets registered.");
        } else {
            for (Pet p : pets) {
                p.displayPetInfo();
            }
        }
        System.out.println("============================");
    }
}


