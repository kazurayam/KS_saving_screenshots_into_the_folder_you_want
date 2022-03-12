import java.nio.file.Path
import java.nio.file.Paths

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// Open browser and navigate to AUT
WebUI.openBrowser("http://demoaut.katalon.com")

// Take screenshot
Path reportFolder = Paths.get(TL1.reportFolder)   // Test Listener/TL1 is constructed by Katalon Studio before this test case script runs
Path pngFile = reportFolder.resolve("baz.png")
WebUI.takeScreenshot(pngFile.toString())

// Close browser
WebUI.closeBrowser()