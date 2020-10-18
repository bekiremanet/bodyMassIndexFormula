import java.util.Scanner;

public class miniWorks {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your height (cm): ");

        double height = scan.nextDouble() / 100;

        System.out.println("Please enter your weight (kg): ");

        int weight = scan.nextInt();

        double index = weight / (height*height);

        if (index>0 && index<18.4){
            System.out.println("You're underweight. Your body mass index: " + index + " BMI");
        }

        else if (index>18.4 && index<24.9){
            System.out.println("You're normal. Your body mass index: " + index + " BMI");
        }

        else if (index>24.9 && index<29.9){
            System.out.println("You're fat. Your body mass index: " + index + " BMI");
        }

        else if (index>29.9 && index<100){
            System.out.println("You're absolutely fat. Your body mass index: " + index + " BMI");
        }

        else {
            System.out.println("Please enter a true value");
        }
    }


}
