package com.chengxiaozhong;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhang.cheng
 *
 *         2018年2月7日 下午4:00:05
 */
@Controller
public class WelcomeCurryStarController {

	@RequestMapping(value = "/loveCurry.do")
	public String index(HttpServletRequest request) {
		return "index";
	}

}
