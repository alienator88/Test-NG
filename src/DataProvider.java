import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email,String pwd)
    {
        System.out.println(email+"    "+pwd);
    }


    @org.testng.annotations.DataProvider(name="LoginDataProvider")
    public Object[][] getData()
    {
        Object[][] data={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
        return data;
    }


}
