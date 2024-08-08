package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String fNameValidate(String fName){
        String pattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(fName);
        if(matcher.matches())
            return "HAPPY";
        else
            return "SAD";
    }
    public static String lNameValidate(String lName){
        String pattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher2 = compiledPattern.matcher(lName);
        if(matcher2.matches())
            return "HAPPY";
        else
            return "SAD";
    }
    public static String emailValidate(String email){
        String pattern2 = "^[a-zA-Z0-9.%+-]+\\.[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
        Pattern compiledPattern2 = Pattern.compile(pattern2);
        Matcher matcher3 = compiledPattern2.matcher(email);
        if (matcher3.matches())
            return "HAPPY";
        else
            return "SAD";
    }
    public static String phoneNumberValidate(String phoneNumber){
        String mobileRegex = "^\\d{2} \\d{10}$";
        Pattern CompiledMobile = Pattern.compile(mobileRegex);
        Matcher matcherPhone =CompiledMobile.matcher(phoneNumber);
        if(matcherPhone.matches())
            return "HAPPY";
        else
            return "SAD";
    }
    public static String passwordValidate(String password){
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d)(?=^[^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/`~]*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/`~][^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/`~]*$).{8,}$";
        Pattern compiledPassword=Pattern.compile(passwordRegex);
        Matcher matchPassword=compiledPassword.matcher(password);
        if(matchPassword.matches())
            return "HAPPY";
        else
            return "SAD";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name");
        String fName=sc.next();
        System.out.println(fNameValidate(fName));


        System.out.println("Enter last name");
        String lName=sc.next();
        System.out.println(lNameValidate(lName));


        System.out.println("Enter the number of emails : ");
        int n=sc.nextInt();
        for (int i=0;i<n;i++) {
            System.out.println("Enter email-id ");
            String email = sc.next();
            System.out.println(emailValidate(email));
        }

        System.out.println("Enter mobile number with country code, space followed by 10 digit number");
        sc.nextLine();
        String phoneNumber=sc.nextLine();
        System.out.println(phoneNumberValidate(phoneNumber));


        System.out.println("Enter password minimum 8 characters, at least 1 uppercase and 1 number and exactly 1 special character");
        String password=sc.nextLine();
        System.out.println(passwordValidate(password));

    }
}