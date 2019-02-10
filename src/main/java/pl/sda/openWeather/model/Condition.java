package pl.sda.openWeather.model;

public class Condition {
    private String text;
    private String icon;
    private Integer code;

    public Condition() {
    }

    public Condition(String text, String icon, Integer code) {
        this.text = text;
        this.icon = icon;
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "text='" + text + '\'' +
                ", icon='" + icon + '\'' +
                ", code=" + code +
                '}';
    }
}
