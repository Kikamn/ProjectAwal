package stepDef;

import io.cucumber.java.en.Given;
import pages.WebPage;

public class WebStep {
    WebPage webPage;
    public WebStep(){
        this.webPage = new WebPage();
    }

    @Given("Open link Metro")
    public void openLinkMetro() {
        webPage.openLinkMetro();
    }
}
