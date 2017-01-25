package mybatis.vo;

public class EmpVO {


/*
    사번, 이름, 직종코드, 직종명, 부서명, 근무지명
    
    SELECT  employee_id, first_name, e.job_id, j.job_title, e.department_id, l.city
      FROM  emp e, dept d, jobs j, locations l 
     WHERE  e.job_id= j.JOB_ID
       AND  e.department_id = d.DEPARTMENT_ID
       AND  d.location_id = l.location_id;
 */
    
    
    private String employee_id, first_name;

    private JobVO jvo;
    private DeptVO dvo;
    private LocVO lvo;

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public JobVO getJvo() {
        return jvo;
    }

    public void setJvo(JobVO jvo) {
        this.jvo = jvo;
    }

    public DeptVO getDvo() {
        return dvo;
    }

    public void setDvo(DeptVO dvo) {
        this.dvo = dvo;
    }

    public LocVO getLvo() {
        return lvo;
    }

    public void setLvo(LocVO lvo) {
        this.lvo = lvo;
    }

    
    
}
