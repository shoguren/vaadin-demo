package org.shoguren.vaadindemo;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

@SpringComponent
@UIScope
public class Greeter {

    public String sayHello() {
        return "Hellow from bean " + toString();
    }
}
