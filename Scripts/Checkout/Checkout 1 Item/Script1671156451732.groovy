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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'), GlobalVariable.user)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9'), 
    GlobalVariable.pass)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/a_1'), '1')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_1_1'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'galang')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'satria')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '68312')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/h2_THANK YOU FOR YOUR ORDER'), 'THANK YOU FOR YOUR ORDER')

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

