import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;   
        int sum = 0;

        do  {
            System.out.println("Enter number #" + count + ":");
            String nextNumber = scanner.nextLine();
            try{
                int number = Integer.parseInt(nextNumber);
                count++;
                sum += number;
            }catch(NumberFormatException e){
                System.out.println("Invalid number");
            }
            
        }while(count <= 5);

        System.out.println("The sum of the numbers is: " + sum);
    }
}
