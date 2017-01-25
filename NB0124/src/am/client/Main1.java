package am.client;

import java.io.Reader;
import mybatis.vo.MemVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main1 {

    public static void main(String[] args) throws Exception {
        
        Reader r = Resources.getResourceAsReader("mybatis/config/config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
        r.close();

        MemVO vo1 = new MemVO();
        vo1.setId("A1");
        vo1.setPwd("1111");
        vo1.setName("아라치");
        vo1.setEmail("a@n.com");
        vo1.setPhone("010-1111-2222");
        
        SqlSession ss = factory.openSession(true);
        int cnt = ss.insert("mem.add1", vo1);
        ss.close();
        
    }
}
