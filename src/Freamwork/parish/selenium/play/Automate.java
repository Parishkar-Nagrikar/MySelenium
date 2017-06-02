package Freamwork.parish.selenium.play;

public class Automate {

    private Application application;

    public static void main(String[] args) {
        Automate automate = new Automate();
        automate.automateApplication(Constants.CHROME_BROWSER,Constants.APPLICATION_URL);
    }

    private void automateApplication(String browser, String url) {

        application = new Application(url);

        Page homePage = createPage();
        addToApplication(homePage);

        ExecuteService.executeTest(browser , application);

    }

    private void addToApplication(Page homePage) {
        application.getPages().add(homePage);
    }

    private Page createPage() {
        Page homePage = new Page();

        LinkText linkText = new LinkText("Selenium Practice page");

        linkText.addElements("Name", "Selenium");
        linkText.addElements("Comments", "WelCome  to Selenium Training");

        homePage.getLinkTexts().add(linkText);

        return homePage;
    }
}
