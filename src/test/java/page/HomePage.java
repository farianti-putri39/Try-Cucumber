package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
public class HomePage {

    ChromeDriver driver;

    By backpackItem = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    public HomePage(ChromeDriver driver){
        this.driver = driver;
    }

    public void validateBackpackDisplayed(){
        assertTrue(driver.findElement(backpackItem).isDisplayed());
    }

}
