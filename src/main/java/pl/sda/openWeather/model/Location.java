package pl.sda.openWeather.model;

public class Location {
    private String name;
    private String region;
    private String country;
    private Float lat;
    private Float lon;
    private String tz_id;
    private Integer localtime_epoch;
    private String localtime;

    public Location() {
    }

    public Location(String name, String region, String country, Float lat, Float lon, String tz_id, Integer localtime_epoch, String localtime) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.lat = lat;
        this.lon = lon;
        this.tz_id = tz_id;
        this.localtime_epoch = localtime_epoch;
        this.localtime = localtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public String getTz_id() {
        return tz_id;
    }

    public void setTz_id(String tz_id) {
        this.tz_id = tz_id;
    }

    public Integer getLocaltime_epoch() {
        return localtime_epoch;
    }

    public void setLocaltime_epoch(Integer localtime_epoch) {
        this.localtime_epoch = localtime_epoch;
    }

    public String getLocaltime() {
        return localtime;
    }

    public void setLocaltime(String localtime) {
        this.localtime = localtime;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", tz_id='" + tz_id + '\'' +
                ", localtime_epoch=" + localtime_epoch +
                ", localtime='" + localtime + '\'' +
                '}';
    }
}
