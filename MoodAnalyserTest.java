import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    static MoodAnalyser checkingMessages = new MoodAnalyser(null);
    @Test
    public void givenNullmoodShouldReturnHappy() {
        Assert.assertEquals("HAPPY", checkingMessage.analyseMood());
    }
}

