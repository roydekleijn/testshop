package InteractWithBrowser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class SearchTest extends DriverBase {

    public void searchQuery() {
        driver.findElement(By.id("search_query_top")).sendKeys("iPod");
        
        driver.findElement(By.name("submit_search")).click();
        
        List<WebElement> searchResults = driver.findElements(By.cssSelector("ul#product_list li div h3"));
        List<String> searchResultTitles = new ArrayList<String>();
        for (WebElement result : searchResults) {
            searchResultTitles.add(result.getText());
        }
    }
}
