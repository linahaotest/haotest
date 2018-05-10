package pageHelper;

import org.apache.log4j.Logger;
import page.PageLogin;
import util.SeleniumUtil;

/**
 * Created by dell on 2018/5/7.
 */
public class HelpLoginPage {
    public static Logger logger=Logger.getLogger(HelpLoginPage.class);
    //输入用户名
    public static void inputUsername(SeleniumUtil seleniumUtil,String username){
        seleniumUtil.sendKeys(PageLogin.LOGIN_ENIIVIEW_ACCTION,username);
    }
    //输入密码
    public static void inputPassword(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(PageLogin.LOGIN_ENIIVIEW_PWD,password);
    }
    //点击登陆
    public static void clickLoginbtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_BUTTON_LOGIN);
    }
    //点击默认板块
    public static void clickDefaultSpan(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.DEFAULT_SPAN);
    }

    //输入标题
    public static void inputTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(PageLogin.IMPORT_TITLE,title);
    }
    //输入内容
    public static void inputContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.sendKeys(PageLogin.IMPORT_CONTENT,content);
    }
    //点击发帖
    public static void clickReportCards(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.REPORT_CARDS);
    }
    //回帖内容
    public static void inputReportCard(SeleniumUtil seleniumUtil,String reContent){
        seleniumUtil.sendKeys(PageLogin.REPLAY_CARDS,reContent);
    }
    //发表回复
    public static void clickReport(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.CLICK_REPLAY);
    }
    //用户退出
    public static void clickUserback(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.USER_BACK);
    }



    //重构一个方法
    public static void login(SeleniumUtil seleniumUtil,String username,String password,String title,String content,String reportcard) throws InterruptedException {
        inputUsername(seleniumUtil,username);
        inputPassword(seleniumUtil,password);
        clickLoginbtn(seleniumUtil);
        Thread.sleep(5000);
        //默认板块
        clickDefaultSpan(seleniumUtil);

        Thread.sleep(5000);
        //输入标题
        inputTitle(seleniumUtil,title);
        Thread.sleep(5000);
        //输入内容
        inputContent(seleniumUtil,content);
        Thread.sleep(5000);
        //点击发帖
        clickReportCards(seleniumUtil);
        Thread.sleep(5000);
        //回帖内容
        inputReportCard(seleniumUtil,reportcard);
        Thread.sleep(5000);
        //发表回复
        clickReport(seleniumUtil);
        Thread.sleep(5000);
        //用户退出
        clickUserback(seleniumUtil);
    }

}
