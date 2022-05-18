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

Mobile.startApplication('C:\\Users\\Hans-Mustofa\\Documents\\alta-online-shop.apk', false)

Mobile.tap(findTestObject('Object_Register/goto_Login_btn'), 0)

Mobile.tap(findTestObject('Object_Register/register_btn'), 0)

Mobile.tap(findTestObject('Object_Register/tap_username'), 0)

Mobile.setText(findTestObject('Object_Register/set_text_username'), 'hans123', 0)

Mobile.tap(findTestObject('Object_Register/tap_email'), 0)

Mobile.setText(findTestObject('Object_Register/set_text_email'), 'hansa3@email.com', 
    0)

Mobile.tap(findTestObject('Object_Register/tap_password'), 0)

Mobile.setText(findTestObject('Object_Register/set_text_password'), '123123bandung', 
    0)

Mobile.tap(findTestObject('Object_Register/submit_register_btn'), 0)

