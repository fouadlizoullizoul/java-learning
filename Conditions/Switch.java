public class Switch{
    public static void main(String[] args){
       String day = "Monday";
       String result;
        switch(day){
            case "Saturday" , "Sunday" -> result = "10am";
            case "Monday" -> result = "8am";
            default -> result = "7am";
        }
        System.out.println(result);
    }
}