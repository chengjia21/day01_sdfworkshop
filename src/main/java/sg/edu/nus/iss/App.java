package sg.edu.nus.iss;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Scanner scan = new Scanner(System.in);

        System.out.println( "Welcome to your shopping cart" );

        List<String> cart = new ArrayList<String>();

        // Expect input from keyboard
        Console con = System.console();
        String input = "";

        while(!input.equals("quit")){
            input = con.readLine("Type 'help' to show list of commands >>");

            if (input.equals("help")){
                System.out.println("'list' to show list of items in the shopping card");
                System.out.println("'add' <item name>, ...");
                System.out.println("'delete' <item number>");
                System.out.println("'quit' to terminate the program");
            }

            if (input.startsWith("add")){
                input = input.replace(",", " ");
                Scanner scan = new Scanner(input.substring(4));
                String content = "";
                while(scan.hasNext()){
                    content = scan.next();
                    cart.add(content);
                }
            }

            if (input.equals("list")){
                int i = 0;
                for(String item: cart){
                    i++;
                    System.out.println(i + ". " + item);
                }
            }
        
     
        


        // if (cart.size() == 0){
        //     System.out.println("Your cart is empty");
        // } else {
        //     System.out.println(cart.toString());
        // }
        


        if (input.startsWith("delete")){
            Scanner scan = new Scanner(input.substring(6));
            String content = "";
            while (scan.hasNext()){
                content = scan.next();
                int listIndex = Integer.parseInt(content);
                if (listIndex < cart.size()){
                    cart.remove(listIndex);
                } else {
                    System.err.println("Incorrect Item Index");
                }
            }
        }
    }
    System.out.println("Bye Bye!!");
    }
}
