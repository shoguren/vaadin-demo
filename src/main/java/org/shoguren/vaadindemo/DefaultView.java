package org.shoguren.vaadindemo;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

@SpringView(name = DefaultView.VIEW_NAME)
public class DefaultView extends VerticalLayout implements View {
    public static final String VIEW_NAME = "";

    private final Greeter greeter;

    @Autowired
    public DefaultView(Greeter greeter) {
        this.greeter = greeter;
    }

    @PostConstruct
    void init() {
        addComponent(new Label("This is the default view"));
        addComponent(new Label(greeter.sayHello() + "!"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        // This view is constructed in the init() method()
    }
}
