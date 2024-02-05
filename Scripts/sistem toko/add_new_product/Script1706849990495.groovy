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

WebUI.click(findTestObject('Object Repository/add new product/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/button_Login'))

WebUI.setText(findTestObject('Object Repository/add new product/Page_Login  sistemtoko.com/input_email'), 'hajaraswi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/add new product/Page_Login  sistemtoko.com/input_password'), 'MC8eOjkWQ9rKSVXDP8a9Gw==')

WebUI.click(findTestObject('Object Repository/add new product/Page_Login  sistemtoko.com/button_Login'))

WebUI.click(findTestObject('Object Repository/add new product/Page_Management Store  Sistemtoko.com/button_Log In'))

WebUI.click(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/a_Product'))

WebUI.click(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/button_Data Baru  Re-stok'))

WebUI.click(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/button_Buat Product baru'))

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/input_form-control ng-pristine ng-untouched_65bb6f'), 
    '0987')

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/inputproName'), 'Diapers bayi newborn')

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/inputproVarian'), '')

WebUI.click(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/inputproVarian'))

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/inputdata-varian-0'), 'M')

WebUI.click(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/a_Add New Varian'))

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/inputdata-varian-1'), 'L')

WebUI.click(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/a_Add New Varian'))

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/inputdata-varian-2'), 'XL')

WebUI.click(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/button_Submit'))

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/inputproPrice'), '38500')

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/input_form-control ng-pristine ng-untouched_6081f4'), 
    '45000')

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/input_form-control ng-pristine ng-untouched_afe2f4'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/textarea_form-control ng-pristine ng-untouc_640b91'), 
    'Diapers anti ruam cocok untuk bayi baru lahir')

WebUI.click(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/add new product/Page_Dashboard  Sistemtoko.com/button_Masukan Data'))

