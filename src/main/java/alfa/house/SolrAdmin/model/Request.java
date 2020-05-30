package alfa.house.SolrAdmin.model;

import java.util.List;

public class Request {

    private String id;
    private String text;
    private String city;
    private Double priceDay;
    private Double priceMonth;
    private String startDate;
    private String endDate;
    private boolean isPerDay;
    private boolean isPerMonth;
    private int minDayStay;
    private int bedqty;
    private int bathqty;
    private int bedroomqty;
    private int deskqty;
    private boolean withpatio;
    private boolean withdog;
    private boolean withcat;
    private boolean withwash;
    private boolean withdryer;
    private boolean withairconditioner;
    private boolean withfireplace;
    private String type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getPriceDay() {
        return priceDay;
    }

    public void setPriceDay(Double priceDay) {
        this.priceDay = priceDay;
    }

    public Double getPriceMonth() {
        return priceMonth;
    }

    public void setPriceMonth(Double priceMonth) {
        this.priceMonth = priceMonth;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean isPerDay() {
        return isPerDay;
    }

    public void setPerDay(boolean perDay) {
        isPerDay = perDay;
    }

    public boolean isPerMonth() {
        return isPerMonth;
    }

    public void setPerMonth(boolean perMonth) {
        isPerMonth = perMonth;
    }

    public int getMinDayStay() {
        return minDayStay;
    }

    public void setMinDayStay(int minDayStay) {
        this.minDayStay = minDayStay;
    }

    public int getBedqty() {
        return bedqty;
    }

    public void setBedqty(int bedqty) {
        this.bedqty = bedqty;
    }

    public int getBathqty() {
        return bathqty;
    }

    public void setBathqty(int bathqty) {
        this.bathqty = bathqty;
    }

    public int getBedroomqty() {
        return bedroomqty;
    }

    public void setBedroomqty(int bedroomqty) {
        this.bedroomqty = bedroomqty;
    }

    public int getDeskqty() {
        return deskqty;
    }

    public void setDeskqty(int deskqty) {
        this.deskqty = deskqty;
    }

    public boolean isWithpatio() {
        return withpatio;
    }

    public void setWithpatio(boolean withpatio) {
        this.withpatio = withpatio;
    }

    public boolean isWithdog() {
        return withdog;
    }

    public void setWithdog(boolean withdog) {
        this.withdog = withdog;
    }

    public boolean isWithcat() {
        return withcat;
    }

    public void setWithcat(boolean withcat) {
        this.withcat = withcat;
    }

    public boolean isWithwash() {
        return withwash;
    }

    public void setWithwash(boolean withwash) {
        this.withwash = withwash;
    }

    public boolean isWithdryer() {
        return withdryer;
    }

    public void setWithdryer(boolean withdryer) {
        this.withdryer = withdryer;
    }

    public boolean isWithairconditioner() {
        return withairconditioner;
    }

    public void setWithairconditioner(boolean withairconditioner) {
        this.withairconditioner = withairconditioner;
    }

    public boolean isWithfireplace() {
        return withfireplace;
    }

    public void setWithfireplace(boolean withfireplace) {
        this.withfireplace = withfireplace;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
