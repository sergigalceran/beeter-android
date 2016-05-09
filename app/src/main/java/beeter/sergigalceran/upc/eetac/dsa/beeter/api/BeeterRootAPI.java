package beeter.sergigalceran.upc.eetac.dsa.beeter.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergi1 on 09/04/2015.
 */
public class BeeterRootAPI {

    private Map<String, Link> links;

    public BeeterRootAPI() {
        links = new HashMap<String, Link>();
    }

    public Map<String, Link> getLinks() {
        return links;
    }

}
