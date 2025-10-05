import java.util.Scanner;
public class MinAndMax {
    static public void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       int min = 0;
       int max = 0;
       int loopCount = 0;
       while(true){
        System.out.println("Enter number:");
        String nextNumber = scanner.nextLine();
        try{
            int number = Integer.parseInt(nextNumber);
             if(loopCount == 0 || number < min){
                min = number;
             }
             if(loopCount == 0 || number > max){
                max = number;
             }
             loopCount++;
        }catch(NumberFormatException e){
           break;
        }
       }
       System.out.println("min = " + min + ", max = " + max);
    }

}
