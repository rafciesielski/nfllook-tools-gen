
package org.nfllook.tools.generated.gd;

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
    "weather",
    "media",
    "yl",
    "qtr",
    "note",
    "down",
    "togo",
    "redzone",
    "clock",
    "posteam",
    "stadium"
})
public class GameData {

    @JsonProperty("home")
    private Home home;
    @JsonProperty("away")
    private Away away;
    @JsonProperty("weather")
    private Object weather;
    @JsonProperty("media")
    private Object media;
    @JsonProperty("yl")
    private String yl;
    @JsonProperty("qtr")
    private String qtr;
    @JsonProperty("note")
    private Object note;
    @JsonProperty("down")
    private Integer down;
    @JsonProperty("togo")
    private Integer togo;
    @JsonProperty("redzone")
    private Boolean redzone;
    @JsonProperty("clock")
    private String clock;
    @JsonProperty("posteam")
    private String posteam;
    @JsonProperty("stadium")
    private Object stadium;

    /**
     * 
     * @return
     *     The home
     */
    @JsonProperty("home")
    public Home getHome() {
        return home;
    }

    /**
     * 
     * @param home
     *     The home
     */
    @JsonProperty("home")
    public void setHome(Home home) {
        this.home = home;
    }

    public GameData withHome(Home home) {
        this.home = home;
        return this;
    }

    /**
     * 
     * @return
     *     The away
     */
    @JsonProperty("away")
    public Away getAway() {
        return away;
    }

    /**
     * 
     * @param away
     *     The away
     */
    @JsonProperty("away")
    public void setAway(Away away) {
        this.away = away;
    }

    public GameData withAway(Away away) {
        this.away = away;
        return this;
    }

    /**
     * 
     * @return
     *     The weather
     */
    @JsonProperty("weather")
    public Object getWeather() {
        return weather;
    }

    /**
     * 
     * @param weather
     *     The weather
     */
    @JsonProperty("weather")
    public void setWeather(Object weather) {
        this.weather = weather;
    }

    public GameData withWeather(Object weather) {
        this.weather = weather;
        return this;
    }

    /**
     * 
     * @return
     *     The media
     */
    @JsonProperty("media")
    public Object getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    @JsonProperty("media")
    public void setMedia(Object media) {
        this.media = media;
    }

    public GameData withMedia(Object media) {
        this.media = media;
        return this;
    }

    /**
     * 
     * @return
     *     The yl
     */
    @JsonProperty("yl")
    public String getYl() {
        return yl;
    }

    /**
     * 
     * @param yl
     *     The yl
     */
    @JsonProperty("yl")
    public void setYl(String yl) {
        this.yl = yl;
    }

    public GameData withYl(String yl) {
        this.yl = yl;
        return this;
    }

    /**
     * 
     * @return
     *     The qtr
     */
    @JsonProperty("qtr")
    public String getQtr() {
        return qtr;
    }

    /**
     * 
     * @param qtr
     *     The qtr
     */
    @JsonProperty("qtr")
    public void setQtr(String qtr) {
        this.qtr = qtr;
    }

    public GameData withQtr(String qtr) {
        this.qtr = qtr;
        return this;
    }

    /**
     * 
     * @return
     *     The note
     */
    @JsonProperty("note")
    public Object getNote() {
        return note;
    }

    /**
     * 
     * @param note
     *     The note
     */
    @JsonProperty("note")
    public void setNote(Object note) {
        this.note = note;
    }

    public GameData withNote(Object note) {
        this.note = note;
        return this;
    }

    /**
     * 
     * @return
     *     The down
     */
    @JsonProperty("down")
    public Integer getDown() {
        return down;
    }

    /**
     * 
     * @param down
     *     The down
     */
    @JsonProperty("down")
    public void setDown(Integer down) {
        this.down = down;
    }

    public GameData withDown(Integer down) {
        this.down = down;
        return this;
    }

    /**
     * 
     * @return
     *     The togo
     */
    @JsonProperty("togo")
    public Integer getTogo() {
        return togo;
    }

    /**
     * 
     * @param togo
     *     The togo
     */
    @JsonProperty("togo")
    public void setTogo(Integer togo) {
        this.togo = togo;
    }

    public GameData withTogo(Integer togo) {
        this.togo = togo;
        return this;
    }

    /**
     * 
     * @return
     *     The redzone
     */
    @JsonProperty("redzone")
    public Boolean getRedzone() {
        return redzone;
    }

    /**
     * 
     * @param redzone
     *     The redzone
     */
    @JsonProperty("redzone")
    public void setRedzone(Boolean redzone) {
        this.redzone = redzone;
    }

    public GameData withRedzone(Boolean redzone) {
        this.redzone = redzone;
        return this;
    }

    /**
     * 
     * @return
     *     The clock
     */
    @JsonProperty("clock")
    public String getClock() {
        return clock;
    }

    /**
     * 
     * @param clock
     *     The clock
     */
    @JsonProperty("clock")
    public void setClock(String clock) {
        this.clock = clock;
    }

    public GameData withClock(String clock) {
        this.clock = clock;
        return this;
    }

    /**
     * 
     * @return
     *     The posteam
     */
    @JsonProperty("posteam")
    public String getPosteam() {
        return posteam;
    }

    /**
     * 
     * @param posteam
     *     The posteam
     */
    @JsonProperty("posteam")
    public void setPosteam(String posteam) {
        this.posteam = posteam;
    }

    public GameData withPosteam(String posteam) {
        this.posteam = posteam;
        return this;
    }

    /**
     * 
     * @return
     *     The stadium
     */
    @JsonProperty("stadium")
    public Object getStadium() {
        return stadium;
    }

    /**
     * 
     * @param stadium
     *     The stadium
     */
    @JsonProperty("stadium")
    public void setStadium(Object stadium) {
        this.stadium = stadium;
    }

    public GameData withStadium(Object stadium) {
        this.stadium = stadium;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(home).append(away).append(weather).append(media).append(yl).append(qtr).append(note).append(down).append(togo).append(redzone).append(clock).append(posteam).append(stadium).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameData) == false) {
            return false;
        }
        GameData rhs = ((GameData) other);
        return new EqualsBuilder().append(home, rhs.home).append(away, rhs.away).append(weather, rhs.weather).append(media, rhs.media).append(yl, rhs.yl).append(qtr, rhs.qtr).append(note, rhs.note).append(down, rhs.down).append(togo, rhs.togo).append(redzone, rhs.redzone).append(clock, rhs.clock).append(posteam, rhs.posteam).append(stadium, rhs.stadium).isEquals();
    }

}
