

package ie.atu;
import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.io.*;

public class Employee {

    public String name = "1";
    public String username ="1";
    public String PPS;
    public String userPPS;

    public static void main(String[] args) {

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        if((name.length() > 5) && (name.length() < 22))
        {

        }

        System.out.print("Enter your PPS ");
        String PPS = input.nextLine();
        if(PPS.length() == 6)
        {

        }


        input.close();
    }



}

