package pages;


import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;
import static stepDef.Hooks.driver;

public class HomePage {

    By backpackItem = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By backpackAddToCart = By.cssSelector("#add-to-cart-sauce-labs-backpack");
    By bikeLightAddToCart = By.cssSelector("#add-to-cart-sauce-labs-bike-light");
    By boltShirtAddToCart = By.cssSelector("#add-to-cart-sauce-labs-bolt-t-shirt");
    By fleeceJacketAddToCart = By.cssSelector("#add-to-cart-sauce-labs-fleece-jacket");
    By onesieAddToCart = By.cssSelector("#add-to-cart-sauce-labs-onesie");
    By testShirtAddToCart = By.cssSelector("#add-to-cart-test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
    By cartCounter = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    By backpackRemove = By.cssSelector("#remove-sauce-labs-backpack");
    By cartIcon = By.cssSelector("#shopping_cart_container > a");

    public void validateBackpackDisplayed() {
        assertThat(driver.findElement(backpackItem).isDisplayed()).isEqualTo(true);
    }

    public void clickBackpackAddToCart() {
        driver.findElement(backpackAddToCart).click();
    }

    public void validateCartCounter() {
        assertThat(driver.findElement(cartCounter).isDisplayed()).isEqualTo(true);
    }

    public void clickBackpackRemove() {
        driver.findElement(backpackRemove).click();
    }

    public void validateCartNoItem() {
        assertThat(driver.findElement(cartIcon).isDisplayed()).isEqualTo(true);
    }

    public void addAllItemToCart() {
        driver.findElement(backpackAddToCart).click();
        driver.findElement(bikeLightAddToCart).click();
        driver.findElement(boltShirtAddToCart).click();
        driver.findElement(onesieAddToCart).click();
        driver.findElement(fleeceJacketAddToCart).click();
        driver.findElement(testShirtAddToCart).click();
    }

}
