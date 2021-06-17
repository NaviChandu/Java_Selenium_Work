package runner;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.BeforeClass;

import com.cucumber.listener.ExtentCucumberFormatter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"json:target/RunCuke/cucumber.json", "pretty", "html:target/RunCuke/cucumber.html","com.cucumber.listener.ExtentCucumberFormatter"},
        features = "src\\test\\resource\\feature",
        glue = "steps",
        tags = {"@Search-Cars,@Used-Car-Search"}        
        )
public class RunCuke extends AbstractTestNGCucumberTests{
	
	@BeforeClass
    public static void setup() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy_hhmmss");
		Date curDate = new Date();
		String strDate = sdf.format(curDate);
		String fileName = "D:\\Naveen\\Documents\\Automation\\Devlab Alliance\\Cucumberbasics\\CucumberPageObject\\target\\ExtenReports" + strDate+".html";
		File newFile = new File(fileName);
        //ExtentCucumberFormatter.initiateExtentCucumberFormatter(new newFile,false);

		ExtentCucumberFormatter.initiateExtentCucumberFormatter(new File(newFile + ".html"),false);
        // Loads the extent config xml to customize on the report.
        ExtentCucumberFormatter.loadConfig(new File("src/test/resource/extent-config.xml"));

        // User can add the system information as follows
        ExtentCucumberFormatter.addSystemInfo("Browser Name", "chrome");
        ExtentCucumberFormatter.addSystemInfo("Browser version", "v90.0");
        ExtentCucumberFormatter.addSystemInfo("Selenium version", "v3.9.1");

        // Also you can add system information using a hash map
        Map systemInfo = new HashMap();
        systemInfo.put("Cucumber version", "v1.2.3");
        systemInfo.put("Extent Cucumber Reporter version", "v1.1.0");
        ExtentCucumberFormatter.addSystemInfo(systemInfo);
    }
	
	
	

}
