
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
    "fgm",
    "fga",
    "fgyds",
    "totpfg",
    "xpmade",
    "xpmissed",
    "xpa",
    "xpb",
    "xptot",
    "id"
})
public class Kicker_ {

    @JsonProperty("name")
    private String name;
    @JsonProperty("fgm")
    private Integer fgm;
    @JsonProperty("fga")
    private Integer fga;
    @JsonProperty("fgyds")
    private Integer fgyds;
    @JsonProperty("totpfg")
    private Integer totpfg;
    @JsonProperty("xpmade")
    private Integer xpmade;
    @JsonProperty("xpmissed")
    private Integer xpmissed;
    @JsonProperty("xpa")
    private Integer xpa;
    @JsonProperty("xpb")
    private Integer xpb;
    @JsonProperty("xptot")
    private Integer xptot;
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

    public Kicker_ withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The fgm
     */
    @JsonProperty("fgm")
    public Integer getFgm() {
        return fgm;
    }

    /**
     * 
     * @param fgm
     *     The fgm
     */
    @JsonProperty("fgm")
    public void setFgm(Integer fgm) {
        this.fgm = fgm;
    }

    public Kicker_ withFgm(Integer fgm) {
        this.fgm = fgm;
        return this;
    }

    /**
     * 
     * @return
     *     The fga
     */
    @JsonProperty("fga")
    public Integer getFga() {
        return fga;
    }

    /**
     * 
     * @param fga
     *     The fga
     */
    @JsonProperty("fga")
    public void setFga(Integer fga) {
        this.fga = fga;
    }

    public Kicker_ withFga(Integer fga) {
        this.fga = fga;
        return this;
    }

    /**
     * 
     * @return
     *     The fgyds
     */
    @JsonProperty("fgyds")
    public Integer getFgyds() {
        return fgyds;
    }

    /**
     * 
     * @param fgyds
     *     The fgyds
     */
    @JsonProperty("fgyds")
    public void setFgyds(Integer fgyds) {
        this.fgyds = fgyds;
    }

    public Kicker_ withFgyds(Integer fgyds) {
        this.fgyds = fgyds;
        return this;
    }

    /**
     * 
     * @return
     *     The totpfg
     */
    @JsonProperty("totpfg")
    public Integer getTotpfg() {
        return totpfg;
    }

    /**
     * 
     * @param totpfg
     *     The totpfg
     */
    @JsonProperty("totpfg")
    public void setTotpfg(Integer totpfg) {
        this.totpfg = totpfg;
    }

    public Kicker_ withTotpfg(Integer totpfg) {
        this.totpfg = totpfg;
        return this;
    }

    /**
     * 
     * @return
     *     The xpmade
     */
    @JsonProperty("xpmade")
    public Integer getXpmade() {
        return xpmade;
    }

    /**
     * 
     * @param xpmade
     *     The xpmade
     */
    @JsonProperty("xpmade")
    public void setXpmade(Integer xpmade) {
        this.xpmade = xpmade;
    }

    public Kicker_ withXpmade(Integer xpmade) {
        this.xpmade = xpmade;
        return this;
    }

    /**
     * 
     * @return
     *     The xpmissed
     */
    @JsonProperty("xpmissed")
    public Integer getXpmissed() {
        return xpmissed;
    }

    /**
     * 
     * @param xpmissed
     *     The xpmissed
     */
    @JsonProperty("xpmissed")
    public void setXpmissed(Integer xpmissed) {
        this.xpmissed = xpmissed;
    }

    public Kicker_ withXpmissed(Integer xpmissed) {
        this.xpmissed = xpmissed;
        return this;
    }

    /**
     * 
     * @return
     *     The xpa
     */
    @JsonProperty("xpa")
    public Integer getXpa() {
        return xpa;
    }

    /**
     * 
     * @param xpa
     *     The xpa
     */
    @JsonProperty("xpa")
    public void setXpa(Integer xpa) {
        this.xpa = xpa;
    }

    public Kicker_ withXpa(Integer xpa) {
        this.xpa = xpa;
        return this;
    }

    /**
     * 
     * @return
     *     The xpb
     */
    @JsonProperty("xpb")
    public Integer getXpb() {
        return xpb;
    }

    /**
     * 
     * @param xpb
     *     The xpb
     */
    @JsonProperty("xpb")
    public void setXpb(Integer xpb) {
        this.xpb = xpb;
    }

    public Kicker_ withXpb(Integer xpb) {
        this.xpb = xpb;
        return this;
    }

    /**
     * 
     * @return
     *     The xptot
     */
    @JsonProperty("xptot")
    public Integer getXptot() {
        return xptot;
    }

    /**
     * 
     * @param xptot
     *     The xptot
     */
    @JsonProperty("xptot")
    public void setXptot(Integer xptot) {
        this.xptot = xptot;
    }

    public Kicker_ withXptot(Integer xptot) {
        this.xptot = xptot;
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

    public Kicker_ withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(fgm).append(fga).append(fgyds).append(totpfg).append(xpmade).append(xpmissed).append(xpa).append(xpb).append(xptot).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Kicker_) == false) {
            return false;
        }
        Kicker_ rhs = ((Kicker_) other);
        return new EqualsBuilder().append(name, rhs.name).append(fgm, rhs.fgm).append(fga, rhs.fga).append(fgyds, rhs.fgyds).append(totpfg, rhs.totpfg).append(xpmade, rhs.xpmade).append(xpmissed, rhs.xpmissed).append(xpa, rhs.xpa).append(xpb, rhs.xpb).append(xptot, rhs.xptot).append(id, rhs.id).isEquals();
    }

}
