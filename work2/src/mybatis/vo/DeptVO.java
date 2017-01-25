package mybatis.vo;

public class DeptVO {
    
    private String department_name;
    private LocVO lvo;


    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public LocVO getLvo() {
        return lvo;
    }

    public void setLvo(LocVO lvo) {
        this.lvo = lvo;
    }
    
}