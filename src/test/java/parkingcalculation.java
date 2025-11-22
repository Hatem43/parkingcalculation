import com.shaft.driver.SHAFT;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class parkingcalculation {

    SHAFT.GUI.WebDriver driver;
    parking park;
    SHAFT.TestData.JSON testData;

    public String startdate;
    public String leavetime;
    public String starttime;
    public String leavedate;
    public String ShortTermParking;
    public String EconomyParking;
    public String LongTermGarageParking;
    public String LongTermSurfaceParking;

    @BeforeMethod
    public void browserset(){

        testData=new SHAFT.TestData.JSON("E:\\parkingcalculator\\src\\test\\resources\\parkinginfo.json");
        driver=new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL("https://www.shino.de/parkcalc/");
        park=new parking(driver);
         startdate=testData.getTestData("entryttime");
         leavetime=testData.getTestData("leavetime");
         starttime=testData.getTestData("entrytime");
         leavedate=testData.getTestData("endtime");
         ShortTermParking=testData.getTestData("parkingtype[1]");
         EconomyParking=testData.getTestData("parkingtype[2]");
        LongTermGarageParking=testData.getTestData("parkingtype[3]");
        LongTermSurfaceParking=testData.getTestData("parkingtype[4]");

    }

    @Test
    public void valentparkingcalculation(){

        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 18.00";
        Assert.assertEquals(actualprice,expected);

    }





    @Test
    public void ShortTermParkingcalculation(){

        park.selectparkingtype(ShortTermParking);
        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 24.00";
        Assert.assertEquals(actualprice,expected);

    }



    @Test
    public void EconomyParkingalculation(){

        park.selectparkingtype(EconomyParking);
        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 9.00";
        Assert.assertEquals(actualprice,expected);

    }

    @Test
    public void LongTermGarageParkingcalculation(){

        park.selectparkingtype(LongTermGarageParking);
        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 12.00";
        Assert.assertEquals(actualprice,expected);

    }

    @Test
    public void LongTermSurfaceParkingcalculation(){

        park.selectparkingtype(LongTermSurfaceParking);
        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 10.00";
        Assert.assertEquals(actualprice,expected);

    }




    @Test
    public void valentparkingcalculationpm(){

        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.setentryparkingpm();
        park.setleavingarkingpm();
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 18.00";
        Assert.assertEquals(actualprice,expected);

    }

    @Test
    public void ShortTermParkingcalculationpm(){

        park.selectparkingtype(ShortTermParking);
        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.setentryparkingpm();
        park.setleavingarkingpm();
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 24.00";
        Assert.assertEquals(actualprice,expected);

    }

    @Test
    public void EconomyParkingcalculationpm(){

        park.selectparkingtype(EconomyParking);
        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.setentryparkingpm();
        park.setleavingarkingpm();
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 9.00";
        Assert.assertEquals(actualprice,expected);

    }



    @Test
    public void LongTermGarageParkingcalculationpm(){

        park.selectparkingtype(LongTermGarageParking);
        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.setentryparkingpm();
        park.setleavingarkingpm();
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 12.00";
        Assert.assertEquals(actualprice,expected);

    }

    @Test
    public void LongTermSurfaceParkingcalculationpm(){

        park.selectparkingtype(LongTermSurfaceParking);
        park.setentrydate(startdate);
        park.setoutdate(leavedate);
        park.setentryparkingtime(starttime);
        park.leavingparkingtime(leavetime);
        park.setentryparkingpm();
        park.setleavingarkingpm();
        park.calculateparking();
        String actualprice= park.getparkingprice();
        String expected="$ 10.00";
        Assert.assertEquals(actualprice,expected);

    }





}
