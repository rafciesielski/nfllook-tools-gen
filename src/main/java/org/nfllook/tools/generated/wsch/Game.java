
package org.nfllook.tools.generated.wsch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "home",
    "away",
    "dayOfTheWeek",
    "time"
})
public class Game {

    @JsonProperty("home")
    private String home;
    @JsonProperty("away")
    private String away;
    @JsonProperty("dayOfTheWeek")
    private String dayOfTheWeek;
    @JsonProperty("time")
    private String time;

    /**
     * 
     * @return
     *     The home
     */
    @JsonProperty("home")
    public String getHome() {
        return home;
    }

    /**
     * 
     * @param home
     *     The home
     */
    @JsonProperty("home")
    public void setHome(String home) {
        this.home = home;
    }

    public Game withHome(String home) {
        this.home = home;
        return this;
    }

    /**
     * 
     * @return
     *     The away
     */
    @JsonProperty("away")
    public String getAway() {
        return away;
    }

    /**
     * 
     * @param away
     *     The away
     */
    @JsonProperty("away")
    public void setAway(String away) {
        this.away = away;
    }

    public Game withAway(String away) {
        this.away = away;
        return this;
    }

    /**
     * 
     * @return
     *     The dayOfTheWeek
     */
    @JsonProperty("dayOfTheWeek")
    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    /**
     * 
     * @param dayOfTheWeek
     *     The dayOfTheWeek
     */
    @JsonProperty("dayOfTheWeek")
    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public Game withDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
        return this;
    }

    /**
     * 
     * @return
     *     The time
     */
    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    /**
     * 
     * @param time
     *     The time
     */
    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    public Game withTime(String time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(home).append(away).append(dayOfTheWeek).append(time).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Game) == false) {
            return false;
        }
        Game rhs = ((Game) other);
        return new EqualsBuilder().append(home, rhs.home).append(away, rhs.away).append(dayOfTheWeek, rhs.dayOfTheWeek).append(time, rhs.time).isEquals();
    }

}
