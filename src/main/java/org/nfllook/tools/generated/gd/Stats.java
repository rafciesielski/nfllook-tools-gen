
package org.nfllook.tools.generated.gd;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "team",
    "passers",
    "rushers",
    "receivers",
    "kickers",
    "punters",
    "kickReturners",
    "puntReturners",
    "defenders"
})
public class Stats {

    @JsonProperty("team")
    private Team team;
    @JsonProperty("passers")
    private List<Passer> passers = new ArrayList<Passer>();
    @JsonProperty("rushers")
    private List<Rusher> rushers = new ArrayList<Rusher>();
    @JsonProperty("receivers")
    private List<Receiver> receivers = new ArrayList<Receiver>();
    @JsonProperty("kickers")
    private List<Kicker> kickers = new ArrayList<Kicker>();
    @JsonProperty("punters")
    private List<Punter> punters = new ArrayList<Punter>();
    @JsonProperty("kickReturners")
    private List<Object> kickReturners = new ArrayList<Object>();
    @JsonProperty("puntReturners")
    private List<PuntReturner> puntReturners = new ArrayList<PuntReturner>();
    @JsonProperty("defenders")
    private List<Defender> defenders = new ArrayList<Defender>();

    /**
     * 
     * @return
     *     The team
     */
    @JsonProperty("team")
    public Team getTeam() {
        return team;
    }

    /**
     * 
     * @param team
     *     The team
     */
    @JsonProperty("team")
    public void setTeam(Team team) {
        this.team = team;
    }

    public Stats withTeam(Team team) {
        this.team = team;
        return this;
    }

    /**
     * 
     * @return
     *     The passers
     */
    @JsonProperty("passers")
    public List<Passer> getPassers() {
        return passers;
    }

    /**
     * 
     * @param passers
     *     The passers
     */
    @JsonProperty("passers")
    public void setPassers(List<Passer> passers) {
        this.passers = passers;
    }

    public Stats withPassers(List<Passer> passers) {
        this.passers = passers;
        return this;
    }

    /**
     * 
     * @return
     *     The rushers
     */
    @JsonProperty("rushers")
    public List<Rusher> getRushers() {
        return rushers;
    }

    /**
     * 
     * @param rushers
     *     The rushers
     */
    @JsonProperty("rushers")
    public void setRushers(List<Rusher> rushers) {
        this.rushers = rushers;
    }

    public Stats withRushers(List<Rusher> rushers) {
        this.rushers = rushers;
        return this;
    }

    /**
     * 
     * @return
     *     The receivers
     */
    @JsonProperty("receivers")
    public List<Receiver> getReceivers() {
        return receivers;
    }

    /**
     * 
     * @param receivers
     *     The receivers
     */
    @JsonProperty("receivers")
    public void setReceivers(List<Receiver> receivers) {
        this.receivers = receivers;
    }

    public Stats withReceivers(List<Receiver> receivers) {
        this.receivers = receivers;
        return this;
    }

    /**
     * 
     * @return
     *     The kickers
     */
    @JsonProperty("kickers")
    public List<Kicker> getKickers() {
        return kickers;
    }

    /**
     * 
     * @param kickers
     *     The kickers
     */
    @JsonProperty("kickers")
    public void setKickers(List<Kicker> kickers) {
        this.kickers = kickers;
    }

    public Stats withKickers(List<Kicker> kickers) {
        this.kickers = kickers;
        return this;
    }

    /**
     * 
     * @return
     *     The punters
     */
    @JsonProperty("punters")
    public List<Punter> getPunters() {
        return punters;
    }

    /**
     * 
     * @param punters
     *     The punters
     */
    @JsonProperty("punters")
    public void setPunters(List<Punter> punters) {
        this.punters = punters;
    }

    public Stats withPunters(List<Punter> punters) {
        this.punters = punters;
        return this;
    }

    /**
     * 
     * @return
     *     The kickReturners
     */
    @JsonProperty("kickReturners")
    public List<Object> getKickReturners() {
        return kickReturners;
    }

    /**
     * 
     * @param kickReturners
     *     The kickReturners
     */
    @JsonProperty("kickReturners")
    public void setKickReturners(List<Object> kickReturners) {
        this.kickReturners = kickReturners;
    }

    public Stats withKickReturners(List<Object> kickReturners) {
        this.kickReturners = kickReturners;
        return this;
    }

    /**
     * 
     * @return
     *     The puntReturners
     */
    @JsonProperty("puntReturners")
    public List<PuntReturner> getPuntReturners() {
        return puntReturners;
    }

    /**
     * 
     * @param puntReturners
     *     The puntReturners
     */
    @JsonProperty("puntReturners")
    public void setPuntReturners(List<PuntReturner> puntReturners) {
        this.puntReturners = puntReturners;
    }

    public Stats withPuntReturners(List<PuntReturner> puntReturners) {
        this.puntReturners = puntReturners;
        return this;
    }

    /**
     * 
     * @return
     *     The defenders
     */
    @JsonProperty("defenders")
    public List<Defender> getDefenders() {
        return defenders;
    }

    /**
     * 
     * @param defenders
     *     The defenders
     */
    @JsonProperty("defenders")
    public void setDefenders(List<Defender> defenders) {
        this.defenders = defenders;
    }

    public Stats withDefenders(List<Defender> defenders) {
        this.defenders = defenders;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(team).append(passers).append(rushers).append(receivers).append(kickers).append(punters).append(kickReturners).append(puntReturners).append(defenders).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stats) == false) {
            return false;
        }
        Stats rhs = ((Stats) other);
        return new EqualsBuilder().append(team, rhs.team).append(passers, rhs.passers).append(rushers, rhs.rushers).append(receivers, rhs.receivers).append(kickers, rhs.kickers).append(punters, rhs.punters).append(kickReturners, rhs.kickReturners).append(puntReturners, rhs.puntReturners).append(defenders, rhs.defenders).isEquals();
    }

}
