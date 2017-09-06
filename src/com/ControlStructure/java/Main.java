package com.ControlStructure.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        String input = sc.nextLine();
        double temperature = Double.parseDouble(input);

        if (temperature < 97.5 && temperature > 91.9){
            System.out.println("Temperature is low.");
        }
        else if (temperature > 99.5 && temperature < 104.1){
            System.out.println("Temperature is high.");
        }
        else if (temperature > 97.4 && temperature < 99.6){
            System.out.println("Temperature is normal.");
        }
        else
            System.out.println("Invalid temperature entered. Please enter a value between 92.0 and 104.0.");
    }
}
