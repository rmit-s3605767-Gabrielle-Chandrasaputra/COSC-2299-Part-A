import Menu.Login;

import java.util.Scanner;

/**
 * Created by Gabrielle on 5/03/2017.
 */
public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Login login = new Login();

        //display main page
        System.out.println("\n+----------------------------------+");
        System.out.println("|           Welcome to the         |");
        System.out.println("|               system             |");
        System.out.println("+----------------------------------+");
        System.out.println("Would you like to login or register an account? (l/r)");
        System.out.print("Enter choice: ");
        String choice = reader.nextLine();


        //infinite loop
        while(true){

            //go to login menu
            if(choice.charAt(0) == 'l'){
                login.loginMenu();
            }

            //go to registration menu
            else if(choice.charAt(0) == 'r'){

            }

            //invalid choice
            else{
                System.out.println("Invalid choice. Try again");
                System.out.println("Enter 'l' to login or 'r' to register an account");
            }
        }




    }
}
