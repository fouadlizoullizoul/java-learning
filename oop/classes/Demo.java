
class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}
class Info {
    public void sayHi(String name ,  String lastName, int Age ){
        System.out.println("Name : " + name + " " + "Last Name " + lastName + " " + "Age : " + Age);
    }
}

public class Demo {
    public static void main(String[] args) {
        int k = 10;
        int l = 20;
        Calculator c = new Calculator();
        int result = c.sum(k, l);
        System.out.println(result);
        Info i = new Info();
         i.sayHi("Fouad", "Lizoul" , 20);
        
    }

}
