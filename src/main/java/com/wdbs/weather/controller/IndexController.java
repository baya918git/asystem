package com.wdbs.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wdbs.weather.model.amedas.AmedasHeader;
import com.wdbs.weather.repository.amedas.AmedasHeaderRepository;

/**
 * INDEX画面のコントローラクラス。
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {
	@Autowired
	private AmedasHeaderRepository amedasHeaderRepository;

	/**
	 * トップ画面
	 *
	 * @param model モデル
	 * @return 遷移先
	 */
	@RequestMapping("index")
	public String index(Model model) {
		return "index";
	}

	/**
	 * 気象データ
	 *
	 * @param model モデル
	 * @return 遷移先
	 */
	@RequestMapping("weather")
	public String weather(Model model) {
		AmedasHeader amedasHeader = amedasHeaderRepository.findById(1L).get();
		model.addAttribute("amedasHeader", amedasHeader);
		return "weather";
	}
}