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

WebUI.navigateToUrl('https://accounts.expresspros.com/Account/Login')

WebUI.click(findTestObject('Object Repository/Page_Express Pros/a_Sign Up For Your Free Account Now'))

WebUI.setText(findTestObject('Object Repository/Page_Register for a New Account/input_First Name_FirstName'), 'AutoTestFirstName')

WebUI.setText(findTestObject('Object Repository/Page_Register for a New Account/input_Last Name_LastName'), 'AutoTestLastName')

WebUI.setText(findTestObject('Object Repository/Page_Register for a New Account/input_Email  (Used as Username)_Email'), 
    'AutoTest@dummyemail.com')

WebUI.setText(findTestObject('Object Repository/Page_Register for a New Account/input_Confirm Email_ConfirmEmail'), 'AutoTest@dummyemail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register for a New Account/input_Password_Password'), 'c55C17TkPU0MbzPUGtg18A==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register for a New Account/input_Confirm Password_ConfirmPassword'), 
    'c55C17TkPU0MbzPUGtg18A==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Register for a New Account/select_Select your country                 _3db57c'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Register for a New Account/input_Seeking Work In_AgreedToEula'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Register for a New Account/button_Register'), 0)

