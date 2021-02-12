import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        WorkingDay();
        //LevelOfExam();
        //MultipleCalculation();
    }

    static void WorkingDay(){
        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter the day");
        int dayNo= input.nextInt();

        switch (dayNo){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It is a working day");
                break;

            case 6:
            case 7:
                System.out.println("It is a holiday");
                break;

            default:
                System.out.println(" Please enter the correct day number from 1-7");
        }
    }

    static void LevelOfExam(){
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Please enter you exam level ");
        char yourGrade = scanner.next().charAt(0);
        yourGrade = Character.toUpperCase(yourGrade);


        switch (yourGrade){

            case 'A':
            case 'B':
                System.out.println(" Perfect! You are clever!");
                break;

            case 'C':
                System.out.println(" Good! But you can do better!");
                break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                break;
            case 'F':
                System.out.println(" Fail! You need to repeat the exam!");
                break;
            default:
                System.out.println(" Please enter the right exam level ");
                break;

        }

    }

    static void MultipleCalculation(){
        Scanner input= new Scanner(System.in);
        System.out.println(" Please enter the first and the second value ");
        double num1 = input.nextInt();
        double num2=input.nextInt();

        Scanner scanner= new Scanner(System.in);
        System.out.println(" Please enter the option ");
        System.out.println("a. ‘+’ sum both elements;\n" +
                "b. ’-’: do subtraction;\n" +
                "c. ’/’: do dividing;\n" +
                "d. ‘*’: do multiplication;\n" +
                "e. ‘%’: get remainder when the first element is divided by the second element;\n" +
                "f. ‘p’: print out both elements;\n" +
                "g. ‘b’: verify which element is bigger;\n" +
                "h. ‘s’:verify which element is smaller");
        char option = scanner.next().charAt(0);


        switch (option){
            case 'a':
                System.out.println((num1+num2));
                return;
            case 'b':
                System.out.println((num1-num2));
                return;
            case 'c':
                System.out.println((num1/num2));
                return;
            case 'd':
                System.out.println((num1*num2));
                return;
            case 'e':
                System.out.println((num1%num2));
                return;
            case 'f':
                System.out.println(num1+ ";"+ num2);
                return;
            case 'g':
                System.out.println((Math.max(num1,num2)));
                return;
            case 'h':
                System.out.println((Math.min(num1,num2)));
                return;
        }
    }
}
