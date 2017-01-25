package am.client;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mybatis.vo.DeptVO;
import mybatis.vo.DeptVO2;
import mybatis.vo.MemVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main4 {

    public static void main(String[] args) throws Exception {
        
        Reader r = Resources.getResourceAsReader("mybatis/config/config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
        r.close();

        SqlSession ss = factory.openSession(true);
        List<DeptVO2> list  = ss.selectList("deptLoc.all");
        
        for (DeptVO2 vo : list) {
            System.out.println(vo.getDepartment_id() + "/" + vo.getDepartment_name()+ "/" +
                    vo.getLvo().getCity());
        }
        
        ss.close();
    }
}
