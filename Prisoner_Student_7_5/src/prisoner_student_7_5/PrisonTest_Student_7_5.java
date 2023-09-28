/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prisoner_student_7_5;

/**
 *
 * @author Dell 7300
 */
public class PrisonTest_Student_7_5 {
    public static void main(String[] args){
        Cell cellExample = new Cell("B2", false); // Membuat objek Cell dengan nama "B2" dan pintu tertutup (false)

        Prisoner_Student_7_5 bubba = new Prisoner_Student_7_5("Bubba", 2.08, 4, 78, cellExample);
        bubba.think();
        bubba.display(true);
        
        //Prison p01 = new Prisoner();
        //Cell c01 = new Cell();
        //Guard g01 = new Guard();
        
        //p01.name = "Bubba";
        //c01.name = "A1";
        //g01.name = "Boss Man";
        
    }
}
