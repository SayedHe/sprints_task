import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EgyptLaptopTests {
    private Cart_adding cart_adding;
    private Completing_purshace completing_purshace;
    private Product_search product_search;
    private WebDriver driver;

@BeforeClass
    public void beforeClass(){
    driver = new ChromeDriver();
    WebDriverManager.chromedriver().setup();
    driver.manage().window().maximize();
    product_search = new Product_search(driver);
    completing_purshace = new Completing_purshace(driver);
    cart_adding = new Cart_adding(driver);
}
@BeforeMethod
public void beforeMethod(){
    driver.get("https://egyptlaptop.com/");
}
@Test
    public void test1() throws InterruptedException {
product_search.searchProduct("laptop");
cart_adding.addCart();
completing_purshace.completePurchase(
        "mahmoud ahmad",
        "01121836786",
        "mahmoud ahmad mohamed",
        "01121836786",
        "9 agouza street giza",
        "2222",
        "cairo",
        "cairo",
        "01121836786",
        "2222");
}


@Test
public void test2() throws InterruptedException {


    product_search.searchProduct("laptop");
    cart_adding.addCart();
    completing_purshace.completePurchase("" ,
            "01121836786",
            "" ,
            "" ,
            "",
            "" ,
            "" ,
            "cairo",
            "9 agouza street giza" ,
            "2222");


}

@Test

    public void test3() throws InterruptedException{

    product_search.searchProduct("laptop");
    cart_adding.addCart();
    completing_purshace.completePurchase("mahmoud ahmad" ,
            "",
            "mahmoud ahmad mohamed" ,
            "01121836786" ,
            "9 agouza street giza",
            "2222" ,
            "cairo" ,
            "",
            "" ,
            "");





}


}