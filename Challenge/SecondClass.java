public class SecondClass {
    public static void main(String[] args) {
        int highScorePostion=calculateHighScorePosition(1500);
        displayHighScorePostion("Tim",highScorePostion);

        highScorePostion=calculateHighScorePosition(1000);
        displayHighScorePostion("Kari",highScorePostion);

        highScorePostion=calculateHighScorePosition(500);
        displayHighScorePostion("Joe",highScorePostion);

        highScorePostion=calculateHighScorePosition(100);
        displayHighScorePostion("Piter",highScorePostion);

        highScorePostion=calculateHighScorePosition(25);
        displayHighScorePostion("Hary",highScorePostion);
    }



    public  static void displayHighScorePostion(String playerName,int playerPostion){
        System.out.println(playerName +  " managed to get into postion " + playerPostion + " on the high score list");
    };
    public  static  int calculateHighScorePosition(int playerScore ){
        if(playerScore >=1000){
            return  1;
        } else if (playerScore >=500) {
            return  2;
        } else if (playerScore >=100) {
            return  3;
        }
        return 4;
    }
}
