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

WebUI.click(findTestObject('Object Repository/login_success/Page_ParaBank  Welcome  Online Banking/a_Register_1'))

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.firstName'), 
    'Lintani Afina')

WebUI.click(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/table_First Name                           _a4b00d'))

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.lastName'), 
    'Hajar Raudhoti')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.street'), 
    'Jl. Kemenangan dan kesuksesan')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.city'), 
    'Depok')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.state'), 
    'Jawa Barat')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.zipCode'), 
    '8875')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.phoneNumber'), 
    '08743234567')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.ssn'), 
    '7567')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.username'), 
    'lintaniafina')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.password'), 
    'TKxX1cQCdxkzog/uvb0Ksw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_repeatedPassword'), 
    'TKxX1cQCdxkzog/uvb0Ksw==')

WebUI.click(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/span_This username already exists'))

