package mindq.seleniumtrainingaugframework.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import mindq.seleniumtrainingaugframework.base.Base;

public class ReportingManager extends Base{
	
	
	
	public static String captureScreenshot() throws IOException {
		
		//Convert webdriver object to TakeScreenshot
		
		
		TakesScreenshot scrShot = (TakesScreenshot)driver;
		
		
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		
		File destinationPath = new File("C://Users//PRASHANTHI//eclipse-workspace//MindQWorkSpace//cucumberframeworkAug//Screenshots//"+
		"ScreenCapture"+System.currentTimeMillis()+ ".png");
		
		
		FileUtils.copyFile(scrFile,destinationPath);
		
		
		String filePath = destinationPath.getAbsolutePath();
		
		
		return filePath;
		
	}

}
