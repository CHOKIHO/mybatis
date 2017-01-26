package mybatis.vo;

public class LocVO {
    
    private String location_id, city, country_id;

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }
    private CouVO cvo;

    public String getLocation_id() {
        return location_id;
    }

    public void setLocation_id(String location_id) {
        this.location_id = location_id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public CouVO getCvo() {
        return cvo;
    }

    public void setCvo(CouVO cvo) {
        this.cvo = cvo;
    }

    
}
