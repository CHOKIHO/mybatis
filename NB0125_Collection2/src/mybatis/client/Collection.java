package mybatis.client;

import java.io.Reader;
import java.util.List;
import mybatis.vo.DeptVO;
import mybatis.vo.EmpVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Collection {

    public static void main(String[] args) throws Exception {
        
        Reader r = Resources.getResourceAsReader("mybatis/config/config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
        r.close();
       
        SqlSession ss = factory.openSession(true);
        
        List<DeptVO> list = ss.selectList("dept.all");
        
        for (DeptVO vo : list) {
            
            List<EmpVO> e_list = vo.getE_list();
            
            System.out.println(vo.getDepartment_id() + "/" + vo.getDepartment_name()+"-("+e_list.size()+")");
            
            for (EmpVO evo : e_list) {
                
                System.out.println("\t-" + evo.getEmployee_id()+" (" + evo.getFirst_name() + ")");
            }
        }
        ss.close();
    }
}
