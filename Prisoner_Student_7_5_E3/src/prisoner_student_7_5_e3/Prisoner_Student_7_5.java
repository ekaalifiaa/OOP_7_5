/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prisoner_student_7_5_e3;

/**
 *
 * @author Dell 7300
 */
public class Prisoner_Student_7_5 {
    // Fields
    private String name;
    private double height;
    private int sentence;
    private int prisonerID;
    private Cell cell;

    // Constructor
    public Prisoner_Student_7_5(String name, double height, int sentence, int prisonerID, Cell cell) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.prisonerID = prisonerID;
        this.cell = cell;
    }

    // Methods
    public void think() {
        System.out.println("I'll have my revenge.");
    }
    
    public String getname() {
        return name;
    }
    
    public double getheight() {
        return height;
    }
    
    public int getsentence() {
        return sentence;
    }

    public int getprisonerID() {
       return prisonerID;
    }

    public Cell getcell() {
       return cell;
    }
    
    public void display(boolean b) {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Sentence: " + sentence);
        System.out.println("Prisoner ID: " + prisonerID);
        System.out.println("Cell: " + cell.getname());
    }
    
}
