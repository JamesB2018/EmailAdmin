package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    //Constructor to receive the first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + "" + this.lastName);

        //Call method asking for departmen - return the department
    }

    //Ask for the department
    private String setDepartment() {
        System.out.println("Enter the department\n1 for sales\n2 for development\n3 for Accounting\n0 for none");
        Scanner in = new Scanner(System.in);
        depChoice = in.nextInt();
        if()
    }
}
