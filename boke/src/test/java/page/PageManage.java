package page;

import org.openqa.selenium.By;

/**
 * Created by dell on 2018/5/9.
 */
public class PageManage {
    public static final By MANAGE_CENTER=By.linkText("管理中心");
    public static final By FORUM_SPAN=By.linkText("论坛");
    public static final By CREAT_NEW_SPAN=By.linkText("添加新版块");
    //退出
    public static final By ADMIN_BACK=By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");
    //输入密码
    public static final By REPET_PASSWORD=By.xpath("//*[@id=\"loginform\"]/p[4]/input");
    //点击提交
    public static final By CLICK_SUBMIT=By.xpath("//*[@id=\"loginform\"]/p[9]/input");
    //退出
    public static final By RE_BACK=By.linkText("退出");
    //默认板块
    public static final By DEFAULT_SPAN=By.linkText("默认板块");
    //输入标题
    public static final By INPUT_TITLE=By.id("subject");
    //输入内容
    public static final By INPUT_CINTENT=By.id("fastpostmessage");
    //点击发表
    public static final By CLIICK_SUBMIT=By.xpath("//*[@id=\"fastpostsubmit\"]/strong");


}
