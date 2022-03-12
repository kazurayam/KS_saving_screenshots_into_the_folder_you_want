import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext

class TL1 {
	
	public static String projectDir = RunConfiguration.getProjectDir()
	public static String reportFolder = RunConfiguration.getReportFolder()
	
	@BeforeTestSuite
	def sampleBeforeTestSuite(TestSuiteContext testSuiteContext) {
		println ""
		println "[${testSuiteContext.getTestSuiteId()}] projectDir  =${projectDir}"
		println "[${testSuiteContext.getTestSuiteId()}] reportFolder=${reportFolder}"
		println ""
	}
	
	@BeforeTestCase
	def sampleBeforeTestCase(TestCaseContext testCaseContext) {
		println ""
		println "[${testCaseContext.getTestCaseId()}] projectDir  =${projectDir}"
		println "[${testCaseContext.getTestCaseId()}] reportFolder=${reportFolder}"
		println ""
	}

}