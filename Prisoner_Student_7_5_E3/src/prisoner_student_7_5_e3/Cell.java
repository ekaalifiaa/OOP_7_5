/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisoner_student_7_5_e3;

/**
 *
 * @author Dell 7300
 */
public class Cell {
    private String name;
    private boolean isDoorOpen;
    private int securityCode;

    // Two-argument constructor for Cell class
    public Cell(String name, boolean isDoorOpen, int securityCode) {
        this.name = name;
        this.isDoorOpen = isDoorOpen;
        this.securityCode = securityCode;
    }
     // Getter for cellName
    public String getname() {
        return name;
    }

    // Getter for isDoorOpen
    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    // Setter for isDoorOpen with security code check
    public void toggleDoor(int code) {
        if (code == securityCode) {
            isDoorOpen = !isDoorOpen;
            if (isDoorOpen) {
                System.out.println("Door is opened.");
            } else {
                System.out.println("Door is closed.");
            }
        } else {
            System.out.println("Incorrect security code.");
            return;
        }
    }
    @Override
    public String toString() {
        return "Cell{" +
                "Name='" + name + '\'' +
                ", isDoorOpen=" + isDoorOpen +
                '}';
    }
}
