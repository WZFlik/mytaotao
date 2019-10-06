package com.mytaotao.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("page")
public class PageController {
	
/**
 * 页面跳转方法
 * @param pageName：页面输入得jsp名称
 * @return 返回页面
 */
	//{pageName}是url输入得jsp名字
	@RequestMapping(value= "{pageName}",method = RequestMethod.GET)
	//pathVriable将pageName解析成jsp
	public String toPage(@PathVariable("pageName") String pageName) {
		
		return pageName;
		
	}
}
