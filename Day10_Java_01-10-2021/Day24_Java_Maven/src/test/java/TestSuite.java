import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//Create a Test Suite
@RunWith(Suite.class)

//List all classes Tested Together
@Suite.SuiteClasses({CalculatorTest.class, ChangeStringCaseTest.class})
public class TestSuite {

}
