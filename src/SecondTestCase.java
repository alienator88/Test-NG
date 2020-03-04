import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup()
    {
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void searchCustomer() {
        System.out.println("This is the search customer test");
    }

    @Test(priority = 3)
    void addCustomer() {
        System.out.println("This is the add customer test");
    }

    @Test(priority = 4)
    void teardown()
    {
        System.out.println("Closing browser");
    }
}


