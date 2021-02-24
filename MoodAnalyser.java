public class MoodAnalyser {
    public String msg;
    public MoodAnalyser(String msg) {
        this.msg = msg;
    }
    public String analyseMood() {
        try {
            if (msg.contains("SAD"))
                return "SAD";
                return "HAPPY";
        } catch (NullPointerException e) {
                return "HAPPY";
        }
    }
}
