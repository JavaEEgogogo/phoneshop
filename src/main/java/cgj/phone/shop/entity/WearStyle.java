package cgj.phone.shop.entity;

public class WearStyle {
    private Integer id;

    private String wearstylename;

    private Integer focusnum;

    private Integer flog;

    private String wearstylestyle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWearstylename() {
        return wearstylename;
    }

    public void setWearstylename(String wearstylename) {
        this.wearstylename = wearstylename == null ? null : wearstylename.trim();
    }

    public Integer getFocusnum() {
        return focusnum;
    }

    public void setFocusnum(Integer focusnum) {
        this.focusnum = focusnum;
    }

    public Integer getFlog() {
        return flog;
    }

    public void setFlog(Integer flog) {
        this.flog = flog;
    }

    public String getWearstylestyle() {
        return wearstylestyle;
    }

    public void setWearstylestyle(String wearstylestyle) {
        this.wearstylestyle = wearstylestyle == null ? null : wearstylestyle.trim();
    }
}