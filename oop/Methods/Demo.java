
class Computer {
    public void playMusic() {
        System.out.println("Music Playing...");
    }
    public String getMeApen(int cost){
        if(cost <10){
            return "You can Not pay it";
        }else{
            return "Take the Pen";
        }
        
    }
}
class Cars{
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
      }
}
class Demo {   
    public static void main(String[] args) {
       Computer c =new Computer();
       c.playMusic();
       String str =c.getMeApen(12);
       System.out.println(str);
      Cars car = new Cars();
      car.fullThrottle();
      car.speed(200);
    }
}