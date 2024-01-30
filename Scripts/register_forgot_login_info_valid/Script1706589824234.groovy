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

WebUI.navigateToUrl('https://parabank.parasoft.com/parabank/index.htm')

WebUI.click(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Welcome  Online Banking/a_Forgot login info'))

WebUI.setText(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Customer Lookup/input_firstName'), 
    'Lintani Afina')

WebUI.setText(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Customer Lookup/input_lastName'), 
    'Hajar Raudhoti')

WebUI.setText(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Customer Lookup/input_address.street'), 
    'Jl. Kemenangan dan Kesuksesan')

WebUI.setText(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Customer Lookup/input_address.city'), 
    'Depok')

WebUI.setText(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Customer Lookup/input_address.state'), 
    'Jawa Barat')

WebUI.setText(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Customer Lookup/input_address.zipCode'), 
    '57676')

WebUI.setText(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Customer Lookup/input_ssn'), 
    '7678')

WebUI.click(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Customer Lookup/input_button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/register_forgot_login_valid/Page_ParaBank  Customer Lookup/p_Username lintaniafina    Password lintani123'))

