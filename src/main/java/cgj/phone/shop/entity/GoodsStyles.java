package cgj.phone.shop.entity;

public class GoodsStyles {
    private Integer id;

    private String goodsstyle;

    private Integer flog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsstyle() {
        return goodsstyle;
    }

    public void setGoodsstyle(String goodsstyle) {
        this.goodsstyle = goodsstyle == null ? null : goodsstyle.trim();
    }

    public Integer getFlog() {
        return flog;
    }

    public void setFlog(Integer flog) {
        this.flog = flog;
    }
}