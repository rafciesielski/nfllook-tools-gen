
package org.nfllook.tools.generated.gd;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "score",
    "abbr",
    "to",
    "stats",
    "players"
})
public class Home {

    @JsonProperty("score")
    private Score score;
    @JsonProperty("abbr")
    private String abbr;
    @JsonProperty("to")
    private Integer to;
    @JsonProperty("stats")
    private Stats stats;
    @JsonProperty("players")
    private Object players;

    /**
     * 
     * @return
     *     The score
     */
    @JsonProperty("score")
    public Score getScore() {
        return score;
    }

    /**
     * 
     * @param score
     *     The score
     */
    @JsonProperty("score")
    public void setScore(Score score) {
        this.score = score;
    }

    public Home withScore(Score score) {
        this.score = score;
        return this;
    }

    /**
     * 
     * @return
     *     The abbr
     */
    @JsonProperty("abbr")
    public String getAbbr() {
        return abbr;
    }

    /**
     * 
     * @param abbr
     *     The abbr
     */
    @JsonProperty("abbr")
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public Home withAbbr(String abbr) {
        this.abbr = abbr;
        return this;
    }

    /**
     * 
     * @return
     *     The to
     */
    @JsonProperty("to")
    public Integer getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    @JsonProperty("to")
    public void setTo(Integer to) {
        this.to = to;
    }

    public Home withTo(Integer to) {
        this.to = to;
        return this;
    }

    /**
     * 
     * @return
     *     The stats
     */
    @JsonProperty("stats")
    public Stats getStats() {
        return stats;
    }

    /**
     * 
     * @param stats
     *     The stats
     */
    @JsonProperty("stats")
    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public Home withStats(Stats stats) {
        this.stats = stats;
        return this;
    }

    /**
     * 
     * @return
     *     The players
     */
    @JsonProperty("players")
    public Object getPlayers() {
        return players;
    }

    /**
     * 
     * @param players
     *     The players
     */
    @JsonProperty("players")
    public void setPlayers(Object players) {
        this.players = players;
    }

    public Home withPlayers(Object players) {
        this.players = players;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(score).append(abbr).append(to).append(stats).append(players).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Home) == false) {
            return false;
        }
        Home rhs = ((Home) other);
        return new EqualsBuilder().append(score, rhs.score).append(abbr, rhs.abbr).append(to, rhs.to).append(stats, rhs.stats).append(players, rhs.players).isEquals();
    }

}
