import org.testng.annotations.Test;

public class FirstTestCase {
        //Priority and enabled properties
        @Test(priority = 1,enabled = true)
        void setup()
        {
            System.out.println("Opening browser");
        }

        @Test(priority = 2,enabled = true)
        void login() {
            System.out.println("This is the login test");
        }

        @Test(priority = 3,enabled = true)
        void teardown()
        {
            System.out.println("Closing browser");
        }
}

