
class inf{
    public static void main(String[] args){
        String name ="Fouad";
        String lname = "Lizoul";
        int age = 21;
        float salry = 900.1f;
        System.out.println("Your name is " + name + " " + lname + " and your age is " + age + " and your salry is " + salry);
        int nums[][] =new int[3][];
        nums[0]=new int[3];
        nums[1]=new int[4];
        nums[2]=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random() *10);
            }
        }
        for(int n[] : nums){
            for(int m:n){
                System.out.println(m + " ");
            }
            System.out.println();
        }

        
    }
} 
    

