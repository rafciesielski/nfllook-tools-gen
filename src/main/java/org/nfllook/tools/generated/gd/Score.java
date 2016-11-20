
package org.nfllook.tools.generated.gd;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "1",
    "2",
    "3",
    "4",
    "5",
    "T"
})
public class Score {

    @JsonProperty("1")
    private Integer _1;
    @JsonProperty("2")
    private Integer _2;
    @JsonProperty("3")
    private Integer _3;
    @JsonProperty("4")
    private Integer _4;
    @JsonProperty("5")
    private Integer _5;
    @JsonProperty("T")
    private Integer t;

    /**
     * 
     * @return
     *     The _1
     */
    @JsonProperty("1")
    public Integer get1() {
        return _1;
    }

    /**
     * 
     * @param _1
     *     The 1
     */
    @JsonProperty("1")
    public void set1(Integer _1) {
        this._1 = _1;
    }

    public Score with1(Integer _1) {
        this._1 = _1;
        return this;
    }

    /**
     * 
     * @return
     *     The _2
     */
    @JsonProperty("2")
    public Integer get2() {
        return _2;
    }

    /**
     * 
     * @param _2
     *     The 2
     */
    @JsonProperty("2")
    public void set2(Integer _2) {
        this._2 = _2;
    }

    public Score with2(Integer _2) {
        this._2 = _2;
        return this;
    }

    /**
     * 
     * @return
     *     The _3
     */
    @JsonProperty("3")
    public Integer get3() {
        return _3;
    }

    /**
     * 
     * @param _3
     *     The 3
     */
    @JsonProperty("3")
    public void set3(Integer _3) {
        this._3 = _3;
    }

    public Score with3(Integer _3) {
        this._3 = _3;
        return this;
    }

    /**
     * 
     * @return
     *     The _4
     */
    @JsonProperty("4")
    public Integer get4() {
        return _4;
    }

    /**
     * 
     * @param _4
     *     The 4
     */
    @JsonProperty("4")
    public void set4(Integer _4) {
        this._4 = _4;
    }

    public Score with4(Integer _4) {
        this._4 = _4;
        return this;
    }

    /**
     * 
     * @return
     *     The _5
     */
    @JsonProperty("5")
    public Integer get5() {
        return _5;
    }

    /**
     * 
     * @param _5
     *     The 5
     */
    @JsonProperty("5")
    public void set5(Integer _5) {
        this._5 = _5;
    }

    public Score with5(Integer _5) {
        this._5 = _5;
        return this;
    }

    /**
     * 
     * @return
     *     The t
     */
    @JsonProperty("T")
    public Integer getT() {
        return t;
    }

    /**
     * 
     * @param t
     *     The T
     */
    @JsonProperty("T")
    public void setT(Integer t) {
        this.t = t;
    }

    public Score withT(Integer t) {
        this.t = t;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(_1).append(_2).append(_3).append(_4).append(_5).append(t).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Score) == false) {
            return false;
        }
        Score rhs = ((Score) other);
        return new EqualsBuilder().append(_1, rhs._1).append(_2, rhs._2).append(_3, rhs._3).append(_4, rhs._4).append(_5, rhs._5).append(t, rhs.t).isEquals();
    }

}
