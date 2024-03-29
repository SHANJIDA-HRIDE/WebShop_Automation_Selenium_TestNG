package tests;
import org.testng.annotations.Test;
import aquality.selenium.core.utilities.ISettingsFile;
import aquality.selenium.core.utilities.JsonSettingsFile;
import PageObjects.WebLogin;

public class TestOfLogin extends BaseTest {
	@Test
	public void TestingLogin(){
		ISettingsFile testdata = new JsonSettingsFile("testdata.json");
		WebLogin loginPage = new WebLogin();

		loginPage.setUsername(testdata.getValue("/email").toString());
		loginPage.setPassword(testdata.getValue("/password").toString());
		loginPage.clickedOnLogin();
	}
}
