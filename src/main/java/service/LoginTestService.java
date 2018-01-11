package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.LoginTest;
import mapper.LoginTestMapper;

@Service
public class LoginTestService {

	@Autowired
	private LoginTestMapper loginTestMapper;

	//トランザクション管理を行う

	@Transactional
	public List<LoginTest> selectAll(){

		return loginTestMapper.selectAll();

	}


}
