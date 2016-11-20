
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
    "att",
    "yds",
    "tds",
    "lng",
    "lngtd",
    "twopta",
    "twoptm",
    "id"
})
public class Rusher_ {

    @JsonProperty("name")
    private String name;
    @JsonProperty("att")
    private Integer att;
    @JsonProperty("yds")
    private Integer yds;
    @JsonProperty("tds")
    private Integer tds;
    @JsonProperty("lng")
    private Integer lng;
    @JsonProperty("lngtd")
    private Integer lngtd;
    @JsonProperty("twopta")
    private Integer twopta;
    @JsonProperty("twoptm")
    private Integer twoptm;
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

    public Rusher_ withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The att
     */
    @JsonProperty("att")
    public Integer getAtt() {
        return att;
    }

    /**
     * 
     * @param att
     *     The att
     */
    @JsonProperty("att")
    public void setAtt(Integer att) {
        this.att = att;
    }

    public Rusher_ withAtt(Integer att) {
        this.att = att;
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

    public Rusher_ withYds(Integer yds) {
        this.yds = yds;
        return this;
    }

    /**
     * 
     * @return
     *     The tds
     */
    @JsonProperty("tds")
    public Integer getTds() {
        return tds;
    }

    /**
     * 
     * @param tds
     *     The tds
     */
    @JsonProperty("tds")
    public void setTds(Integer tds) {
        this.tds = tds;
    }

    public Rusher_ withTds(Integer tds) {
        this.tds = tds;
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

    public Rusher_ withLng(Integer lng) {
        this.lng = lng;
        return this;
    }

    /**
     * 
     * @return
     *     The lngtd
     */
    @JsonProperty("lngtd")
    public Integer getLngtd() {
        return lngtd;
    }

    /**
     * 
     * @param lngtd
     *     The lngtd
     */
    @JsonProperty("lngtd")
    public void setLngtd(Integer lngtd) {
        this.lngtd = lngtd;
    }

    public Rusher_ withLngtd(Integer lngtd) {
        this.lngtd = lngtd;
        return this;
    }

    /**
     * 
     * @return
     *     The twopta
     */
    @JsonProperty("twopta")
    public Integer getTwopta() {
        return twopta;
    }

    /**
     * 
     * @param twopta
     *     The twopta
     */
    @JsonProperty("twopta")
    public void setTwopta(Integer twopta) {
        this.twopta = twopta;
    }

    public Rusher_ withTwopta(Integer twopta) {
        this.twopta = twopta;
        return this;
    }

    /**
     * 
     * @return
     *     The twoptm
     */
    @JsonProperty("twoptm")
    public Integer getTwoptm() {
        return twoptm;
    }

    /**
     * 
     * @param twoptm
     *     The twoptm
     */
    @JsonProperty("twoptm")
    public void setTwoptm(Integer twoptm) {
        this.twoptm = twoptm;
    }

    public Rusher_ withTwoptm(Integer twoptm) {
        this.twoptm = twoptm;
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

    public Rusher_ withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(att).append(yds).append(tds).append(lng).append(lngtd).append(twopta).append(twoptm).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rusher_) == false) {
            return false;
        }
        Rusher_ rhs = ((Rusher_) other);
        return new EqualsBuilder().append(name, rhs.name).append(att, rhs.att).append(yds, rhs.yds).append(tds, rhs.tds).append(lng, rhs.lng).append(lngtd, rhs.lngtd).append(twopta, rhs.twopta).append(twoptm, rhs.twoptm).append(id, rhs.id).isEquals();
    }

}
