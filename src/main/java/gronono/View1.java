package gronono;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "view1", layout = MyLayout.class)
@RouteAlias(value = "", layout = MyLayout.class)
public class View1 extends Div {
    
    public View1() {
        this.add(new Span("View 1"));
        this.add(new Button("Goto View 2", event -> UI.getCurrent().navigate(View2.class)));
    }
}
