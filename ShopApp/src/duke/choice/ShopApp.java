/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author topet
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double tax=0.2, total=0.0;
        System.out.println("Welcome to Duke Choise Shop!");
        Costumer c1 = new Costumer();
        c1.name="pinky";
        System.out.println("Name of the client = " + c1.name);
        
        //Create a new instance of class Clothing
        Clothing item1 = new Clothing();
        item1.description="Blue Jacket";
        item1.price=20.9;
        item1.size="M";
        
        Clothing item2 = new Clothing();
        item2.description="Orange T-Shirt";
        item2.price=10.5;
        item2.size="S";
        
        System.out.println("Item1 "+item1.description+", "+item1.price+", "+item1.size);
        System.out.println("Item2 "+item2.description+", "+item2.price+", "+item2.size);
        
        total = (item1.price+item2.price*2)*(1+tax);
        System.out.println("Total = " + total);
        
        
    }
    
}
