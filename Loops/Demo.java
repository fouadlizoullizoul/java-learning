public class Demo{
    public static void main(String[] args){
        int countdown =3;
        while(countdown > 0){
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");

        //Do while Loop
        int i = 3;
        do{
            System.out.println("Hi"+i);
            i++;
        }while(i<=4);
        int sum = 0;
        for(int i =1; i<=5;i++){
            sum = sum +i ;
        }
         System.out.println("sum is " + sum);

        //For Loop
        for (int i =1 ; i <= 2 ;i++){
            System.out.println("Outer" +i);
            for(int j =1 ;j<=3;j++){
                System.out.println("Inner" + j);
            }
        }

        for(int i = 1; i <= 5; i++){
            if(i == 4){
                continue;
            }
            System.out.println("Hi" + i);
        }
        int j = 0;
        while (j<10) {
            System.out.println("Hello" + j);
            j++;
            if(j == 5){
                break;
            }
        }
    }
}