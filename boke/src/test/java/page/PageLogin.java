package page;

import org.openqa.selenium.By;

/**
 * Created by dell on 2018/5/7.
 */
public class PageLogin {
    //输入用户名
    public static final By LOGIN_ENIIVIEW_ACCTION=By.id("ls_username");
    //输入密码
    public static final By LOGIN_ENIIVIEW_PWD=By.id("ls_password");
    //登陆
    public static final By LOGIN_BUTTON_LOGIN=By.xpath("/html/body/div[5]/div/div[1]/form/div/div/table/tbody/tr[2]/td[3]/button");
    //自动登陆
    public static final By LOGIN_AUTO_LOGIN=By.id("ls_cookie_time");
    //找回密码
    public static final By LOGIN_FIND_PWD=By.linkText("找回密码");
    //立即注册
    public static final By LOGIN_REGISTER_LOGIN=By.linkText("立即注册");
    //默认板块
    public static final By DEFAULT_SPAN=By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    //输入标题
    public static final By IMPORT_TITLE=By.id("subject");
    //输入内容
    public static final By IMPORT_CONTENT=By.id("fastpostmessage");
    //点击发帖
    public static final By REPORT_CARDS=By.id("fastpostsubmit");
    //回帖内容
    public static final By REPLAY_CARDS=By.id("fastpostmessage");
    //发表回复
    public  static final By CLICK_REPLAY=By.id("fastpostsubmit");
    //用户退出
    public static final By USER_BACK=By.linkText("退出");

}
