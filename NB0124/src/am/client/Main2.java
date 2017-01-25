package am.client;

import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import mybatis.vo.MemVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main2 {

    public static void main(String[] args) throws Exception {
        
        Reader r = Resources.getResourceAsReader("mybatis/config/config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
        r.close();

        //String id, pwd, name, email, phone, reg_date;

        MemVO vo1 = new MemVO();
        vo1.setId("C1");
        vo1.setPwd("1111");
        vo1.setName("까치");
        vo1.setEmail("a@n.com");
        vo1.setPhone("010-1111-2222");
        
        MemVO vo2 = new MemVO("C2", "1111", "김태희", "a@b.com", "010-5555-5555");
        MemVO vo3 = new MemVO("C3", "1111", "비", "a1@b1.com", "010-7777-7777");
        
        MemVO[] ar = new MemVO[3];
        
        ar[0] = vo1;
        ar[1] = vo2;
        ar[2] = vo3;
        
        SqlSession ss = factory.openSession(true);
        
        /*
        for (MemVO vo : ar){
            int cnt = ss.insert("mem.add2", ar);
        }
        */
        
        Map<String, MemVO[]> map = new HashMap<>();
        
        map.put("m_list", ar);
        
        int cnt = ss.insert("mem.add2", map);
        
        ss.close();
        
    }
}
