package com.wdbs.weather.controller.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wdbs.weather.model.employee.Employee;
import com.wdbs.weather.repository.employee.EmployeeRepository;

/**
 * ユーザー画面のコントローラクラス。
 *
 */
@Controller
@RequestMapping("/employee/")
public class EmployeeController {

	/** ユーザーリポジトリ */
	@Autowired
	private EmployeeRepository employeeRepository;

	/**
	 * 一覧画面
	 *
	 * @param model モデル
	 * @return 遷移先
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("employees", employeeRepository.findAll(new Sort(Sort.Direction.ASC, "id")));
		return "employee/list";
	}

	/**
	 * 入力画面
	 *
	 * @param model モデル
	 * @return 遷移先
	 */
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Model model) {
		model.addAttribute("employee", new Employee());
		return "employee/input";
	}

	/**
	 * 確認画面
	 *
	 * @param model モデル
	 * @return 遷移先
	 */
	@RequestMapping(value = "/confirm", method = RequestMethod.POST)
	public String confirm(@Validated @ModelAttribute("employee") Employee user, BindingResult result) {
		if (result.hasErrors()) {
			return "employee/input";
		}
		return "employee/confirm";
	}

	/**
	 * 登録画面
	 *
	 * @param model モデル
	 * @return 遷移先
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Model model, @ModelAttribute("employee") Employee employee) {
		employeeRepository.save(employee);
		return list(model);
	}
}
