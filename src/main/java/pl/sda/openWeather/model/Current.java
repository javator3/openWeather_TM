package pl.sda.openWeather.model;

public class Current {
    private Integer last_updated_epoch;
    private String last_updated;
    private Float temp_c;
    private Float temp_f;
    private Integer is_day;
    private Condition condition;
    private Float wind_mph;
    private Float wind_kph;
    private Float wind_degree;
    private String wind_dir;
    private Float pressure_mb;
    private Float pressure_in;
    private Float precip_mm;
    private Float precip_in;
    private Float humidity;
    private Float cloud;
    private Float feelslike_c;
    private Float feelslike_f;
    private Float vis_km;
    private Float vis_miles;
    private Float uv;

    public Current() {
    }

    public Current(Integer last_updated_epoch, String last_updated, Float temp_c, Float temp_f, Integer is_day, Condition condition, Float wind_mph, Float wind_kph, Float wind_degree, String wind_dir, Float pressure_mb, Float pressure_in, Float precip_mm, Float precip_in, Float humidity, Float cloud, Float feelslike_c, Float feelslike_f, Float vis_km, Float vis_miles, Float uv) {
        this.last_updated_epoch = last_updated_epoch;
        this.last_updated = last_updated;
        this.temp_c = temp_c;
        this.temp_f = temp_f;
        this.is_day = is_day;
        this.condition = condition;
        this.wind_mph = wind_mph;
        this.wind_kph = wind_kph;
        this.wind_degree = wind_degree;
        this.wind_dir = wind_dir;
        this.pressure_mb = pressure_mb;
        this.pressure_in = pressure_in;
        this.precip_mm = precip_mm;
        this.precip_in = precip_in;
        this.humidity = humidity;
        this.cloud = cloud;
        this.feelslike_c = feelslike_c;
        this.feelslike_f = feelslike_f;
        this.vis_km = vis_km;
        this.vis_miles = vis_miles;
        this.uv = uv;
    }

    public Integer getLast_updated_epoch() {
        return last_updated_epoch;
    }

    public void setLast_updated_epoch(Integer last_updated_epoch) {
        this.last_updated_epoch = last_updated_epoch;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Float getTemp_c() {
        return temp_c;
    }

    public void setTemp_c(Float temp_c) {
        this.temp_c = temp_c;
    }

    public Float getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(Float temp_f) {
        this.temp_f = temp_f;
    }

    public Integer getIs_day() {
        return is_day;
    }

    public void setIs_day(Integer is_day) {
        this.is_day = is_day;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public Float getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(Float wind_mph) {
        this.wind_mph = wind_mph;
    }

    public Float getWind_kph() {
        return wind_kph;
    }

    public void setWind_kph(Float wind_kph) {
        this.wind_kph = wind_kph;
    }

    public Float getWind_degree() {
        return wind_degree;
    }

    public void setWind_degree(Float wind_degree) {
        this.wind_degree = wind_degree;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public Float getPressure_mb() {
        return pressure_mb;
    }

    public void setPressure_mb(Float pressure_mb) {
        this.pressure_mb = pressure_mb;
    }

    public Float getPressure_in() {
        return pressure_in;
    }

    public void setPressure_in(Float pressure_in) {
        this.pressure_in = pressure_in;
    }

    public Float getPrecip_mm() {
        return precip_mm;
    }

    public void setPrecip_mm(Float precip_mm) {
        this.precip_mm = precip_mm;
    }

    public Float getPrecip_in() {
        return precip_in;
    }

    public void setPrecip_in(Float precip_in) {
        this.precip_in = precip_in;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getCloud() {
        return cloud;
    }

    public void setCloud(Float cloud) {
        this.cloud = cloud;
    }

    public Float getFeelslike_c() {
        return feelslike_c;
    }

    public void setFeelslike_c(Float feelslike_c) {
        this.feelslike_c = feelslike_c;
    }

    public Float getFeelslike_f() {
        return feelslike_f;
    }

    public void setFeelslike_f(Float feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public Float getVis_km() {
        return vis_km;
    }

    public void setVis_km(Float vis_km) {
        this.vis_km = vis_km;
    }

    public Float getVis_miles() {
        return vis_miles;
    }

    public void setVis_miles(Float vis_miles) {
        this.vis_miles = vis_miles;
    }

    public Float getUv() {
        return uv;
    }

    public void setUv(Float uv) {
        this.uv = uv;
    }

    @Override
    public String toString() {
        return "Current{" +
                "last_updated_epoch=" + last_updated_epoch +
                ", last_updated='" + last_updated + '\'' +
                ", temp_c=" + temp_c +
                ", temp_f=" + temp_f +
                ", is_day=" + is_day +
                ", condition=" + condition +
                ", wind_mph=" + wind_mph +
                ", wind_kph=" + wind_kph +
                ", wind_degree=" + wind_degree +
                ", wind_dir='" + wind_dir + '\'' +
                ", pressure_mb=" + pressure_mb +
                ", pressure_in=" + pressure_in +
                ", precip_mm=" + precip_mm +
                ", precip_in=" + precip_in +
                ", humidity=" + humidity +
                ", cloud=" + cloud +
                ", feelslike_c=" + feelslike_c +
                ", feelslike_f=" + feelslike_f +
                ", vis_km=" + vis_km +
                ", vis_miles=" + vis_miles +
                ", uv=" + uv +
                '}';
    }
}
