import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class parking {

    SHAFT.GUI.WebDriver driver;


    By startingtime=By.xpath("//input[@id='StartingDate']");
    By leavingtime=By.xpath("//input[@id='LeavingDate']");
    By parkingtype=By.xpath("//select[@id='ParkingLot']");
    By startinghour=By.xpath("//input[@id='StartingTime']");
    By endinghour=By.xpath("//input[@id='LeavingTime']");
    By calculate=By.xpath("//input[@name='Submit']");
    By parkingprice=By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/span[1]/b");
    By pmentryparking=By.xpath("//tbody/tr[2]/td[2]/input[4]");
    By leavpmparking=By.xpath("//tbody/tr[3]/td[2]/input[4]");


    public parking(SHAFT.GUI.WebDriver driver){
        this.driver=driver;

    }

    public void selectparkingtype(String parking){

        driver.element().select(parkingtype,parking);
    }

    public void setentrydate(String entryime){
        driver.element().clear(startingtime);
        driver.element().type(startingtime,entryime);
    }

    public void setoutdate(String exittime){
        driver.element().clear(leavingtime);
        driver.element().type(leavingtime,exittime);
    }

    public void setentryparkingtime(String starttime){

        driver.element().click(startingtime);
        driver.element().type(startinghour,starttime);
    }


    public void leavingparkingtime(String endtime){

        driver.element().clear(endinghour);
        driver.element().type(endinghour,endtime);
    }
    public void calculateparking(){
        driver.element().click(calculate);
    }

    public String getparkingprice(){
        String price=driver.element().getText(parkingprice);
        return  price;
    }

    public void setentryparkingpm(){
        driver.element().click(pmentryparking);

    }
    public void setleavingarkingpm(){
        driver.element().click(leavpmparking);

    }

}
