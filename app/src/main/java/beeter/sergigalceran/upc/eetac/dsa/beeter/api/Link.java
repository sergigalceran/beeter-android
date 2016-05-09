package beeter.sergigalceran.upc.eetac.dsa.beeter.api;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sergi1 on 09/04/2015.
 */
public class Link {

    private String target;
    private Map<String, String> parameters;

    public Link() {
        parameters = new HashMap<String, String>();
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }
}
