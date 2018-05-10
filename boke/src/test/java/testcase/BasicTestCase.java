package testcase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.BrowserEngine;
import util.LogConfiguration;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by dell on 2018/5/7.
 */
public class BasicTestCase {
    public WebDriver driver;
    public SeleniumUtil seleniumUtil;
   // public static Logger logger=Logger.getLogger(BasicTestCase.class);
    @BeforeMethod
    public void initTest() throws IOException {
        LogConfiguration.initLog();

        seleniumUtil=new SeleniumUtil();
        driver=seleniumUtil.getDriver(BrowserEngine.browserName);
        seleniumUtil.url(BrowserEngine.serverURL);
       /* System.setProperty("webdriver.chrome.driver","F:\\guge\\chrome&driver\\chromedriver.exe");
        PropertyConfigurator.configure("./log4j.properties");
        seleniumUtil=new SeleniumUtil();
        driver=seleniumUtil.getDriver("chrome");
        driver.manage().window().maximize();
        seleniumUtil.url("http://127.0.0.1:8090/bbs/forum.php");*/
    }

    @AfterMethod
    public void clearTest(){
        //driver.quit();
    }
}
