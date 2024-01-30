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

WebUI.click(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Welcome  Online Banking/a_Register'))

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.firstName'), 
    'Lintani Afina')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.lastName'), 
    'Hajar Raudhoti')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.street'), 
    'Jl. Kemenangan dan Kesuksesan')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.city'), 
    'Depok')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.state'), 
    'Jawa Barat')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.address.zipCode'), 
    '57676')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.phoneNumber'), 
    '08723456789')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.ssn'), 
    '7678')

WebUI.setText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.username'), 
    'lintani_afina123')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_customer.password'), 
    'TKxX1cQCdxkzog/uvb0Ksw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_repeatedPassword'), 
    'TKxX1cQCdxkzog/uvb0Ksw==')

WebUI.click(findTestObject('Object Repository/Register_banking/Register_banking_already_exist/Page_ParaBank  Register for Free Online Acc_dbf84b/input_button'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Register_banking/Page_ParaBank  Customer Created/p_Your account was created successfully. Yo_fafba4'))

WebUI.click(findTestObject('Object Repository/Register_banking/Page_ParaBank  Customer Created/a_Log Out'))

