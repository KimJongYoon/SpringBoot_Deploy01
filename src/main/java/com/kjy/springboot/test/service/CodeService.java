package com.kjy.springboot.test.service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kjy.springboot.test.dao.CodeDAO;

@Service
public class CodeService {

	@Autowired
	private CodeDAO codeDAO;

	public <T extends Map<String,Object>> List<LinkedHashMap<String,Object>> selects(T paramMap){
		return codeDAO.selects(paramMap);
	}

}
