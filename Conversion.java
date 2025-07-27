public class Conversion {
    public static void main(String[] args) {

        // Set the maximum possible score in the game th 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 432;

        // Calculate the percentage score

        float percentage = (float) userScore / maxScore * 100.0f;

        System.out.println(percentage);

    }
}
