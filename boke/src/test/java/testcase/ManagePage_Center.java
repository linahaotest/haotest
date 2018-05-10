package testcase;

import org.testng.annotations.Test;
import pageHelper.HelpManagePage;

/**
 * Created by dell on 2018/5/9.
 */
public class ManagePage_Center extends BasicTestCase{
    @Test
    public void TestManage()throws InterruptedException{
        HelpManagePage.manage(seleniumUtil,"admin","123456","123456","admin1","password");

        //seleniumUtil.assertPage("admin");
    }

}
