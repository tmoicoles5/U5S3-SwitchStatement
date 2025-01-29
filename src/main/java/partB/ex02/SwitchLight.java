package partB.ex02;

import java.util.Scanner;

public class SwitchLight {
    public static String switchLight(){
        String response = "";

        /* Put your code in between these comments : Top */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a color code :");
        int currentColor = scanner.nextInt();

        switch (currentColor){
            case 1:
                System.out.println("Next Light is Green");
                break;
            case 2 :
                System.out.println("Next Light is Red");
        }


        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        String switchOutput = switchLight();
        System.out.println(switchOutput);
    }
}
