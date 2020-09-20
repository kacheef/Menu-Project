/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuProject;
import java.util.Scanner;
import java.util.*;  
/**
 *
 * @author kacheef
 */
public class Menu1{
    // Prints available item on the menu for each option
    static void printMenu(int option){

        
        
        switch(option){
            //prints meat options
            case 0:
                System.out.println("Mudway Restaurant");
                System.out.println("Menu List");
                System.out.println(" Select Your Meat ");
                System.out.println("1. Tuna ");
                System.out.println("2. Beef");
                System.out.println("3. Chicken \n"); 
                break;
                //prints bread options
            case 1:
                System.out.println("Select Your Bread");
                System.out.println("4. Whole Grain ");
                System.out.println("5. Italian");
                System.out.println("6. Plain White\n");
                break;
                //prints cheese options
            case 2:
                System.out.println("Select Your Cheese ");
                System.out.println("7. American ");
                System.out.println("8. Feta");
                System.out.println("9. Cheddar\n");
                break;
                //prints drink options
            case 3:
                System.out.println("Select Your Drink");
                System.out.println("10. Sprite");
                System.out.println("11. Pepsi");
                System.out.println("12. Coke");
                break;
            default:
                System.out.println("There is an error");
                
        }
        

        System.out.println("0. Exit Menu\n");
        System.out.println("Type The Number");
        
    }
    //add selected choice to vector and print what was added
    static int selectItem(int choice, Vector order, int option){
        
        //Meat Menu Choices
        if (option == 0){
            switch (choice){    
                case 1:     
                    System.out.println("Tuna Added");
                    order.addElement("Tuna");
                    
                    break;
                case 2:     
                    System.out.println("Beef Added");
                    order.addElement("Beef");
                  
                    break;
                case 3:     
                    System.out.println("Chicken Added");
                    order.addElement("Chicken");
                    
                    break;
            default:
                    System.out.println("Invalid entry. Please try again");  
                    option--;
            }
            
        }
        //Bread Menu
        if (option ==1){
            switch (choice){
            case 4:     
                    System.out.println("Whole grain Added");
                    order.addElement("Whole Grain");
                   
                    break;
            case 5:     
                    System.out.println("Italian Added");
                    order.addElement("Italian");
                    
                    break;
            case 6:     
                    System.out.println("Plain White Added");
                    order.addElement("Plain White");
                    
                    break;
            default:
                    System.out.println("Invalid entry. Please try again");  
                    option--;   
            }
        }      
        //Cheese Menu
        if (option ==2){
            switch (choice){
               case 7:     
                    System.out.println("American Added");
                    order.addElement("American");
                    break;
                case 8:     
                    System.out.println("Feta Added");
                    order.addElement("Feta");
                    break;
                case 9:     
                    System.out.println("Cheddar Added");
                    order.addElement("Cheddar");
                    break; 
                default:
                    System.out.println("Invalid entry. Please try again");  
                    option--;
            }        
        }            
        //Drink Menu 
        if (option ==3){
            switch (choice){        
                case 10:     
                    System.out.println("Sprite Added");
                    order.addElement("Sprite");
                    break;
                case 11:     
                    System.out.println("Pepsi Added");
                    order.addElement("Pepsi");
                    break;
                case 12:     
                    System.out.println("Coke Added");
                    order.addElement("Coke");
                    break;
               default:
                    System.out.println("Invalid entry. Please try again");  
                    option--;    
            }  
            System.out.println("\n Your order is: "); 
            
             // prints all item added to order
             Enumeration e = order.elements(); 
             while (e.hasMoreElements()) 
                System.out.println(e.nextElement());  
        }
       
        if(choice==0){
            //if the menu is exited before order is complete
            if (order.size()<4){
                System.out.println("The menu is incomplete");
                 
            }
            else{
                System.out.println("\n Your order is: "); 
            }
             // prints all item added
            Enumeration e = order.elements(); 
            while (e.hasMoreElements()) 
                System.out.println(e.nextElement());         
        }
        return option;
    }
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner input= new Scanner(System.in);
      
        int menu=100;
        //initializing total Payout
        double total=0.00;
        //print menu
        int options=0;
        
        //begins loop to accept order
        int count=0;
        Vector <String> orders = new Vector <String>();
        while(menu!=0 &&options<4){
            printMenu(options);
            menu=input.nextInt();
            options=selectItem(menu,orders,options);
            options++;
        }
        
        
    }
    
}
