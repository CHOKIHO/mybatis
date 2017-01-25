package mybatis.vo;

public class JobVO {
    
    /*
    SELECT  employee_id, first_name, e.job_id, j.job_title, e.department_id, l.city
      FROM  emp e, dept d, jobs j, locations l 
     WHERE  e.job_id= j.JOB_ID
       AND  e.department_id = d.DEPARTMENT_ID
       AND  d.location_id = l.location_id;
 */
    
    private String job_id, job_title;

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }
    
}
