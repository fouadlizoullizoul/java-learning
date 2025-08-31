public class Convert {
    public  static  void main(String[] args){
        System.out.println("20in = " + convertToCentimeters(20) + "cm");
        System.out.println( "5ft , 8in = "+ convertToCentimeters(5, 8) + "cm");


    }

    public  static  double convertToCentimeters(int inches){
        return  inches * 2.54;
    }
    public  static  double convertToCentimeters(int feet , int inches){
            return  convertToCentimeters((feet * 12) + inches);
    }

}
