/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisoner_student_7_5_e3;

/**
 *
 * @author Dell 7300
 */
public class PrisonTest_Student_7_5 {
    public static void main(String[] args){
        Cell cellExample = new Cell("B2", false, 9999); // Membuat objek Cell dengan nama "B2", pintu tertutup (false), dan kode keamanan 1234

        Prisoner_Student_7_5 bubba = new Prisoner_Student_7_5("Bubba", 2.08, 4, 78, cellExample);
        bubba.think();
        bubba.display(true);
        
        System.out.println("Initial Cell Status:");
        System.out.println("Cell Name: " + cellExample.getname());
        System.out.println("Is Door Open: " + cellExample.isDoorOpen());
        // Menggunakan kode keamanan yang benar untuk membuka pintu
        cellExample.toggleDoor(1234);
        // Menggunakan kode keamanan yang salah untuk membuka pintu
        cellExample.toggleDoor(9999);
        
       
        //Prison p01 = new Prisoner();
        //Cell c01 = new Cell();
        //Guard g01 = new Guard();
        
        //p01.name = "Bubba";
        //c01.name = "A1";
        //g01.name = "Boss Man";
        
    }
}
