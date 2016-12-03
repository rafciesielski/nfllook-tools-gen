
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
    "divisions"
})
public class Conference {

    @JsonProperty("name")
    private String name;
    @JsonProperty("divisions")
    private List<Division> divisions = new ArrayList<Division>();

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

    public Conference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The divisions
     */
    @JsonProperty("divisions")
    public List<Division> getDivisions() {
        return divisions;
    }

    /**
     * 
     * @param divisions
     *     The divisions
     */
    @JsonProperty("divisions")
    public void setDivisions(List<Division> divisions) {
        this.divisions = divisions;
    }

    public Conference withDivisions(List<Division> divisions) {
        this.divisions = divisions;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(divisions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Conference) == false) {
            return false;
        }
        Conference rhs = ((Conference) other);
        return new EqualsBuilder().append(name, rhs.name).append(divisions, rhs.divisions).isEquals();
    }

}
