
package org.nfllook.tools.generated.ws;

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
    "week",
    "conference"
})
public class Standing {

    @JsonProperty("week")
    private Integer week;
    @JsonProperty("conference")
    private List<Conference> conference = new ArrayList<Conference>();

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
     *     The conference
     */
    @JsonProperty("conference")
    public List<Conference> getConference() {
        return conference;
    }

    /**
     * 
     * @param conference
     *     The conference
     */
    @JsonProperty("conference")
    public void setConference(List<Conference> conference) {
        this.conference = conference;
    }

    public Standing withConference(List<Conference> conference) {
        this.conference = conference;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(week).append(conference).toHashCode();
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
        return new EqualsBuilder().append(week, rhs.week).append(conference, rhs.conference).isEquals();
    }

}
