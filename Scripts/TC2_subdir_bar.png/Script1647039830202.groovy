import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open browser and navigate to AUT
WebUI.openBrowser("http://demoaut.katalon.com")

// Take screenshot
WebUI.takeScreenshot("screenshot/sample/bar.png")

// Close browser
WebUI.closeBrowser()