package com.kjy.springboot.test.dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface CodeDAO  {

	public <T extends Map<String, Object>> List<LinkedHashMap<String, Object>> selects(T paramMap);

}
