package com.kjy.springboot.test.web;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kjy.springboot.test.service.CodeService;

@Controller
public class MainController {

	@Autowired
	private CodeService codeService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		List<LinkedHashMap<String,Object>> listMap = codeService.selects(new HashMap<>());
		listMap.forEach(obj -> {
			obj.forEach((k,v) -> {
				System.out.println(k);
			});
		});

		System.out.println("메인");
		return "main";
	}
}
