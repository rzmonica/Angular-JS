package com.softtek.jpa.web;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softtek.jpa.domain.User;
import com.softtek.jpa.domain.UserRole;
import com.softtek.jpa.services.UserRolService;
import com.softtek.jpa.services.UserService;

/**
 * Handles requests for the application home page.
 */
@RequestMapping(value="/User")
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRolService userRoleService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String root() {
		return "home";
	}
	@RequestMapping(value="/List")
	public ModelAndView List( ) {
		List<User> users = userService.userList();
		return new ModelAndView("UserList", "users", users);
	}


	@RequestMapping(value="/edit")
	public ModelAndView editUser(@RequestParam String username,@RequestParam String status) {
		User user = userService.user(username);
		List<UserRole> userRoleList = userRoleService.userRoleList();
		List<String> listStatus = userRoleService.statusList();
		Map<String,Object>map=new HashMap<String, Object>();
		map.put("users", user);
		map.put("userRole", userRoleList);
		map.put("listStatus", listStatus);
		map.put("status", status);
		return new ModelAndView("UserEdit","map",map);
		
	}
	 
	 @RequestMapping(value="/update" ,method=RequestMethod.POST)
	 public String updateUser(@ModelAttribute User user, HttpServletRequest  request) {

		 final String user_role_id = new String(request.getParameter("userRole"));
		if( userService.update(user, user_role_id)){
			return "redirect:/User/List";
		}
		 return "redirect:/User/edit?username="+user.getUsername()+"&status=Not valid";

	 }
}
