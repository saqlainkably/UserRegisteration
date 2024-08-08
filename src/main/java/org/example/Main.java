package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name");
        String fName=sc.next();
        String pattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(fName);
        System.out.println(matcher.matches());


        System.out.println("Enter last name");
        String lName=sc.next();
        Matcher matcher2 = compiledPattern.matcher(lName);
        System.out.println(matcher2.matches());

    }
}