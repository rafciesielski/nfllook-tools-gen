
package org.nfllook.tools.generated.wst;

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
    "name",
    "teams"
})
public class Division {

    @JsonProperty("name")
    private String name;
    @JsonProperty("teams")
    private List<Team> teams = new ArrayList<Team>();

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

    public Division withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The teams
     */
    @JsonProperty("teams")
    public List<Team> getTeams() {
        return teams;
    }

    /**
     * 
     * @param teams
     *     The teams
     */
    @JsonProperty("teams")
    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public Division withTeams(List<Team> teams) {
        this.teams = teams;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(teams).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Division) == false) {
            return false;
        }
        Division rhs = ((Division) other);
        return new EqualsBuilder().append(name, rhs.name).append(teams, rhs.teams).isEquals();
    }

}
