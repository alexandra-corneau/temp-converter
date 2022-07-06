package org.example;
import java.util.*;

public class Main {

    public static void start(){
        System.out.println("Which conversion do you need?");
        System.out.println("1. Fahrenheit to Celcius");
        System.out.println("2. Fahrenheit to Kelvin");
        System.out.println("3. Celsius to Fahrenheit");
        System.out.println("4. Celsius to Kelvin");
        System.out.println("5. Kelvin to Fahrenheit");
        System.out.println("6. Kelvin to Celsius");
        System.out.println("7. Exit\n");
    }

    public static float userInput(){
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();
        return input;
    }

    public static void conversion(int option, float temp) {
        float tempConversion;
        switch(option){
            case 1: //Fahrenheit To Celsius
                tempConversion =(float) ((temp - 32) * (5.0 / 9.0));
                System.out.println(temp + "\u00B0F = " + tempConversion + "\u00B0C");
                break;
            case 2: //Fahrenheit To Kelvin
                tempConversion = (float) ((temp-32)*(5.0/9.0) + 273.15);
                System.out.println(temp + "\u00B0F = " + tempConversion + "\u00B0K");
                break;
            case 3: //Celsius To Fahrenheit
                tempConversion = (float) (temp*(9.0/5.0) +32);
                System.out.println(temp + "\u00B0C = " + tempConversion + "\u00B0F");
                break;
            case 4: //Celsius to Kelvin
                tempConversion = (float) (temp + 273.15);
                System.out.println(temp + "\u00B0C = " + tempConversion + "\u00B0K");
                break;
            case 5: //Kelvin to Fahrenheit
                tempConversion = (float) ((temp-273.15)*(9.0/5.0) + 32);
                System.out.println(temp + "\u00B0K = " + tempConversion + "\u00B0F");
                break;
            case 6: //Kelvin to Celsius
                tempConversion = (float) (temp - 273.15);
                System.out.println(temp + "\u00B0K = " + tempConversion + "\u00B0C");
                break;
            default:
                System.out.println("Enter a Valid Number");


        }
    }
    public static void main(String[] args) {
        int conversionOption = 0;
            do {
                try {
                    start();
                    conversionOption = (int) userInput();
                    if (conversionOption < 7) {
                        System.out.println("Input your temperature: ");
                        float temp = userInput();
                        conversion(conversionOption, temp);
                    } else {
                        System.out.println("Enter a valid number\n");
                    }
                } catch(Exception e){
                    System.out.println("Only numbers are accepted!\n");
                }
            } while (conversionOption != 7);

    }
}
