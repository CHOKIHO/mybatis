package mybatis.vo;

public class DeptVO2 {
    
    private String department_id, department_name;
            
    //location 참조
    private LocVO lvo;

    public LocVO getLvo() {
        return lvo;
    }

    public void setLvo(LocVO lvo) {
        this.lvo = lvo;
    }
    
    public String getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(String department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
    
}
