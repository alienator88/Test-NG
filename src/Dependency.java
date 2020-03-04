import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
    //Dependency and AlwaysRun properties
    @Test
    void startCar()
    {
      System.out.println("Car Started");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Car Driving");
    }

    @Test(dependsOnMethods = {"driveCar"})
    void stopCar()
    {
        System.out.println("Car Stopped");
    }

    @Test(dependsOnMethods = {"stopCar","driveCar"},alwaysRun = true)
    void parkCar()
    {
        System.out.println("Car Parked");
    }

}
