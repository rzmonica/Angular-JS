package com.softtek.jpa.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.softtek.jpa.domain.Cart;
import com.softtek.jpa.domain.ShipTo;
import com.softtek.jpa.domain.Status;
import com.softtek.jpa.services.CartService;
import com.softtek.jpa.services.ShipToService;
import com.softtek.jpa.services.StatusService;


@RequestMapping(value="/Cart")
@Controller
public class CartController {
	private static final Logger logger = LoggerFactory.getLogger(CartController.class);

/*	@Autowired
	CartService cartSerciveImpl;*/
	
	 @Autowired
	 CartService cartService;
	 
	 @Autowired
	 StatusService statusService;;
	 
	 @Autowired
	 ShipToService shipToService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String root() {
		return "home";
	}
	 @RequestMapping(value="/List")
	public ModelAndView List( ) {
		 List<Cart> carts = cartService.cartList();
		return new ModelAndView("CartList", "carts", carts);		

	 }
	 
	 
	 @RequestMapping(value="/edit")
	 public ModelAndView editUser(@RequestParam Long cartId,@RequestParam String status) {
		 Cart cart = cartService.cart(cartId);
		 List<Status> cartStatus = statusService.statusList("CART");
		List<ShipTo> shipTos = shipToService.shipToList();
		 Map<String,Object>map=new HashMap<String, Object>();
		 map.put("cart", cart);
		 map.put("cartStatus", cartStatus);
	
		 map.put("shipTos", shipTos);
		 map.put("status", status);
		 return new ModelAndView("CartEdit","map",map);
	 }
	 
	 @RequestMapping(value="/update" ,method=RequestMethod.POST)
	 public String updateCart(HttpServletRequest request) {
return null;
	 }
}
