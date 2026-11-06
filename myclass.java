package sqaauto;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myclass {

        public static void main(String[] args) {
                // System.out.println("hello");

                System.setProperty("WebDriver.chrome.driver", "E:\\chrome sel\\chromedriver-win64\\chromedriver.exe");

                WebDriver driver = new ChromeDriver();

                driver.manage().window().maximize();

                driver.get("https://www.shwapno.com/");

                // searching

                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-input"))).sendKeys("egg",
                                Keys.ENTER);

                // open product list

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='megamenutoggle']")))
                                .click();

                // add to bag

                wait.until(ExpectedConditions
                                .elementToBeClickable(By.xpath(
                                                "(//button[@type='button'][normalize-space()='Add to Bag'])[2]")))
                                .click();

                // open shoping bag

                driver.findElement(By.xpath(
                                "//button[@class='fixed right-3.5 top-1/2 z-[52] hidden -translate-y-1/2 text-xs font-medium leading-none text-white transition-all duration-300 ease-linear before:absolute before:left-[2px] before:top-[-4px] before:block before:h-[calc(100%+5px)] before:w-full before:rounded-[4px] before:bg-yellow md:block opacity-1']"))
                                .click();

                // add to cart

                wait.until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("//*[@id=\"headlessui-combobox-button-_r_22_\"]")))
                                .sendKeys("Bagherhat");

                wait.until(ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("//*[@id=\"headlessui-combobox-input-_r_27_\"]")))
                                .sendKeys("Amlapara");

                wait.until(ExpectedConditions
                                .elementToBeClickable(By.xpath(
                                                "//*[@id=\"headlessui-popover-panel-_r_1s_\"]/div/div/form/button")))
                                .click();

                // display product

                wait.until(ExpectedConditions.elementToBeClickable(
                                By.xpath("/html/body/main/div[2]/div/div/div[2]/div[1]/div[2]/div/div/div[3]/a/picture/img")))
                                .click();

        }

}
