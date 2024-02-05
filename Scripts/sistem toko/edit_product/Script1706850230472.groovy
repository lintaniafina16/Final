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

WebUI.navigateToUrl('https://sistemtoko.com/')

WebUI.click(findTestObject('Object Repository/edit product/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/button_Login'))

WebUI.setText(findTestObject('Object Repository/edit product/Page_Login  sistemtoko.com/input_email'), 'hajaraswi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/edit product/Page_Login  sistemtoko.com/input_password'), 'MC8eOjkWQ9rKSVXDP8a9Gw==')

WebUI.click(findTestObject('Object Repository/edit product/Page_Login  sistemtoko.com/button_Login'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Management Store  Sistemtoko.com/img_navbar-brand-logo'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Management Store  Sistemtoko.com/button_Log In'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/a_Product'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/button_btn btn-xs btn-info dropdown-toggle'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/a_Edit Varian'))

WebUI.setText(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/input_form-control ng-pristine ng-untouched_b86563'), 
    'M40')

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/button_Update'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/i_icon fa-bars'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/a_Edit'))

WebUI.setText(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/inputproPrice'), '39000')

WebUI.setText(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/input_form-control ng-pristine ng-valid ng-touched'), 
    'Diapers bayi newborn')

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/input_form-control ng-pristine ng-valid ng-touched'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/button_Update_1'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/button_Update_1'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/div_Close                        Product up_538d05'))

WebUI.click(findTestObject('Object Repository/edit product/Page_Dashboard  Sistemtoko.com/span_'))

