/*
Couior Managment System : Solution
AWON ABBAS 
0075-BSCS-2019 (Section C)

Description: in this class detail of admin login is given, method to add human is used
used classes :  CouiorManagment,
*/
package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class Admin {
    private String name, fatherName, CNIC, address, phoneNumber, gender, age;
    private CouriorManagment couriorManagment;

    public Admin(String name, String password, CouriorManagment couriorManagment) {
        this.couriorManagment = couriorManagment;
        if (name.equals("123") && password.equals("123")) {
            while (true) {
                show();
                execute();
            }
        } else {
            System.out.println("****************ERROR************************");
            System.out.println("Invalid Password");
            System.exit(-1);
        }
    }

    private void show() {
        System.out.println("1 Add A new Courior");
        System.out.println("2 Show All courior");
        System.out.println("3 Show completed Courior");
        System.out.println("4 delete A single curior");
        System.out.println("5 for save and exit");
    }

    private void addHuman() {
        System.out.println("Enter name ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Enter father Name");
        fatherName = new Scanner(System.in).nextLine();
        System.out.println("Enter CNIC");
        CNIC = new Scanner(System.in).nextLine();
        System.out.println("Enter Phone Number");
        phoneNumber = new Scanner(System.in).nextLine();
        System.out.println("Enter gender ");
        gender = new Scanner(System.in).nextLine();
        System.out.println("Enter age");
        age = new Scanner(System.in).nextLine();
        System.out.println("Enter address");
        address = new Scanner(System.in).nextLine();
    }

    private void execute() {
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                addHuman();
                System.out.println("ADD SENDER");
                sender Sender = new sender(name, fatherName, CNIC, address, phoneNumber, gender, age);
                System.out.println("Add reciever");
                addHuman();
                receiver Receiver = new receiver(name, fatherName, CNIC, address, phoneNumber, gender, age);
                System.out.println("set  a number ");
                int num = new Scanner(System.in).nextInt();
                System.out.println("Enter Year MONTH day");
                couriorManagment.addCurior(new Courior(Sender, Receiver, LocalDate.of(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt()), num));

                break;
            case 2:
                couriorManagment.showAll();
                break;

            case 3:
                couriorManagment.showCOmpletedOrder();
                break;
            case 4:
                System.out.println("Enter number or ID");
                couriorManagment.completedOrder(new Scanner(System.in).nextInt());
                break;
            case 5:
                try {
                    new ObjectOutputStream(new FileOutputStream("DATA")).writeObject(couriorManagment);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.exit(0);

        }

    }
}
