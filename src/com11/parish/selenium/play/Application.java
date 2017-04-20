package com11.parish.selenium.play;

import java.util.ArrayList;
import java.util.List;

public class Application {

    String url;
    List<Page> pages = new ArrayList<>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Application(String applicationUrl) {
        this.url = applicationUrl;
    }

    public List<Page> getPages() {
        return pages;
    }

}
