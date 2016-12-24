
package org.nfllook.tools.generated.wst;

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
    "_id",
    "week",
    "uploadDate",
    "conferences"
})
public class Standings {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("week")
    private Integer week;
    @JsonProperty("uploadDate")
    private String uploadDate;
    @JsonProperty("conferences")
    private List<Conference> conferences = new ArrayList<Conference>();

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

    public Standings withId(String id) {
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

    public Standings withWeek(Integer week) {
        this.week = week;
        return this;
    }

    /**
     * 
     * @return
     *     The uploadDate
     */
    @JsonProperty("uploadDate")
    public String getUploadDate() {
        return uploadDate;
    }

    /**
     * 
     * @param uploadDate
     *     The uploadDate
     */
    @JsonProperty("uploadDate")
    public void setUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Standings withUploadDate(String uploadDate) {
        this.uploadDate = uploadDate;
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

    public Standings withConferences(List<Conference> conferences) {
        this.conferences = conferences;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(week).append(uploadDate).append(conferences).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Standings) == false) {
            return false;
        }
        Standings rhs = ((Standings) other);
        return new EqualsBuilder().append(id, rhs.id).append(week, rhs.week).append(uploadDate, rhs.uploadDate).append(conferences, rhs.conferences).isEquals();
    }

}
