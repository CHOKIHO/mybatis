package ex1.client;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ex1.vo.EmpVO;

public class Main {

	public static void main(String[] args) throws IOException {

		// 1) mybatis 환경설정 파일과 연결할 스트림
		Reader r = Resources.getResourceAsReader("ex1/config/config.xml");
		
		// 2) 연결파일로부터 정보 인식 - factory 생성
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		
		r.close();
		
		// 3) factory를 통해 SqlSession을 얻기
		SqlSession ss = factory.openSession();
		
		// 4) sql 호출 
		List<EmpVO> lists = ss.selectList("emp.all");
		
		// 5) 결과처리
		
		for (EmpVO vo: lists) {
			System.out.println(vo.getEmployee_id() + "/" + vo.getFirst_name() + "/" 
							  + vo.getEmail() + "/" + vo.getDepartment_id());
		}
	}
}
