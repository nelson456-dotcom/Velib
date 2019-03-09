
package dwa.velib.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fields implements Serializable
{

    private Integer numbikesavailable;
    private Integer lastReported;
    private Integer stationId;
    private Integer isInstalled;
    private Integer isRenting;
    private Integer numdocksavailable;
    private Integer isReturning;
    private Integer capacity;
    private String name;
    private Double lon;
    private Double lat;
    private List<Double> xy = null;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5889771567483619855L;

    public Integer getNumbikesavailable() {
        return numbikesavailable;
    }

    public void setNumbikesavailable(Integer numbikesavailable) {
        this.numbikesavailable = numbikesavailable;
    }

    public Integer getLastReported() {
        return lastReported;
    }

    public void setLastReported(Integer lastReported) {
        this.lastReported = lastReported;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Integer getIsInstalled() {
        return isInstalled;
    }

    public void setIsInstalled(Integer isInstalled) {
        this.isInstalled = isInstalled;
    }

    public Integer getIsRenting() {
        return isRenting;
    }

    public void setIsRenting(Integer isRenting) {
        this.isRenting = isRenting;
    }

    public Integer getNumdocksavailable() {
        return numdocksavailable;
    }

    public void setNumdocksavailable(Integer numdocksavailable) {
        this.numdocksavailable = numdocksavailable;
    }

    public Integer getIsReturning() {
        return isReturning;
    }

    public void setIsReturning(Integer isReturning) {
        this.isReturning = isReturning;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public List<Double> getXy() {
        return xy;
    }

    public void setXy(List<Double> xy) {
        this.xy = xy;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
