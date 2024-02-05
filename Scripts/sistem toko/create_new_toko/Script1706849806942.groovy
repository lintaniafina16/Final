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

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_sistemtoko.com, Aplikasi Termudah untu_65d0a2/button_Login'))

WebUI.setText(findTestObject('Object Repository/create_new_toko/Page_Login  sistemtoko.com/input_email'), 'hajaraswi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/create_new_toko/Page_Login  sistemtoko.com/input_password'), 'MC8eOjkWQ9rKSVXDP8a9Gw==')

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Login  sistemtoko.com/button_login (1)'))

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Management Store  Sistemtoko.com/a_Tambah Toko'))

WebUI.setText(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/input_form-control ng-pristine ng-untouched_25e022'), 
    'Toko Hajar')

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/div_link-style'))

WebUI.setText(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/textarea_form-control ng-pristine ng-untouc_640b91'), 
    'Ini adalah toko hajar menjual segala macam kebutuhan ibu dan anak')

WebUI.setText(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/textarea_form-control ng-pristine ng-untouc_2b907a'), 
    'Jl. Keberhasilan dan Kemakmuran, Kec. Kesuksesan, Kab. Padalarang')

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/input_ng-pristine ng-untouched ng-valid'))

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/input_ng-pristine ng-untouched ng-valid'))

WebUI.selectOptionByValue(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/select_Pilih provinsiBaliBangka BelitungBan_8ed3ec'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/select_KotamadyaKabupatenBandungBandungBand_59ed3d'), 
    'string:23', true)

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/inputjne'))

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/inputpos'))

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/inputtiki'))

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/inputsicepat'))

WebUI.click(findTestObject('Object Repository/create_new_toko/Page_Dashboard  Sistemtoko.com/button_Submit'))

