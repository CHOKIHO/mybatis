package mybatis.vo;

public class LocVO {
    
        /*
    SELECT  employee_id, first_name, e.job_id, j.job_title, e.department_id, l.city
      FROM  emp e, dept d, jobs j, locations l 
     WHERE  e.job_id= j.JOB_ID
       AND  e.department_id = d.DEPARTMENT_ID
       AND  d.location_id = l.location_id;
 */
    
    private String location_id, city;

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
    
    
    
}
