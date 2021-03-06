
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
    "draws",
    "winningPercentage"
})
public class OppsOfRemainingGames {

    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("losses")
    private Integer losses;
    @JsonProperty("draws")
    private Integer draws;
    @JsonProperty("winningPercentage")
    private Integer winningPercentage;

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

    public OppsOfRemainingGames withWins(Integer wins) {
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

    public OppsOfRemainingGames withLosses(Integer losses) {
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

    public OppsOfRemainingGames withDraws(Integer draws) {
        this.draws = draws;
        return this;
    }

    /**
     * 
     * @return
     *     The winningPercentage
     */
    @JsonProperty("winningPercentage")
    public Integer getWinningPercentage() {
        return winningPercentage;
    }

    /**
     * 
     * @param winningPercentage
     *     The winningPercentage
     */
    @JsonProperty("winningPercentage")
    public void setWinningPercentage(Integer winningPercentage) {
        this.winningPercentage = winningPercentage;
    }

    public OppsOfRemainingGames withWinningPercentage(Integer winningPercentage) {
        this.winningPercentage = winningPercentage;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(wins).append(losses).append(draws).append(winningPercentage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OppsOfRemainingGames) == false) {
            return false;
        }
        OppsOfRemainingGames rhs = ((OppsOfRemainingGames) other);
        return new EqualsBuilder().append(wins, rhs.wins).append(losses, rhs.losses).append(draws, rhs.draws).append(winningPercentage, rhs.winningPercentage).isEquals();
    }

}
