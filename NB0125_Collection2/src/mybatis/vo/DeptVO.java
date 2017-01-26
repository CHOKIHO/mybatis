package mybatis.vo;

import java.util.List;

public class DeptVO {

    private String department_id, department_name;
    
    private List<EmpVO> e_list;

    public DeptVO() {
    }
    
    public DeptVO(String department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
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

    public List<EmpVO> getE_list() {
        return e_list;
    }

    public void setD_list(List<EmpVO> e_list) {
        this.e_list = e_list;
    }
   
}
