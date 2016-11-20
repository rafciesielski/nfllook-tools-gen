
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
public class Stats_ {

    @JsonProperty("team")
    private Team_ team;
    @JsonProperty("passers")
    private List<Passer_> passers = new ArrayList<Passer_>();
    @JsonProperty("rushers")
    private List<Rusher_> rushers = new ArrayList<Rusher_>();
    @JsonProperty("receivers")
    private List<Receiver_> receivers = new ArrayList<Receiver_>();
    @JsonProperty("kickers")
    private List<Kicker_> kickers = new ArrayList<Kicker_>();
    @JsonProperty("punters")
    private List<Punter_> punters = new ArrayList<Punter_>();
    @JsonProperty("kickReturners")
    private List<KickReturner> kickReturners = new ArrayList<KickReturner>();
    @JsonProperty("puntReturners")
    private List<PuntReturner_> puntReturners = new ArrayList<PuntReturner_>();
    @JsonProperty("defenders")
    private List<Defender_> defenders = new ArrayList<Defender_>();

    /**
     * 
     * @return
     *     The team
     */
    @JsonProperty("team")
    public Team_ getTeam() {
        return team;
    }

    /**
     * 
     * @param team
     *     The team
     */
    @JsonProperty("team")
    public void setTeam(Team_ team) {
        this.team = team;
    }

    public Stats_ withTeam(Team_ team) {
        this.team = team;
        return this;
    }

    /**
     * 
     * @return
     *     The passers
     */
    @JsonProperty("passers")
    public List<Passer_> getPassers() {
        return passers;
    }

    /**
     * 
     * @param passers
     *     The passers
     */
    @JsonProperty("passers")
    public void setPassers(List<Passer_> passers) {
        this.passers = passers;
    }

    public Stats_ withPassers(List<Passer_> passers) {
        this.passers = passers;
        return this;
    }

    /**
     * 
     * @return
     *     The rushers
     */
    @JsonProperty("rushers")
    public List<Rusher_> getRushers() {
        return rushers;
    }

    /**
     * 
     * @param rushers
     *     The rushers
     */
    @JsonProperty("rushers")
    public void setRushers(List<Rusher_> rushers) {
        this.rushers = rushers;
    }

    public Stats_ withRushers(List<Rusher_> rushers) {
        this.rushers = rushers;
        return this;
    }

    /**
     * 
     * @return
     *     The receivers
     */
    @JsonProperty("receivers")
    public List<Receiver_> getReceivers() {
        return receivers;
    }

    /**
     * 
     * @param receivers
     *     The receivers
     */
    @JsonProperty("receivers")
    public void setReceivers(List<Receiver_> receivers) {
        this.receivers = receivers;
    }

    public Stats_ withReceivers(List<Receiver_> receivers) {
        this.receivers = receivers;
        return this;
    }

    /**
     * 
     * @return
     *     The kickers
     */
    @JsonProperty("kickers")
    public List<Kicker_> getKickers() {
        return kickers;
    }

    /**
     * 
     * @param kickers
     *     The kickers
     */
    @JsonProperty("kickers")
    public void setKickers(List<Kicker_> kickers) {
        this.kickers = kickers;
    }

    public Stats_ withKickers(List<Kicker_> kickers) {
        this.kickers = kickers;
        return this;
    }

    /**
     * 
     * @return
     *     The punters
     */
    @JsonProperty("punters")
    public List<Punter_> getPunters() {
        return punters;
    }

    /**
     * 
     * @param punters
     *     The punters
     */
    @JsonProperty("punters")
    public void setPunters(List<Punter_> punters) {
        this.punters = punters;
    }

    public Stats_ withPunters(List<Punter_> punters) {
        this.punters = punters;
        return this;
    }

    /**
     * 
     * @return
     *     The kickReturners
     */
    @JsonProperty("kickReturners")
    public List<KickReturner> getKickReturners() {
        return kickReturners;
    }

    /**
     * 
     * @param kickReturners
     *     The kickReturners
     */
    @JsonProperty("kickReturners")
    public void setKickReturners(List<KickReturner> kickReturners) {
        this.kickReturners = kickReturners;
    }

    public Stats_ withKickReturners(List<KickReturner> kickReturners) {
        this.kickReturners = kickReturners;
        return this;
    }

    /**
     * 
     * @return
     *     The puntReturners
     */
    @JsonProperty("puntReturners")
    public List<PuntReturner_> getPuntReturners() {
        return puntReturners;
    }

    /**
     * 
     * @param puntReturners
     *     The puntReturners
     */
    @JsonProperty("puntReturners")
    public void setPuntReturners(List<PuntReturner_> puntReturners) {
        this.puntReturners = puntReturners;
    }

    public Stats_ withPuntReturners(List<PuntReturner_> puntReturners) {
        this.puntReturners = puntReturners;
        return this;
    }

    /**
     * 
     * @return
     *     The defenders
     */
    @JsonProperty("defenders")
    public List<Defender_> getDefenders() {
        return defenders;
    }

    /**
     * 
     * @param defenders
     *     The defenders
     */
    @JsonProperty("defenders")
    public void setDefenders(List<Defender_> defenders) {
        this.defenders = defenders;
    }

    public Stats_ withDefenders(List<Defender_> defenders) {
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
        if ((other instanceof Stats_) == false) {
            return false;
        }
        Stats_ rhs = ((Stats_) other);
        return new EqualsBuilder().append(team, rhs.team).append(passers, rhs.passers).append(rushers, rhs.rushers).append(receivers, rhs.receivers).append(kickers, rhs.kickers).append(punters, rhs.punters).append(kickReturners, rhs.kickReturners).append(puntReturners, rhs.puntReturners).append(defenders, rhs.defenders).isEquals();
    }

}
