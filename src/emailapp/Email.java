package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;

    private int mailboxCapacity = 500;
    private String alternativeEmail;
    private String companySuffix ="company.com";
    private int passwordLength =10;

    // Constructor to receive the first name and last name

    public Email(String firstName,String lastName){

        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName+""+this.lastName);



        // call a method asking for the department - return the department





        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // Call a method that returns a random password

        this.password = randomPassword(passwordLength);

        System.out.println("Your password is" + this.password);

        // combine elements to generate email

        email = firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@" + department+"." + companySuffix;
        System.out.println("Your Email is:" + email);



    }



    // Ask for the department

    private String setDepartment(){

        System.out.println("Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none:\n Enter Department code ");



        Scanner input = new Scanner(System.in);

        int depChoice = input.nextInt();


        input.nextInt();

        if (depChoice ==1){

            return "Sales";


        }

        else if (depChoice==2){

            return "Dev";
        }

        else if (depChoice==3){

            return "Accounting";


        }

        else {

            return "";


        }




    }




    // generate a random password

    private String randomPassword(int length){

        String passwordSet = "ABCDEF";

        char[]password = new char[length];

        for(int i=0;i<length;i++){

          int rand =  (int) (Math.random()* passwordSet.length());
          password[i] = passwordSet.charAt(rand);






        }


        return new String(password);



    }

    // Set the mailbox capacity

    public void setMailboxCapacity(int capacity){

        this.mailboxCapacity = capacity;

    }

    // set the alternative email

    public void setAlternativeEmail (String alternativeEmail){

        this.alternativeEmail = alternativeEmail;

    }


    // change the password


    public void changePassword(String password){

        this.password = password;


    }

    public int getMailboxCapacity(){

        return mailboxCapacity;


    }

    public String getAlternativeEmail(){

        return alternativeEmail;


    }

    public String getPassword(){

        return password;


    }

    public String showInfo(){

        return "DISPLAY NAME :" + firstName + " " +lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY" + mailboxCapacity + "mb";


    }

}
