package at.spengergasse.vaadin.views.welcome;

import at.spengergasse.vaadin.views.MainLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Willkommen")
@Route(value = "welcome", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class Welcome extends VerticalLayout {

    public Welcome() {

        HorizontalLayout layout = new HorizontalLayout();
        layout.addClassName("welcome-panel");

//        layout.setJustifyContentMode( JustifyContentMode.CENTER );
//        layout.setWidthFull();
//        layout.getStyle().setBackgroundColor("--lumo-primary-color");
//        layout.getStyle().setColor("white");

        layout.add(new H3("Willkommen"));

        add(layout);
    }
}
