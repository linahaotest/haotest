package page;

import org.openqa.selenium.By;

/**
 * Created by dell on 2018/5/8.
 */
public class PageSpan {

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
    //查看文章
    public static final By CLICK_TITLE=By.xpath("//*[@id=\"normalthread_8\"]/tr/th/a[2]");
    //删除文章
    public static final By DELETE_TITLE=By.xpath("//*[@id=\"modmenu\"]/a[1]");
    //确定删除
    public static final By SURE_DELETE=By.id("modsubmit");
}
