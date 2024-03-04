import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cart_adding {
    private WebDriver driver;

    public Cart_adding(WebDriver driver){
        this.driver = driver;
    }
    public void addCart() {

        WebElement labtop = driver.findElement(By.xpath("//a[@href='https://egyptlaptop.com/acer-aspire-3-a315-58g-51l4-intel-core-i5-1135g7-1tb-hdd-8gb-ram-nvidia-geforce-mx350-2gb-15-6-inch-fhd']"));
        labtop.click();
        WebElement add_to_cart = driver.findElement(By.id("button_cart_8976"));
        add_to_cart.click();
    }
}
