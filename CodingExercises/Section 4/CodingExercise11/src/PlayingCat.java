public class PlayingCat {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(false, 45));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (temperature <= 35 && temperature >= 25) {
            return true;
        } else if (temperature <= 45 && temperature >= 25 && summer) {
            return true;
        } else {
            return false;
        }
    }
}