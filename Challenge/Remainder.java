
public class Remainder {
     public  static void main(String[] args){
        Double Num1 =20.00d;
        Double Num2 =80.00d;
        Double Result=(Num1 + Num2) * 100.00d;
        System.out.println(Result);
        Double theRemainder =Result % 40.00d;
        System.out.println(theRemainder);
        boolean isNotReminder = theRemainder == 0.00 ? true :false;
        System.out.println(isNotReminder);
        if (!isNotReminder) {
            System.out.println("got some remainder");
        }
        }
}
