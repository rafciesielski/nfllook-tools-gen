
package org.nfllook.tools.generated.ws;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "week",
    "conferences"
})
public class Standing {

    @JsonProperty("week")
    private Integer week;
    @JsonProperty("conferences")
    private List<Conference> conferences = new ArrayList<Conference>();

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

    public Standing withWeek(Integer week) {
        this.week = week;
        return this;
    }

    /**
     * 
     * @return
     *     The conferences
     */
    @JsonProperty("conferences")
    public List<Conference> getConferences() {
        return conferences;
    }

    /**
     * 
     * @param conferences
     *     The conferences
     */
    @JsonProperty("conferences")
    public void setConferences(List<Conference> conferences) {
        this.conferences = conferences;
    }

    public Standing withConferences(List<Conference> conferences) {
        this.conferences = conferences;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(week).append(conferences).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Standing) == false) {
            return false;
        }
        Standing rhs = ((Standing) other);
        return new EqualsBuilder().append(week, rhs.week).append(conferences, rhs.conferences).isEquals();
    }

}
