package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import entity.LoginTest;

@MapperScan
public interface LoginTestMapper {

	@Insert("INSERT INTO ASADMIN.LOGINTEST(USER_ID, USER_NEMAE, LOGIN_PASS, LAST_LOGIN_TIME, CREATED_TIME, MODIFIED_TIME)  VALUES (  #{user_id},  #{user_nemae},  #{login_pass},  #{last_login_time},  #{created_time},  #{modified_time})")
	public void insertLoginTest();

	@Select("select * from ASADMIN.LOGINTEST")
	public List<LoginTest> selectAll();


}
