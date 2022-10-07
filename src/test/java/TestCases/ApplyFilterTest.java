package TestCases;
import Resources.Base;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObject.ApplyFilterPage;
public class ApplyFilterTest extends Base {
    PageObject.ApplyFilterPage userLog= new ApplyFilterPage();
//    @BeforeTest
//    public void setUp() {
//        driverCreation();
//        userLog = new ApplyFilterPage(driver);
//    }


    @Test(priority = 11)
    public void ClickExploreTest() {
        try {
            userLog.ClickExplore();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 12)
    public void SelectTypesTest() {
        try {
            userLog.SelectTypes();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 13)
    public void SelectLocationTest() {
        try {
            userLog.SelectLocation();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 14)
    public void ValidateDeskTest() {
        try {
            userLog.ValidateDesk();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
