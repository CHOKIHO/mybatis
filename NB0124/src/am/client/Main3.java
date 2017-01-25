package am.client;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mybatis.vo.DeptVO;
import mybatis.vo.MemVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main3 {

    public static void main(String[] args) throws Exception {
        
        Reader r = Resources.getResourceAsReader("mybatis/config/config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
        r.close();

        SqlSession ss = factory.openSession(true);
        
        List<DeptVO> list  = ss.selectList("dept_loc.get_dept");
        
        for (DeptVO vo : list) {
            System.out.println(vo.getDepartment_id() + "/" + vo.getDeptName() + "/" +
                    vo.getLoc_id() + "/" + vo.getCity());
        }
        
        ss.close();
        
    }
}
