import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Math math=new Math();
        System.out.println("Please enter first number:");
        int firstNumber=scanner.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber=scanner.nextInt();
        System.out.println("What function would you like to do with your numbers: 1:'+',2:'-',3:'*',4:'/'?");
        int function=scanner.nextInt();
        switch(function){
            case 1:
                int total= math.addition(firstNumber,secondNumber);
                System.out.println("Your result is "+total);
                break;
            case 2:
                int total2=math.subtraction(firstNumber,secondNumber);
                System.out.println("Your result is " +total2);
                break;
            case 3 :
                int total3= math.multiplication(firstNumber,secondNumber);
                System.out.println("Your result is "+total3);
                break;
            case 4:
                int total4= math.division(firstNumber,secondNumber);
                System.out.println("Your result is "+total4);
                break;
            default:
                System.out.println("I don't understand you.");


        }
    }

}
