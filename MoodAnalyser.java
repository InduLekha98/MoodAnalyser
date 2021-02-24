public class MoodAnalyser {
        public String analyseMood (String message){
            System.out.println("Welcome to Mood Analyser Problem");
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
}
