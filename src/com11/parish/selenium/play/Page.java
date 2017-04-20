package com11.parish.selenium.play;

import java.util.ArrayList;
import java.util.List;

public class Page {

    List<LinkText> linkTexts = new ArrayList<>();

    public List<LinkText> getLinkTexts() {
        return linkTexts;
    }

    public void setLinkTexts(List<LinkText> linkTexts) {
        this.linkTexts = linkTexts;
    }

}
