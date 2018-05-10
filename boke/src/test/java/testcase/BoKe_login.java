package testcase;

/**
 * Created by dell on 2018/5/7.
 */
public class BoKe_login {
    /*public WebDriver driver=null;
    SeleniumUtil seleniumUtil=null;
    @BeforeMethod
    public void setUp(){
        LogConfiguration.initLog();
        seleniumUtil=new SeleniumUtil();
        System.setProperty("webdriver.chrome.driver","F:\\guge\\chrome&driver\\chromedriver.exe");
        driver=seleniumUtil.getDriver("chrome");
    }
    @Test
    public void login(){
        seleniumUtil.url("http://127.0.0.1:8090/bbs/forum.php");
        seleniumUtil.sendKeys(By.id("ls_username"),"admin");
        seleniumUtil.sendKeys(By.id("ls_password"),"123456");
        seleniumUtil.click(By.xpath("/html/body/div[5]/div/div[1]/form/div/div/table/tbody/tr[2]/td[3]/button"));
        //点击默认板块
        seleniumUtil.click(By.xpath("/*//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a"));

        //输入标题
        seleniumUtil.sendKeys(By.id("subject"),"hello-world-every----");
        //输入内容
        seleniumUtil.sendKeys(By.id("fastpostmessage"),"Tomorrow will be better-------");
        //点击发帖
        seleniumUtil.click(By.id("postsubmit"));
        //回帖内容
        seleniumUtil.sendKeys(By.id("fastpostmessage"),"I have a dream-------");
        //点击发表回复
        seleniumUtil.click(By.id("fastpostsubmit"));
        //用户退出
        seleniumUtil.click(By.linkText("退出"));
        //查看文章
        seleniumUtil.click(By.xpath("/*//*[@id=\"normalthread_8\"]/tr/th/a[2]"));
        //删除文章
        seleniumUtil.click(By.xpath("/*//*[@id=\"modmenu\"]/a[1]"));
        //确定删除
        seleniumUtil.click(By.id("modsubmit"));
        //进入管理中心
        seleniumUtil.click(By.linkText("管理中心"));



    }
    @AfterMethod
    public void teardown(){
        // driver.quit();
    }*/
}
