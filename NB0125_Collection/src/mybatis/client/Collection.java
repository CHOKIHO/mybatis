package mybatis.client;

import java.io.Reader;
import java.util.List;
import mybatis.vo.DeptVO;
import mybatis.vo.LocVO;
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
        
        List<LocVO> list = ss.selectList("loc.all");
        
        for (LocVO vo : list) {
            
            List<DeptVO> d_list = vo.getD_list();
            System.out.println(vo.getLocation_id() + "/" + vo.getCity()+"-("+d_list.size()+")");
            
            for (DeptVO dvo : d_list) {
                
                System.out.println("\t-" + dvo.getDepartment_name());
            }
        }
        ss.close();
    }
}
