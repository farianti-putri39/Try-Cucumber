package stepDef;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.time.Duration;

public class Hooks {
    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("After All");
    }

    @Before
    public void beforeTest() {
        System.out.println("Before Test");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @After
    public void afterTest() throws InterruptedException {
        System.out.println("After Test");
        Thread.sleep(2000);
        driver.quit();
    }
}
