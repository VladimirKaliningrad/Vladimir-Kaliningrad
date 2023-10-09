package seminars.third.tdd;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains(("грустное"))) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}