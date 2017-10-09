package com.zhiyou100.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou100.model.Properties;
import com.zhiyou100.service.PropertiesService;
import com.zhiyou100.vo.ResponseVo;

@Controller
public class PropertiesController {
	@Autowired
	private PropertiesService service;

	@RequestMapping(path = "/addProperties", method = RequestMethod.POST)
	public @ResponseBody ResponseVo<Properties> addProperties(@RequestBody Properties properties) {
		service.addProperties(properties);
		return new ResponseVo<Properties>(1, "请求成功", null);
	}
}
