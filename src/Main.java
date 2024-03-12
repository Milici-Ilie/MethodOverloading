public class Main {

    //🚇🚇[METHOD-OVERLOADING]🚇🚇
    public static void main(String[] args) {
//        int newScore = calculateScore("Ilie", 500);
//        System.out.println("New score is " + newScore);// 🚇🚇[METHOD-OVERLOADING]🚇🚇 this one will call the first method
//
//        calculateScore(75);// this one will call the second method
//        calculateScore();

        System.out.println("New score is " + calculateScore("Ilie", 500));

        System.out.println("New score is " + calculateScore(10));
    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " point");
        return score * 1000;
    }

    public static int calculateScore(int score) {

//        System.out.println("Unnamed player scored " + score + " point");
//        return score * 1000;

        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {

        System.out.println("No player name, no payer score");
        return 0;
    }

}
