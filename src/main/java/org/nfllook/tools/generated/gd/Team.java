
package org.nfllook.tools.generated.gd;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totfd",
    "totyds",
    "pyds",
    "ryds",
    "pen",
    "penyds",
    "trnovr",
    "pt",
    "ptyds",
    "ptavg",
    "top"
})
public class Team {

    @JsonProperty("totfd")
    private Integer totfd;
    @JsonProperty("totyds")
    private Integer totyds;
    @JsonProperty("pyds")
    private Integer pyds;
    @JsonProperty("ryds")
    private Integer ryds;
    @JsonProperty("pen")
    private Integer pen;
    @JsonProperty("penyds")
    private Integer penyds;
    @JsonProperty("trnovr")
    private Integer trnovr;
    @JsonProperty("pt")
    private Integer pt;
    @JsonProperty("ptyds")
    private Integer ptyds;
    @JsonProperty("ptavg")
    private Integer ptavg;
    @JsonProperty("top")
    private String top;

    /**
     * 
     * @return
     *     The totfd
     */
    @JsonProperty("totfd")
    public Integer getTotfd() {
        return totfd;
    }

    /**
     * 
     * @param totfd
     *     The totfd
     */
    @JsonProperty("totfd")
    public void setTotfd(Integer totfd) {
        this.totfd = totfd;
    }

    public Team withTotfd(Integer totfd) {
        this.totfd = totfd;
        return this;
    }

    /**
     * 
     * @return
     *     The totyds
     */
    @JsonProperty("totyds")
    public Integer getTotyds() {
        return totyds;
    }

    /**
     * 
     * @param totyds
     *     The totyds
     */
    @JsonProperty("totyds")
    public void setTotyds(Integer totyds) {
        this.totyds = totyds;
    }

    public Team withTotyds(Integer totyds) {
        this.totyds = totyds;
        return this;
    }

    /**
     * 
     * @return
     *     The pyds
     */
    @JsonProperty("pyds")
    public Integer getPyds() {
        return pyds;
    }

    /**
     * 
     * @param pyds
     *     The pyds
     */
    @JsonProperty("pyds")
    public void setPyds(Integer pyds) {
        this.pyds = pyds;
    }

    public Team withPyds(Integer pyds) {
        this.pyds = pyds;
        return this;
    }

    /**
     * 
     * @return
     *     The ryds
     */
    @JsonProperty("ryds")
    public Integer getRyds() {
        return ryds;
    }

    /**
     * 
     * @param ryds
     *     The ryds
     */
    @JsonProperty("ryds")
    public void setRyds(Integer ryds) {
        this.ryds = ryds;
    }

    public Team withRyds(Integer ryds) {
        this.ryds = ryds;
        return this;
    }

    /**
     * 
     * @return
     *     The pen
     */
    @JsonProperty("pen")
    public Integer getPen() {
        return pen;
    }

    /**
     * 
     * @param pen
     *     The pen
     */
    @JsonProperty("pen")
    public void setPen(Integer pen) {
        this.pen = pen;
    }

    public Team withPen(Integer pen) {
        this.pen = pen;
        return this;
    }

    /**
     * 
     * @return
     *     The penyds
     */
    @JsonProperty("penyds")
    public Integer getPenyds() {
        return penyds;
    }

    /**
     * 
     * @param penyds
     *     The penyds
     */
    @JsonProperty("penyds")
    public void setPenyds(Integer penyds) {
        this.penyds = penyds;
    }

    public Team withPenyds(Integer penyds) {
        this.penyds = penyds;
        return this;
    }

    /**
     * 
     * @return
     *     The trnovr
     */
    @JsonProperty("trnovr")
    public Integer getTrnovr() {
        return trnovr;
    }

    /**
     * 
     * @param trnovr
     *     The trnovr
     */
    @JsonProperty("trnovr")
    public void setTrnovr(Integer trnovr) {
        this.trnovr = trnovr;
    }

    public Team withTrnovr(Integer trnovr) {
        this.trnovr = trnovr;
        return this;
    }

    /**
     * 
     * @return
     *     The pt
     */
    @JsonProperty("pt")
    public Integer getPt() {
        return pt;
    }

    /**
     * 
     * @param pt
     *     The pt
     */
    @JsonProperty("pt")
    public void setPt(Integer pt) {
        this.pt = pt;
    }

    public Team withPt(Integer pt) {
        this.pt = pt;
        return this;
    }

    /**
     * 
     * @return
     *     The ptyds
     */
    @JsonProperty("ptyds")
    public Integer getPtyds() {
        return ptyds;
    }

    /**
     * 
     * @param ptyds
     *     The ptyds
     */
    @JsonProperty("ptyds")
    public void setPtyds(Integer ptyds) {
        this.ptyds = ptyds;
    }

    public Team withPtyds(Integer ptyds) {
        this.ptyds = ptyds;
        return this;
    }

    /**
     * 
     * @return
     *     The ptavg
     */
    @JsonProperty("ptavg")
    public Integer getPtavg() {
        return ptavg;
    }

    /**
     * 
     * @param ptavg
     *     The ptavg
     */
    @JsonProperty("ptavg")
    public void setPtavg(Integer ptavg) {
        this.ptavg = ptavg;
    }

    public Team withPtavg(Integer ptavg) {
        this.ptavg = ptavg;
        return this;
    }

    /**
     * 
     * @return
     *     The top
     */
    @JsonProperty("top")
    public String getTop() {
        return top;
    }

    /**
     * 
     * @param top
     *     The top
     */
    @JsonProperty("top")
    public void setTop(String top) {
        this.top = top;
    }

    public Team withTop(String top) {
        this.top = top;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totfd).append(totyds).append(pyds).append(ryds).append(pen).append(penyds).append(trnovr).append(pt).append(ptyds).append(ptavg).append(top).toHashCode();
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
        return new EqualsBuilder().append(totfd, rhs.totfd).append(totyds, rhs.totyds).append(pyds, rhs.pyds).append(ryds, rhs.ryds).append(pen, rhs.pen).append(penyds, rhs.penyds).append(trnovr, rhs.trnovr).append(pt, rhs.pt).append(ptyds, rhs.ptyds).append(ptavg, rhs.ptavg).append(top, rhs.top).isEquals();
    }

}
