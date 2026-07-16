package TestLogin;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NkBase.InvokeBrowser;
import NkLogin.LogHome;
import NkUpdate.UpdateNaukariHome1;
import NkUpdate.UpdateNaukariHome2;
import NkUpdate.UploadResume;
import NkUtility.UtilityData;

public class Login2Naukari extends InvokeBrowser {

	LogHome LoginHome;
	UpdateNaukariHome1 UpProfile;
	UpdateNaukariHome2 UpProfile2;
	UploadResume uploadRusm;

	@BeforeMethod
	public void Login2App() {

		browserOpen();

		LoginHome = new NkLogin.LogHome(driver);
		UpProfile = new UpdateNaukariHome1(driver);
		UpProfile2 = new UpdateNaukariHome2(driver);
		uploadRusm = new UploadResume(driver);

	}

	@Test(priority = 0)
	public void Login2app_lakhan() throws EncryptedDocumentException, IOException, InterruptedException {

		String un="dhiraj.gurunule1991@gmail.com";
		String pw="findJob@2026";

		LoginHome.clickLoginOnHome();
		// LoginHome.LoginNaukari(UtilityData.getExceldata(0, 0), UtilityData.getExceldata(0, 1));
		LoginHome.LoginNaukari(un,pw);

		UpProfile.clickOnUpdateProfile();

		UpProfile2.ClickUpdateResumeHeadline("Resume Headline");

		String heading="Senior Android Developer with 9+ years of experience in Kotlin ,Java,Dart ,Xml,Android SDK,MVVM,JSON,Dagger,JUnit,SQLite,Git ,SVN,Android Development,Project Management,Application Development,Web Application,UI Development, Requirement Analysis.";
		UpProfile2.clickonResumeHeadEditButton(wait, heading);
		UpProfile2.EditFinalUpdateResumeheading(wait, heading);

	}

	@AfterMethod
	public void closeBr() {
		driver.quit();
	}

	@AfterClass
	public void ClearAll() {
		LoginHome = null;
		UpProfile = null;
		UpProfile2 = null;

	}

}
