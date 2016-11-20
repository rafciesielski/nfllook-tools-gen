
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
    "cmp",
    "yds",
    "tds",
    "ints",
    "twopta",
    "twoptm",
    "id"
})
public class Passer {

    @JsonProperty("name")
    private String name;
    @JsonProperty("att")
    private Integer att;
    @JsonProperty("cmp")
    private Integer cmp;
    @JsonProperty("yds")
    private Integer yds;
    @JsonProperty("tds")
    private Integer tds;
    @JsonProperty("ints")
    private Integer ints;
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

    public Passer withName(String name) {
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

    public Passer withAtt(Integer att) {
        this.att = att;
        return this;
    }

    /**
     * 
     * @return
     *     The cmp
     */
    @JsonProperty("cmp")
    public Integer getCmp() {
        return cmp;
    }

    /**
     * 
     * @param cmp
     *     The cmp
     */
    @JsonProperty("cmp")
    public void setCmp(Integer cmp) {
        this.cmp = cmp;
    }

    public Passer withCmp(Integer cmp) {
        this.cmp = cmp;
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

    public Passer withYds(Integer yds) {
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

    public Passer withTds(Integer tds) {
        this.tds = tds;
        return this;
    }

    /**
     * 
     * @return
     *     The ints
     */
    @JsonProperty("ints")
    public Integer getInts() {
        return ints;
    }

    /**
     * 
     * @param ints
     *     The ints
     */
    @JsonProperty("ints")
    public void setInts(Integer ints) {
        this.ints = ints;
    }

    public Passer withInts(Integer ints) {
        this.ints = ints;
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

    public Passer withTwopta(Integer twopta) {
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

    public Passer withTwoptm(Integer twoptm) {
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

    public Passer withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(att).append(cmp).append(yds).append(tds).append(ints).append(twopta).append(twoptm).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Passer) == false) {
            return false;
        }
        Passer rhs = ((Passer) other);
        return new EqualsBuilder().append(name, rhs.name).append(att, rhs.att).append(cmp, rhs.cmp).append(yds, rhs.yds).append(tds, rhs.tds).append(ints, rhs.ints).append(twopta, rhs.twopta).append(twoptm, rhs.twoptm).append(id, rhs.id).isEquals();
    }

}
