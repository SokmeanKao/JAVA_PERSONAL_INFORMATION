package Practice_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;
public class KaoSokmean_SR_Practice001 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        //input user info
        //input name
        System.out.println("=================== PERSONAL INFORMATION ===================");
        System.out.print("=> Enter name: ");
        String name = scanner.nextLine();
        Pattern patternName = Pattern.compile("[a-zA-Z]+");
        Matcher matcherName = patternName.matcher(name);
        boolean checkName = matcherName.matches();
        System.out.print(checkName ? "" : "Username is wrong. Allow input only text.\n");

        //input age
        System.out.print("=> Enter age: ");
        String age = scanner.nextLine();
        Pattern patternAge = Pattern.compile("\\d+");
        Matcher matcherAge = patternAge.matcher(age);
        boolean checkAge = matcherAge.matches();
        System.out.print(checkAge ? "" : "Age allow input only number.\n");

        //input phone number
        System.out.print("=> Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Pattern patternPhoneNum = Pattern.compile("^0\\d+");
        Matcher matcherPhoneNum = patternPhoneNum.matcher(phoneNumber);
        boolean checkPhoneNum = matcherPhoneNum.matches();
        System.out.print(checkPhoneNum ? "" : "Phone allow input only number and just start with 0.\n");

        //input email
        System.out.print("=> Enter email: ");
        String email = scanner.nextLine();
        Pattern patternEmail = Pattern.compile("^[a-zA-Z]+@[a-zA-Z]+\\.[a-z]{2,4}$");
        Matcher matcherEmail = patternEmail.matcher(email);
        boolean checkEmail = matcherEmail.matches();
        System.out.print(checkEmail ? "" : "wrong format.Example: koko@gmail.com\n");

        scanner.close();

        //Output personal information
        System.out.println("=================== SHOW PERSONAL INFORMATION ===================");
        System.out.println(checkName ? "Name: " + name : "Name: -");
        System.out.println(checkAge ? "Age: " + age : "Age: -");
        System.out.println(checkPhoneNum ? "Phone Number: " + phoneNumber : "Phone Number: -");
        System.out.println(checkEmail ? "Email: " + email : "Email: -");

    }
}
