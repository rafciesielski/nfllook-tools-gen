
package org.nfllook.tools.generated.ws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "w",
    "l",
    "d"
})
public class Opp {

    @JsonProperty("w")
    private Integer w;
    @JsonProperty("l")
    private Integer l;
    @JsonProperty("d")
    private Integer d;

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

    public Opp withW(Integer w) {
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

    public Opp withL(Integer l) {
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

    public Opp withD(Integer d) {
        this.d = d;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(w).append(l).append(d).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Opp) == false) {
            return false;
        }
        Opp rhs = ((Opp) other);
        return new EqualsBuilder().append(w, rhs.w).append(l, rhs.l).append(d, rhs.d).isEquals();
    }

}
