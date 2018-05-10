package pageHelper;

import org.apache.log4j.Logger;
import page.PageLogin;
import page.PageSpan;
import util.SeleniumUtil;

/**
 * Created by dell on 2018/5/8.
 */
public class HelpSpanPage {
    public static Logger logger=Logger.getLogger(HelpSpanPage.class);
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
        seleniumUtil.click(PageSpan.DEFAULT_SPAN);
    }

    //输入标题
    public static void inputTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(PageSpan.IMPORT_TITLE,title);
    }
    //输入内容
    public static void inputContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.sendKeys(PageSpan.IMPORT_CONTENT,content);
    }
    //点击发帖
    public static void clickReportCards(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.REPORT_CARDS);
    }
    //回帖内容
    public static void inputReportCard(SeleniumUtil seleniumUtil,String reContent){
        seleniumUtil.sendKeys(PageSpan.REPLAY_CARDS,reContent);
    }
    //发表回复
    public static void clickReport(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSpan.CLICK_REPLAY);
    }
    //用户退出
    public static void clickUserback(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSpan.USER_BACK);
    }
    //查看文章
    public static void clickTitle(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSpan.CLICK_TITLE);
    }
    //删除文章
    public static void deleteTitle(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSpan.DELETE_TITLE);
    }
    //确定删除
    public static void sureDelete(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSpan.SURE_DELETE);
    }


    public static void login2(SeleniumUtil seleniumUtil,String username,String password) throws InterruptedException {
        inputUsername(seleniumUtil,username);
        inputPassword(seleniumUtil,password);
        clickLoginbtn(seleniumUtil);
        Thread.sleep(5000);
        clickDefaultSpan(seleniumUtil);
        clickTitle(seleniumUtil);
        deleteTitle(seleniumUtil);
        Thread.sleep(5000);
        sureDelete(seleniumUtil);
        Thread.sleep(5000);




    }
}
