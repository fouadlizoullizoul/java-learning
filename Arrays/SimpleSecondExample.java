
public class SimpleSecondExample {
    public static void main(String[] args) {
        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        // Get the lenght of the array
        int length = ages.length;
        // Create a 'lowest age' variable and assign the first array element of ages to
        // it
        int lowestAge = ages[0];
        // Loop through the elments of the ages array to find the lowest age
        for (int age : ages) {
            if (lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("The lowest age in the array is:" + lowestAge);
    }
}
