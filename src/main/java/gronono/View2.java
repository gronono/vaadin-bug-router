package gronono;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "view2", layout = MyLayout.class)
public class View2 extends Div {
    
    public View2() {
        this.add(new Span("View 2"));
        this.add(new Button("Goto View 1", event -> UI.getCurrent().navigate(View1.class)));
    }
}
