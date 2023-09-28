/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisoner_student_7_5_e2;

/**
 *
 * @author Dell 7300
 */
public class Cell {
    private String name;
    private boolean isDoorOpen;

    // Two-argument constructor for Cell class
    private Cell(String name, boolean isDoorOpen) {
        this.name = name;
        this.isDoorOpen = isDoorOpen;
    }
     // Getter for cellName
    public String getname() {
        return name;
    }

    // Setter for cellName
    public void setname(String cellName) {
        this.name = name;
    }

    // Getter for isDoorOpen
    public boolean isDoorOpen() {
        return isDoorOpen;
    }

    // Setter for isDoorOpen
    public void setDoorOpen(boolean doorOpen) {
        isDoorOpen = doorOpen;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "cellName='" + name + '\'' +
                ", isDoorOpen=" + isDoorOpen +
                '}';
    }
}
