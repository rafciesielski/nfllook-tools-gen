
package org.nfllook.tools.generated.ws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "w",
    "l",
    "d",
    "opp"
})
public class Team {

    @JsonProperty("name")
    private String name;
    @JsonProperty("w")
    private Integer w;
    @JsonProperty("l")
    private Integer l;
    @JsonProperty("d")
    private Integer d;
    @JsonProperty("opp")
    private Opp opp;

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

    public Team withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The w
     */
    @JsonProperty("w")
    public Integer getW() {
        return w;
    }

    /**
     * 
     * @param w
     *     The w
     */
    @JsonProperty("w")
    public void setW(Integer w) {
        this.w = w;
    }

    public Team withW(Integer w) {
        this.w = w;
        return this;
    }

    /**
     * 
     * @return
     *     The l
     */
    @JsonProperty("l")
    public Integer getL() {
        return l;
    }

    /**
     * 
     * @param l
     *     The l
     */
    @JsonProperty("l")
    public void setL(Integer l) {
        this.l = l;
    }

    public Team withL(Integer l) {
        this.l = l;
        return this;
    }

    /**
     * 
     * @return
     *     The d
     */
    @JsonProperty("d")
    public Integer getD() {
        return d;
    }

    /**
     * 
     * @param d
     *     The d
     */
    @JsonProperty("d")
    public void setD(Integer d) {
        this.d = d;
    }

    public Team withD(Integer d) {
        this.d = d;
        return this;
    }

    /**
     * 
     * @return
     *     The opp
     */
    @JsonProperty("opp")
    public Opp getOpp() {
        return opp;
    }

    /**
     * 
     * @param opp
     *     The opp
     */
    @JsonProperty("opp")
    public void setOpp(Opp opp) {
        this.opp = opp;
    }

    public Team withOpp(Opp opp) {
        this.opp = opp;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(w).append(l).append(d).append(opp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Team) == false) {
            return false;
        }
        Team rhs = ((Team) other);
        return new EqualsBuilder().append(name, rhs.name).append(w, rhs.w).append(l, rhs.l).append(d, rhs.d).append(opp, rhs.opp).isEquals();
    }

}
