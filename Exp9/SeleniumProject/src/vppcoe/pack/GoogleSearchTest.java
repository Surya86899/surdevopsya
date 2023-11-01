package vppcoe.pack;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Surya\\\\Downloads\\\\Exe files\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com/");

        // Find the search input field and enter a search query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("K Suryanarayan Dora");

        // Submit the search query
        searchBox.submit();

        // Wait for the search results page to load
        try {
            Thread.sleep(2000); // You can use a more robust waiting strategy here
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify if the search results page title contains the search query
        String pageTitle = driver.getTitle();
        String expectedTitle = "K Suryanarayan Dora - Google Search";

        if (pageTitle.equals(expectedTitle)) {
            System.out.println("Test Successful");
        } else {
            System.out.println("Test Failure");
        }

        // Close the browser
        driver.quit();
    }
}
