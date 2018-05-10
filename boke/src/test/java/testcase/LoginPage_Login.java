package testcase;

import org.testng.annotations.Test;
import pageHelper.HelpLoginPage;

/**
 * Created by dell on 2018/5/7.
 */
public class LoginPage_Login extends BasicTestCase{
    @Test
    public void TestLogin()throws InterruptedException {
       HelpLoginPage.login(seleniumUtil,"admin","123456","hello-world-every----","Tomorrow will be better-------","I have a dream-------");
        //seleniumUtil.assertPage("admin");
    }

}
