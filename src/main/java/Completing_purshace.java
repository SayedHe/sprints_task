import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Completing_purshace {
    private WebDriver driver;
    public Completing_purshace(WebDriver driver){
        this.driver = driver;
    }
    public void completePurchase(String fullName, String number , String full_name, String bMobile , String addressNew , String zipCode1 , String city1 , String city2 , String bAddress, String zipCode2  ) throws InterruptedException {

        Thread.sleep(10000);
        WebElement cart = driver.findElement(By.id("sw_dropdown_4700"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].click();", cart);
        WebElement checkout = driver.findElement(By.xpath("//a[@href='https://egyptlaptop.com/checkout']"));
        checkout.click();
        WebElement name = driver.findElement(By.id("litecheckout_fullname"));
        name.sendKeys(fullName);
        WebElement phone = driver.findElement(By.id("litecheckout_phone"));
        phone.sendKeys(number);
        WebElement checkbox = driver.findElement(By.id("sw_litecheckout_step_billing_address_suffix_no"));
        checkbox.click();
        WebElement fullname = driver.findElement(By.id("litecheckout_b_fullname"));
        fullname.sendKeys(full_name);
        WebElement mobile = driver.findElement(By.id("litecheckout_b_phone"));
        mobile.sendKeys(bMobile);
        WebElement address = driver.findElement(By.id("litecheckout_b_address"));
        address.sendKeys(addressNew);
        WebElement zipcode = driver.findElement(By.id("litecheckout_b_zipcode"));
        zipcode.sendKeys(zipCode1);
        WebElement city = driver.findElement(By.id("litecheckout_b_city"));
        city.sendKeys(city1);
        WebElement state = driver.findElement(By.id("litecheckout_b_state"));
        state.click();
        Select choice1 = new Select(state);
        choice1.selectByIndex(7);
        WebElement city_delivery = driver.findElement(By.id("litecheckout_city"));
        city_delivery.sendKeys(city2);
        WebElement Cities = driver.findElement(By.xpath("//select[@data-ca-lite-checkout-field='user_data.s_state']"));
        Cities.click();
        Select choice2 = new Select(Cities);
        choice2.selectByIndex(7);
        WebElement address_b = driver.findElement(By.id("litecheckout_s_address"));
        address_b.sendKeys(bAddress);
        WebElement zipcode_b = driver.findElement(By.id("litecheckout_s_zipcode"));
        zipcode_b.clear();
        zipcode_b.sendKeys(zipCode2);
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='accept_terms']"));
        checkbox2.click();
        WebElement place_order = driver.findElement(By.id("litecheckout_place_order"));
        place_order.click();












    }
}
