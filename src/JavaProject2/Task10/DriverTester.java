package JavaProject2.Task10;

public class DriverTester {
    public static void main(String[] args) {
        RemoteWebDriver[] drivers = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver driver:drivers) {
            driver.open();
            driver.close();
            driver.getTitle();
            driver.getScreenshot();
            driver.navigate();
        }
    }


}
