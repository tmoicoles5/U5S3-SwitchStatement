package partB.ex01;

import java.util.Scanner;

public class IfLight {
    public static String ifLight() {
        String response = "";
        /* Put your code in between these comments : Top */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a color code: ");

        int currentColor = scanner.nextInt();
        if(currentColor ==1){
            response +="Next Traffic Light is green";

        }

        if (currentColor == 3){
            response += "Next Traffic Light is red";
        }
        if (currentColor == 4){
            response+= "Invalid color";
        }

        /* Put your code in between these comments : Bottom */


        return response;
    }


    public static void main(String args[]) {
        String switchOutput = ifLight();
        System.out.println(switchOutput);
    }
}
