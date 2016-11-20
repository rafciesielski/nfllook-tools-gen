
package org.nfllook.tools.generated.gd;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "tkl",
    "ast",
    "sk",
    "int",
    "ffum",
    "id"
})
public class Defender {

    @JsonProperty("name")
    private String name;
    @JsonProperty("tkl")
    private Integer tkl;
    @JsonProperty("ast")
    private Integer ast;
    @JsonProperty("sk")
    private Integer sk;
    @JsonProperty("int")
    private Integer _int;
    @JsonProperty("ffum")
    private Integer ffum;
    @JsonProperty("id")
    private String id;

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

    public Defender withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The tkl
     */
    @JsonProperty("tkl")
    public Integer getTkl() {
        return tkl;
    }

    /**
     * 
     * @param tkl
     *     The tkl
     */
    @JsonProperty("tkl")
    public void setTkl(Integer tkl) {
        this.tkl = tkl;
    }

    public Defender withTkl(Integer tkl) {
        this.tkl = tkl;
        return this;
    }

    /**
     * 
     * @return
     *     The ast
     */
    @JsonProperty("ast")
    public Integer getAst() {
        return ast;
    }

    /**
     * 
     * @param ast
     *     The ast
     */
    @JsonProperty("ast")
    public void setAst(Integer ast) {
        this.ast = ast;
    }

    public Defender withAst(Integer ast) {
        this.ast = ast;
        return this;
    }

    /**
     * 
     * @return
     *     The sk
     */
    @JsonProperty("sk")
    public Integer getSk() {
        return sk;
    }

    /**
     * 
     * @param sk
     *     The sk
     */
    @JsonProperty("sk")
    public void setSk(Integer sk) {
        this.sk = sk;
    }

    public Defender withSk(Integer sk) {
        this.sk = sk;
        return this;
    }

    /**
     * 
     * @return
     *     The _int
     */
    @JsonProperty("int")
    public Integer getInt() {
        return _int;
    }

    /**
     * 
     * @param _int
     *     The int
     */
    @JsonProperty("int")
    public void setInt(Integer _int) {
        this._int = _int;
    }

    public Defender withInt(Integer _int) {
        this._int = _int;
        return this;
    }

    /**
     * 
     * @return
     *     The ffum
     */
    @JsonProperty("ffum")
    public Integer getFfum() {
        return ffum;
    }

    /**
     * 
     * @param ffum
     *     The ffum
     */
    @JsonProperty("ffum")
    public void setFfum(Integer ffum) {
        this.ffum = ffum;
    }

    public Defender withFfum(Integer ffum) {
        this.ffum = ffum;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Defender withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(tkl).append(ast).append(sk).append(_int).append(ffum).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Defender) == false) {
            return false;
        }
        Defender rhs = ((Defender) other);
        return new EqualsBuilder().append(name, rhs.name).append(tkl, rhs.tkl).append(ast, rhs.ast).append(sk, rhs.sk).append(_int, rhs._int).append(ffum, rhs.ffum).append(id, rhs.id).isEquals();
    }

}
