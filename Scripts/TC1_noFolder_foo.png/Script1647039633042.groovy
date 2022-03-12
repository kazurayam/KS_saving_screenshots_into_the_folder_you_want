/*
 *  Test Cases/TC1_noFolder_foo.png
 */

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open browser and navigate to AUT
WebUI.openBrowser("http://demoaut.katalon.com")

// Take screenshot
File png = new File("foo.png")
WebUI.takeScreenshot(png.toString())

println "[TC1_noFolder_foo.png] png -> ${png.getCanonicalPath()}"

// Close browser
WebUI.closeBrowser()