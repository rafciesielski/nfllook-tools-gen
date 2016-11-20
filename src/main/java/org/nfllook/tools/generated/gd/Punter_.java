
package org.nfllook.tools.generated.gd;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "pts",
    "yds",
    "avg",
    "i20",
    "lng",
    "id"
})
public class Punter_ {

    @JsonProperty("name")
    private String name;
    @JsonProperty("pts")
    private Integer pts;
    @JsonProperty("yds")
    private Integer yds;
    @JsonProperty("avg")
    private Integer avg;
    @JsonProperty("i20")
    private Integer i20;
    @JsonProperty("lng")
    private Integer lng;
    @JsonProperty("id")
    private String id;

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Punter_ withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The pts
     */
    @JsonProperty("pts")
    public Integer getPts() {
        return pts;
    }

    /**
     * 
     * @param pts
     *     The pts
     */
    @JsonProperty("pts")
    public void setPts(Integer pts) {
        this.pts = pts;
    }

    public Punter_ withPts(Integer pts) {
        this.pts = pts;
        return this;
    }

    /**
     * 
     * @return
     *     The yds
     */
    @JsonProperty("yds")
    public Integer getYds() {
        return yds;
    }

    /**
     * 
     * @param yds
     *     The yds
     */
    @JsonProperty("yds")
    public void setYds(Integer yds) {
        this.yds = yds;
    }

    public Punter_ withYds(Integer yds) {
        this.yds = yds;
        return this;
    }

    /**
     * 
     * @return
     *     The avg
     */
    @JsonProperty("avg")
    public Integer getAvg() {
        return avg;
    }

    /**
     * 
     * @param avg
     *     The avg
     */
    @JsonProperty("avg")
    public void setAvg(Integer avg) {
        this.avg = avg;
    }

    public Punter_ withAvg(Integer avg) {
        this.avg = avg;
        return this;
    }

    /**
     * 
     * @return
     *     The i20
     */
    @JsonProperty("i20")
    public Integer getI20() {
        return i20;
    }

    /**
     * 
     * @param i20
     *     The i20
     */
    @JsonProperty("i20")
    public void setI20(Integer i20) {
        this.i20 = i20;
    }

    public Punter_ withI20(Integer i20) {
        this.i20 = i20;
        return this;
    }

    /**
     * 
     * @return
     *     The lng
     */
    @JsonProperty("lng")
    public Integer getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    @JsonProperty("lng")
    public void setLng(Integer lng) {
        this.lng = lng;
    }

    public Punter_ withLng(Integer lng) {
        this.lng = lng;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Punter_ withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(pts).append(yds).append(avg).append(i20).append(lng).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Punter_) == false) {
            return false;
        }
        Punter_ rhs = ((Punter_) other);
        return new EqualsBuilder().append(name, rhs.name).append(pts, rhs.pts).append(yds, rhs.yds).append(avg, rhs.avg).append(i20, rhs.i20).append(lng, rhs.lng).append(id, rhs.id).isEquals();
    }

}
