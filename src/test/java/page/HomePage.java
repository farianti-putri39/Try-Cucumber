package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;
public class HomePage {

    ChromeDriver driver;

    By backpackItem = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By backpackAddToCart = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    By bikeLightAddToCart = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    By boltShirtAddToCart = By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
    By fleeceJacketAddToCart = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    By onesieAddToCart = By.cssSelector("#add-to-cart-sauce-labs-onesie");
    By testShirtAddToCart = By.cssSelector("#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
    By cartCounter = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    By backpackRemove = By.cssSelector("#remove-sauce-labs-backpack");
    By cartIcon= By.cssSelector("#shopping_cart_container > a");

    public HomePage(ChromeDriver driver){
        this.driver = driver;
    }

    public void validateBackpackDisplayed(){
        assertTrue(driver.findElement(backpackItem).isDisplayed());
    }

    public void clickBackpackAddToCart(){
        driver.findElement(backpackAddToCart).click();
    }

    public void validateCartCounter(){
        assertTrue(driver.findElement(cartCounter).isDisplayed());
    }

    public void clickBackpackRemove(){
        driver.findElement(backpackRemove).click();
    }

    public void validateCartNoItem(){
        assertTrue(driver.findElement(cartIcon).isDisplayed());
    }

    public void addAllItemToCart(){
        driver.findElement(backpackAddToCart).click();
        driver.findElement(bikeLightAddToCart).click();
        driver.findElement(boltShirtAddToCart).click();
        driver.findElement(onesieAddToCart).click();
        driver.findElement(fleeceJacketAddToCart).click();
        driver.findElement(testShirtAddToCart).click();
    }

}
