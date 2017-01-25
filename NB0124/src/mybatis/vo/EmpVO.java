package mybatis.vo;

public class EmpVO {
    
    private String employee_id, first_name;
    private JobVO jvo;

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
    
          
    
}
