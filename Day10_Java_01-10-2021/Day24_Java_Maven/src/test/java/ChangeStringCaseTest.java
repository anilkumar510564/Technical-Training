import org.junit.Assert;
import org.junit.Test;

public class ChangeStringCaseTest {
    @Test
    public void toCapitalLetter()
    {
        ChangeStringCase stringCase=new ChangeStringCase();
        Assert.assertEquals("RESEARCH AND ANALYSIS WING",stringCase.toCapitalLetter("research and analysis wing"));
    }

    @Test
    public void toSmallLetter()
    {
        ChangeStringCase stringCase=new ChangeStringCase();
        Assert.assertEquals("intelligence bureau",stringCase.toSmallLetter("INTELLIGENCE BUREAU"));
    }
}
