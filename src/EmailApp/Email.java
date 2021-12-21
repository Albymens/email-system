package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName, lastName, alternativeEmail, password, email;
    private int mailboxCapacity;
    private String companySuffix = "abc.com";
    private String department;

    //Contructor with fistname, lastname,
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        this.password = setPassword(7);
        this.email = this.firstName + "." + this.lastName + "@" + this.department + "."+ companySuffix;

//        System.out.println(this.firstName + " " + this.lastName);
//        System.out.println("Department => " + department);
//        System.out.println("Your password is "+ password);
    }

    // Set department,
    private String setDepartment(){
        System.out.println("Department Codes\n 1 => Sales\n 2 => Development\n 3 => Accounting\n 4 => None\nEnter Department Code Number");
        Scanner in = new Scanner(System.in);
        int department = in.nextInt();

        if(department == 1){
            return "Sales";
        } else if(department == 2){
            return "Development";
        } else if(department == 3){
            return "Accounting";
        } else {
            return "";
        }
    }

    //Generate random password
    private String setPassword(int length){
       String passwordRange = "ABCDefghIJKLmnopQRSTuvwXYZ0123456789";
       char[] password = new char[length];
       for (int i = 0; i < length; i++ ){
           int randomNumber = (int)(Math.random()*passwordRange.length());
           password[i] = passwordRange.charAt(randomNumber);
       }
       return new String(password);
    }

    //set change password
    public void  changePassword(String password){
        this.password =  password;
    }

    //set mailbox capacity
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    // set an alternative email address
    public void setAlternativeEmail(String alternativeEmail){
        this.alternativeEmail = alternativeEmail;
    }

    //get methods to display name, email and mailbox capacity
    public String displayDetails(){
        return "User Name => " + firstName + " " + lastName +
                "\nEmail => " + email.toLowerCase() +
                "\nMailbox capacity => " + mailboxCapacity;
    }

}
