package util;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by dell on 2018/5/8.
 */
public class BrowserEngine {
    public static String browserName;
    public static String serverURL;
    public WebDriver driver;
    public static void initConfigData()throws IOException{
        Properties p=new Properties();
        //加载配置文件
        InputStream ips=new FileInputStream("./config.properties");
        p.load(ips);
        browserName=p.getProperty("browserName");
        serverURL=p.getProperty("serverURL");
    }
    static {
        try {
            BrowserEngine.initConfigData();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(BrowserEngine.browserName);
    }
   /* public WebDriver getBrowser(){
        if (browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","F:\\huohu\\huohuqudong\\geckodriver.exe");
            driver= new FirefoxDriver();
        }else if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","F:\\guge\\chrome&driver\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        driver.get(serverURL);
        driver.manage().window().maximize();
        return driver;
    }*/
}
