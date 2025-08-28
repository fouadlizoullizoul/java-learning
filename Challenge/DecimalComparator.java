public class DecimalComparator {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1236, 3.123));
        System.out.println(areEqualByThreeDecimalPlaces(3.012, 3.012));
        
    };
    
    public static boolean areEqualByThreeDecimalPlaces (double num1 , double num2){
        long firstNum = (long) (num1 * 1000);
        long secondNum = (long) (num2 * 1000);
        return firstNum == secondNum;
    }
}   
