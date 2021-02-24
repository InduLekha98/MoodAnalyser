public class MoodAnalyser {
    public String msg;

    public MoodAnalyser(String msg) {
        this.msg= msg;
    }

    public String analyseMood() throws  MoodAnalyserException {
        try {
            if (msg.isEmpty())
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter proper message");
            if (msg.contains("SAD"))
                return "SAD";
                return "HAPPY";
        } catch (NullPointerException e) {
                return "HAPPY";
        }
    }
}
