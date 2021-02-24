import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    static MoodAnalyser checkingMessages = new MoodAnalyser();

    @Test
    public void GivenWhenTheMessageIsSadMustReturnSad() {
        Assert.assertEquals("SAD", checkingMessages.analyseMood("This message ia a Sad message"));
    }

    @Test
    public void givenWhenTheMessageIsNotSadMustReturnHappy() {
        Assert.assertEquals("HAPPY", checkingMessages.analyseMood("This message is a Happy message"));
    }
}
