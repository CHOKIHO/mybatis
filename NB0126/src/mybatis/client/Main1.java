package mybatis.client;

import java.io.Reader;
import java.util.List;
import mybatis.vo.LocVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main1 {
    
    public static void main(String[] args) throws Exception {
        
        
        Reader r = Resources.getResourceAsReader("mybatis/config/config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
        r.close();
        
        SqlSession ss = factory.openSession();
        List<LocVO> list = ss.selectList("loc.all");
        
        
        for (LocVO vo : list) {
            
            System.out.println(vo.getCity() + "/" + vo.getCvo().getCountry_name() + "/" + vo.getCvo().getRegion_name());
        }
        
        ss.close();
        
    }
    
}
