package pm.client;

import am.client.MyFrame;
import java.io.Reader;
import java.util.List;
import javax.annotation.Resource;
import mybatis.vo.DeptVO;
import mybatis.vo.Dept_Loc;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main2 {
    
    public static void main(String args[]) throws Exception{
        
        Reader r = Resources.getResourceAsReader("mybatis/config/config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
        r.close();

        SqlSession ss = factory.openSession();
        List<Dept_Loc> list = ss.selectList("dept_loc.get_dept");
        ss.close();
        
        for (Dept_Loc vo: list) {
            System.out.println(vo.getDepartment_id() + "/" + vo.getDepartment_name() + "/" + vo.getCity() + "/" + vo.getCountry_id());
        }
    
    }
}
