/*
Couior Managment System : Solution
AWON ABBAS 
0075-BSCS-2019 (Section C)

Description: this is main class the program start from this. this class contain main method
used classes :  CouiorManagment, admin
*/
import controller.Admin;
import controller.CouriorManagment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CouriorManagment couriorManagment = null;
        if(new File("DATA").exists()){
            try {
                couriorManagment= (CouriorManagment) new ObjectInputStream(new FileInputStream("DATA")).readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        else couriorManagment=new CouriorManagment();
        System.out.println("Enter Username");
        String username=new Scanner(System.in).nextLine();
        System.out.println("Enter password");
        String Password=new Scanner(System.in).nextLine();
        new Admin(username,Password,couriorManagment);
    }
}
