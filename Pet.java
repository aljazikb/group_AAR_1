/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aljaz
 */
public class Pet {
    private String name;
    private String type;
    private int age;
    
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }
    
    public String getName() { 
        return name; 
    }
    public String getType() { 
        return type; 
    }
    public int getAge() { 
        return age;
    }

    public void displayPetInfo() {
        System.out.println("- " + name + " (" + type + ", " + age + " yrs)");
    }
}
    

