
package org.nfllook.tools.generated.wsch;

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
    "_id",
    "week",
    "uploudDate",
    "games"
})
public class Schedule {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("week")
    private Integer week;
    @JsonProperty("uploudDate")
    private String uploudDate;
    @JsonProperty("games")
    private List<Game> games = new ArrayList<Game>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The _id
     */
    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    public Schedule withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The week
     */
    @JsonProperty("week")
    public Integer getWeek() {
        return week;
    }

    /**
     * 
     * @param week
     *     The week
     */
    @JsonProperty("week")
    public void setWeek(Integer week) {
        this.week = week;
    }

    public Schedule withWeek(Integer week) {
        this.week = week;
        return this;
    }

    /**
     * 
     * @return
     *     The uploudDate
     */
    @JsonProperty("uploudDate")
    public String getUploudDate() {
        return uploudDate;
    }

    /**
     * 
     * @param uploudDate
     *     The uploudDate
     */
    @JsonProperty("uploudDate")
    public void setUploudDate(String uploudDate) {
        this.uploudDate = uploudDate;
    }

    public Schedule withUploudDate(String uploudDate) {
        this.uploudDate = uploudDate;
        return this;
    }

    /**
     * 
     * @return
     *     The games
     */
    @JsonProperty("games")
    public List<Game> getGames() {
        return games;
    }

    /**
     * 
     * @param games
     *     The games
     */
    @JsonProperty("games")
    public void setGames(List<Game> games) {
        this.games = games;
    }

    public Schedule withGames(List<Game> games) {
        this.games = games;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(week).append(uploudDate).append(games).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schedule) == false) {
            return false;
        }
        Schedule rhs = ((Schedule) other);
        return new EqualsBuilder().append(id, rhs.id).append(week, rhs.week).append(uploudDate, rhs.uploudDate).append(games, rhs.games).isEquals();
    }

}
