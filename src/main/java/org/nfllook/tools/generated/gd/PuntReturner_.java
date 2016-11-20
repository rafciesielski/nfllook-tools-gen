
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
    "ret",
    "avg",
    "tds",
    "lng",
    "lngtd",
    "id"
})
public class PuntReturner_ {

    @JsonProperty("name")
    private String name;
    @JsonProperty("ret")
    private Integer ret;
    @JsonProperty("avg")
    private Integer avg;
    @JsonProperty("tds")
    private Integer tds;
    @JsonProperty("lng")
    private Integer lng;
    @JsonProperty("lngtd")
    private Integer lngtd;
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

    public PuntReturner_ withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The ret
     */
    @JsonProperty("ret")
    public Integer getRet() {
        return ret;
    }

    /**
     * 
     * @param ret
     *     The ret
     */
    @JsonProperty("ret")
    public void setRet(Integer ret) {
        this.ret = ret;
    }

    public PuntReturner_ withRet(Integer ret) {
        this.ret = ret;
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

    public PuntReturner_ withAvg(Integer avg) {
        this.avg = avg;
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

    public PuntReturner_ withTds(Integer tds) {
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

    public PuntReturner_ withLng(Integer lng) {
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

    public PuntReturner_ withLngtd(Integer lngtd) {
        this.lngtd = lngtd;
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

    public PuntReturner_ withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(ret).append(avg).append(tds).append(lng).append(lngtd).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PuntReturner_) == false) {
            return false;
        }
        PuntReturner_ rhs = ((PuntReturner_) other);
        return new EqualsBuilder().append(name, rhs.name).append(ret, rhs.ret).append(avg, rhs.avg).append(tds, rhs.tds).append(lng, rhs.lng).append(lngtd, rhs.lngtd).append(id, rhs.id).isEquals();
    }

}
