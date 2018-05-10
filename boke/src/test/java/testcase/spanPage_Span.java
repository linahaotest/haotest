package testcase;

import org.testng.annotations.Test;
import pageHelper.HelpSpanPage;

/**
 * Created by dell on 2018/5/8.
 */
public class spanPage_Span extends BasicTestCase{
    @Test
    public void TestLogin()throws InterruptedException {
        HelpSpanPage.login2(seleniumUtil,"admin","123456");
        //seleniumUtil.assertPage("admin");




    }

}
