package com11.parish.selenium.play;

import java.util.HashMap;
import java.util.Map;

public class LinkText {

    String name;

    public Map<String, String> getElements() {
        return elements;
    }

    Map<String,String> elements = new HashMap<String,String>();

    public LinkText(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addElements(String key, String value){
        elements.put(key,value);
    }

}
