package tests.home_page;

import org.testng.annotations.Test;
import tests.TestBase;

public class HomePageTests extends TestBase {
    @Test
    public void test() throws InterruptedException {
        System.out.println("This first test");
        Thread.sleep(5000);
    }
}
