package uk.allianz.apigee.enablement.app;

import uk.allianz.apigee.enablement.rest.MyRestService;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


public class MyApplication extends Application {
    private Set<Object> singletons = new HashSet<Object>();
    public MyApplication() {
        // Register services
        singletons.add(new MyRestService());
    }
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}

