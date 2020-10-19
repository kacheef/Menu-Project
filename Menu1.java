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
                System.out.println( "Option 0  with meat choices 1-3 not implemented");
                
                break;
                //prints bread options
            case 1:
                System.out.println("Option 1 with bread choices 4-6  not implemented");            
                break;
                //prints cheese options
            case 2:
                System.out.println("Option 2 with cheese choices 7-9 not implemented ");             
                break;
                //prints drink options
            case 3:
                System.out.println("Option 3 with drink choices 10-12 not implemented");
                break;
            default:
                System.out.println("There is an error");
                
        }
        

        System.out.println("0. Exit Menu\n");
        System.out.println("Type The Number of your choice");
        
    }
    //add selected choice to vector and print what was added
    static int selectItem(int choice, Vector order, int option){
        
        //Meat Menu Choices
        if (option == 0){
            switch (choice){    
                case 1:     
                    System.out.println("choice 1 not implemented"); 
                    order.addElement("choice not implemented");
                    
                case 2:     
                    System.out.println("choice 2 not implemented");
                    order.addElement("choice not implemented");
                    break;
                case 3:     
                    System.out.println("choice 3 not implemented");
                    order.addElement("choice not implemented");
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
                    System.out.println("choice 4 not implemented"); 
                    order.addElement("choice not implemented");
                    break;
            case 5:     
                    System.out.println("choice 5 not implemented"); 
                    order.addElement("choice not implemented");
                    break;
            case 6:     
                    System.out.println("choice 6 not implemented"); 
                    order.addElement("choice not implemented");
                    break;
            default:
                    System.out.println("Invalid entry. Please try again"); 
            }
        }      
        //Cheese Menu
        if (option ==2){
            switch (choice){
               case 7:     
                    System.out.println("choice 7 not implemented"); 
                    order.addElement("choice not implemented");
                    break;
                case 8:     
                    System.out.println("choice 8 not implemented"); 
                    order.addElement("choice not implemented");
                    break;
                case 9:     
                    System.out.println("choice 9 not implemented"); 
                    order.addElement("choice not implemented");
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
                    System.out.println("choice 10 not implemented"); 
                    order.addElement("choice not implemented");
                    break;
                case 11:     
                    System.out.println("choice 11 not implemented"); 
                    order.addElement("choice not implemented");
                    break;
                case 12:     
                    System.out.println("choice 12 not implemented"); 
                    order.addElement("choice not implemented");
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
                System.out.println("\n printing order not yet implemented"); 
                
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

