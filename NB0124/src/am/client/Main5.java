package am.client;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mybatis.vo.DeptVO;
import mybatis.vo.DeptVO2;
import mybatis.vo.EmpVO;
import mybatis.vo.MemVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main5 {

    public static void main(String[] args) throws Exception {
        
        Reader r = Resources.getResourceAsReader("mybatis/config/config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
        r.close();

        SqlSession ss = factory.openSession(true);
        List<EmpVO> list  = ss.selectList("emp_job.all");
        
        for (EmpVO vo : list) {
            System.out.println(vo.getEmployee_id() + "/" + vo.getFirst_name() + "/" +
                               vo.getJvo().getJob_id() + "/" + vo.getJvo().getJob_title());
        }
        
        ss.close();
    }
}
