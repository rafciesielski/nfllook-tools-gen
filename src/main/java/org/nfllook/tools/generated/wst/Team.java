
package org.nfllook.tools.generated.wst;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "wins",
    "losses",
    "draws",
    "winningPercentage",
    "oppsOfPlayedGames",
    "oppsOfRemainingGames"
})
public class Team {

    @JsonProperty("name")
    private String name;
    @JsonProperty("wins")
    private Integer wins;
    @JsonProperty("losses")
    private Integer losses;
    @JsonProperty("draws")
    private Integer draws;
    @JsonProperty("winningPercentage")
    private Integer winningPercentage;
    @JsonProperty("oppsOfPlayedGames")
    private OppsOfPlayedGames oppsOfPlayedGames;
    @JsonProperty("oppsOfRemainingGames")
    private OppsOfRemainingGames oppsOfRemainingGames;

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

    public Team withName(String name) {
        this.name = name;
        return this;
    }

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

    public Team withWins(Integer wins) {
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

    public Team withLosses(Integer losses) {
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

    public Team withDraws(Integer draws) {
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

    public Team withWinningPercentage(Integer winningPercentage) {
        this.winningPercentage = winningPercentage;
        return this;
    }

    /**
     * 
     * @return
     *     The oppsOfPlayedGames
     */
    @JsonProperty("oppsOfPlayedGames")
    public OppsOfPlayedGames getOppsOfPlayedGames() {
        return oppsOfPlayedGames;
    }

    /**
     * 
     * @param oppsOfPlayedGames
     *     The oppsOfPlayedGames
     */
    @JsonProperty("oppsOfPlayedGames")
    public void setOppsOfPlayedGames(OppsOfPlayedGames oppsOfPlayedGames) {
        this.oppsOfPlayedGames = oppsOfPlayedGames;
    }

    public Team withOppsOfPlayedGames(OppsOfPlayedGames oppsOfPlayedGames) {
        this.oppsOfPlayedGames = oppsOfPlayedGames;
        return this;
    }

    /**
     * 
     * @return
     *     The oppsOfRemainingGames
     */
    @JsonProperty("oppsOfRemainingGames")
    public OppsOfRemainingGames getOppsOfRemainingGames() {
        return oppsOfRemainingGames;
    }

    /**
     * 
     * @param oppsOfRemainingGames
     *     The oppsOfRemainingGames
     */
    @JsonProperty("oppsOfRemainingGames")
    public void setOppsOfRemainingGames(OppsOfRemainingGames oppsOfRemainingGames) {
        this.oppsOfRemainingGames = oppsOfRemainingGames;
    }

    public Team withOppsOfRemainingGames(OppsOfRemainingGames oppsOfRemainingGames) {
        this.oppsOfRemainingGames = oppsOfRemainingGames;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(wins).append(losses).append(draws).append(winningPercentage).append(oppsOfPlayedGames).append(oppsOfRemainingGames).toHashCode();
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
        return new EqualsBuilder().append(name, rhs.name).append(wins, rhs.wins).append(losses, rhs.losses).append(draws, rhs.draws).append(winningPercentage, rhs.winningPercentage).append(oppsOfPlayedGames, rhs.oppsOfPlayedGames).append(oppsOfRemainingGames, rhs.oppsOfRemainingGames).isEquals();
    }

}
