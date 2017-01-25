
package mybatis.vo;

import java.util.List;

public class LocVO {
    
    private String location_id, city;
    
    private List<DeptVO> d_list;

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

    public List<DeptVO> getD_list() {
        return d_list;
    }

    public void setD_list(List<DeptVO> d_list) {
        this.d_list = d_list;
    }
    
    
    
}
