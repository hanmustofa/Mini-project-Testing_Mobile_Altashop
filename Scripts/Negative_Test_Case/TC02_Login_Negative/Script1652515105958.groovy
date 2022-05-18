import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for (int i = 1; i <= 7; i++) {
    Mobile.startApplication('C:\\Users\\Hans-Mustofa\\Documents\\alta-online-shop.apk', false)

    Mobile.tap(findTestObject('Object_Register/goto_Login_btn'), 0)

    Mobile.tap(findTestObject('Object_Login/tap_email'), 0)

    Mobile.setText(findTestObject('Object_Login/set_text_email'), findTestData('data_Login_Negative').getValue(1, i), 0)

    Mobile.tap(findTestObject('Object_Login/tap_password'), 0)

    Mobile.setText(findTestObject('Object_Login/set_text_password'), findTestData('data_Login_Negative').getValue(2, i), 
        0)

    Mobile.tap(findTestObject('Object_Login/submit_login_btn'), 0)
}

