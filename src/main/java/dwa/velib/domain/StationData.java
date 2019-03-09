
package dwa.velib.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StationData implements Serializable
{

    private List<Station> records = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7448710913733429871L;

    public List<Station> getRecords() {
        return records;
    }

    public void setRecords(List<Station> records) {
        this.records = records;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
