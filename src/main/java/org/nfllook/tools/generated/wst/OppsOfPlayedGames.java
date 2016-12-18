
package org.nfllook.tools.generated.wst;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "wins",
    "losses",
    "draws"
})
public class OppsOfPlayedGames {

    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("losses")
    private Integer losses;
    @JsonProperty("draws")
    private Integer draws;

    /**
     * 
     * @return
     *     The wins
     */
    @JsonProperty("wins")
    public Integer getWins() {
        return wins;
    }

    /**
     * 
     * @param wins
     *     The wins
     */
    @JsonProperty("wins")
    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public OppsOfPlayedGames withWins(Integer wins) {
        this.wins = wins;
        return this;
    }

    /**
     * 
     * @return
     *     The losses
     */
    @JsonProperty("losses")
    public Integer getLosses() {
        return losses;
    }

    /**
     * 
     * @param losses
     *     The losses
     */
    @JsonProperty("losses")
    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public OppsOfPlayedGames withLosses(Integer losses) {
        this.losses = losses;
        return this;
    }

    /**
     * 
     * @return
     *     The draws
     */
    @JsonProperty("draws")
    public Integer getDraws() {
        return draws;
    }

    /**
     * 
     * @param draws
     *     The draws
     */
    @JsonProperty("draws")
    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public OppsOfPlayedGames withDraws(Integer draws) {
        this.draws = draws;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(wins).append(losses).append(draws).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OppsOfPlayedGames) == false) {
            return false;
        }
        OppsOfPlayedGames rhs = ((OppsOfPlayedGames) other);
        return new EqualsBuilder().append(wins, rhs.wins).append(losses, rhs.losses).append(draws, rhs.draws).isEquals();
    }

}
