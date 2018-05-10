package pageHelper;


import org.apache.log4j.Logger;
import page.PageLogin;
import page.PageManage;
import util.SeleniumUtil;

/**
 * Created by dell on 2018/5/9.
 */
public class HelpManagePage {
    public static Logger logger=Logger.getLogger(HelpManagePage.class);
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
    //点击管理中心
    public static void clickManageCenter(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.MANAGE_CENTER);
    }
    //点击论坛
    public static void clickTalk(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.FORUM_SPAN);
    }
    //输入密码
    public static void inputRePassword(SeleniumUtil seleniumUtil,String rePassword){
        seleniumUtil.sendKeys(PageManage.REPET_PASSWORD,rePassword);
    }
    //点击提交
    public static void clickSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.CLICK_SUBMIT);
    }
    //添加新板块
    public static void creatNew(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.CREAT_NEW_SPAN);
    }
    //用户退出
    public static void quit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.ADMIN_BACK);
    }
    //退出
    public static void reQuit(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.RE_BACK);
    }
    //默认板块
    public static void defaultSpan(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.DEFAULT_SPAN);
    }

    public static void manage(SeleniumUtil seleniumUtil,String username,String password,String rePassword,String username1,String password1)throws InterruptedException{
        inputUsername(seleniumUtil,username);
        inputPassword(seleniumUtil,password);
        clickLoginbtn(seleniumUtil);
        Thread.sleep(5000);
        clickManageCenter(seleniumUtil);
        seleniumUtil.exchangeHandle();
      inputRePassword(seleniumUtil,rePassword);
        clickSubmit(seleniumUtil);
        clickTalk(seleniumUtil);
        seleniumUtil.iframe("main");
        creatNew(seleniumUtil);
        Thread.sleep(5000);
        quit(seleniumUtil);
        Thread.sleep(5000);
        reQuit(seleniumUtil);
        inputUsername(seleniumUtil,username1);
        inputPassword(seleniumUtil,password1);
        Thread.sleep(5000);
        clickLoginbtn(seleniumUtil);


    }


}