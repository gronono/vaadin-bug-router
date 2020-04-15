package gronono;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.router.RouterLink;

public class MyLayout extends AppLayout {
    
    public MyLayout() {
        this.addToNavbar(new RouterLink("View 1", View1.class));
        this.addToNavbar(new RouterLink("View 2", View2.class));
    }
}
