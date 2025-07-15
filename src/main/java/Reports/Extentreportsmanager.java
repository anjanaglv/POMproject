package Reports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreportsmanager implements ITestListener {
	
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	 public void onStart(ITestContext context) {
		 extent=new ExtentReports();
		 spark=new ExtentSparkReporter("C:\\Users\\Vasantha\\eclipse-workspace\\POMproject\\eReports\\ExtentReports.html");
		 
		 spark.config().setDocumentTitle("ExtentReportsPractice");
		 spark.config().setReportName("GurutestinPOM");
		 spark.config().setTheme(Theme.STANDARD);
		 extent.attachReporter(spark);
		 
		 extent.setSystemInfo("Testername", "Anjana");
		 extent.setSystemInfo("Environment", "QA");
		 extent.setSystemInfo("Browser","chrome");
		 extent.setSystemInfo("O/S", "Windows 10");
		 extent.setSystemInfo("Testing type", "Regression Testing");
		 	 
		 
	 }
	 public void onTestSuccess(ITestResult result) {
		 test=extent.createTest(result.getName());
		 test.log(Status.PASS, result.getName()+" test is passed");
		    
		  }
		   
		  public void onTestFailure(ITestResult result) {
			  
			  test=extent.createTest(result.getName());
				 test.log(Status.FAIL, result.getName()+" test is failed");
		  }

		 
		  public void onTestSkipped(ITestResult result) {
			  test=extent.createTest(result.getName());
				 test.log(Status.SKIP, result.getName()+" test is skipped");
		  }
		  public void onFinish(ITestContext context) {
			    extent.flush();
			  }
	
}
