package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoesController {
@Autowired
	ShoesDAO Dao;
@Autowired
	ShoesRepo repo;
@Autowired
UserRepo URepo;
float Total=20000.0f;
@RequestMapping("/")
public ModelAndView displaypage(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("index.jsp");
	return mv;
}
@RequestMapping("/loginadmin")
public ModelAndView checklogin(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	String user = req.getParameter("user");
	String password=req.getParameter("pwd");
	User user_=URepo.findByuserpwd(user, password);
	if(user_!=null) {
		if(user.equalsIgnoreCase("admin")) {
		mv.setViewName("AdminMainIndex.jsp");
		mv.addObject("user", user_);
		}
	}
	else {
		mv.setViewName("fail.jsp");
	}
	return mv;
}
@RequestMapping("/loginuser")
public ModelAndView checkloginuser(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	String user = req.getParameter("user");
	String password=req.getParameter("pwd");
	User user_=URepo.findByuserpwd(user, password);
	if(user_!=null) {
		List<Shoes> list=Dao.getall();
		mv.setViewName("UserMain.jsp");
		mv.addObject("list", list);
		
	}
	else {
		mv.setViewName("fail.jsp");
	}
	return mv;
}

@ResponseBody
@RequestMapping("/registermslogin")
public ModelAndView registermslogin(HttpServletRequest req,HttpServletResponse res) {
	ModelAndView mv=new ModelAndView();
	String user=req.getParameter("user");
	String password=req.getParameter("pwd");
	String email=req.getParameter("email");
	RestTemplate rest = new RestTemplate();
	String url="http://localhost:8084/register-user/"+user+"/"+password+"/"+email;
	
	rest.getForObject(url, String.class);
	//System.out.println("Registration Successful!");
	if(user.equalsIgnoreCase("admin")) {
		mv.setViewName("AdminMainIndex.jsp");
	}
	else 
		mv.setViewName("UserMain.jsp");
	mv.addObject("user", user);
	return mv;
}
	
@RequestMapping("/insert")
public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Shoes s=new Shoes();
	s.setShoeid(Integer.parseInt(request.getParameter("shoeid")));
	s.setShoename(request.getParameter("shoename"));
	s.setPrice(Float.parseFloat(request.getParameter("shoeprice")));
	//s.setFilepath(request.getParameter("filepath"));
	Shoes ep=Dao.insert(s);
	List<Shoes> list=Dao.getall();
	if(ep!=null) {
		System.out.println("insertion is successful!\n");
		mv.setViewName("display.jsp");
		mv.addObject("list",list);
	}
	return mv;
} 
@RequestMapping("/delete")
public ModelAndView deleteControl(HttpServletRequest request,HttpServletResponse response,@RequestParam("deleteid") Integer id) {
	ModelAndView mv=new ModelAndView();
	Shoes s=new Shoes();
	//Integer id=Integer.parseInt(request.getParameter("shoeid"));
	Dao.deletebyId(id);
	List<Shoes> list=Dao.getall();
	if(list!=null) {
		System.out.println("deleteion is successful!\n");
		mv.setViewName("display.jsp");
		mv.addObject("list",list);
	}
	else {
		System.out.println("Check the Shoe id..Deletion unsuccessful!\n");
	}
		
	
	
	return mv;
} 

@RequestMapping("/getall")
public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
List<Shoes> list=Dao.getall();
mv.setViewName("display.jsp");
mv.addObject("list",list);	
	return mv;
}

@RequestMapping("/update")
public ModelAndView updateAll(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
List<Shoes> list=Dao.getall();
mv.setViewName("display.jsp");
mv.addObject("list",list);	
	return mv;
}
@RequestMapping("/edit")
public ModelAndView edit(HttpServletRequest request,HttpServletResponse response) {
	ModelAndView mv=new ModelAndView();
	Shoes s=new Shoes();
	s.setShoeid(Integer.parseInt(request.getParameter("shoeid")));
	s.setShoename(request.getParameter("shoename"));
	s.setPrice(Float.parseFloat(request.getParameter("shoeprice")));
	
	
	List<Shoes> list=Dao.editbyId(s.getShoename(),s.getPrice(),s.getShoeid());
	if(list!=null) {
		System.out.println("Edit is successful!\n");
		mv.setViewName("AdminMainIndex.jsp");
		mv.addObject("list",list);
	}
	return mv;
}
@RequestMapping("/buynow")
public ModelAndView buynow(HttpServletRequest request,HttpServletResponse response,@RequestParam("shoeid") Integer id, @RequestParam("price") Float price) {
	

	ModelAndView mv=new ModelAndView();
	
	float  remain;
	
	
	remain=Total-price;
	if(remain>0)
	{
		System.out.println("Shoes Bought!\n");
		Dao.deletebyId(id);
		List<Shoes> list=Dao.getall();
		mv.setViewName("BuySuccess.jsp");
		mv.addObject("list",list);
	}
	else {
		System.out.println("Low Balance...");
		List<Shoes> list=Dao.getall();
		mv.setViewName("UserMain.jsp");
		mv.addObject("list",list);
	
	}
	return mv;
}
@RequestMapping("/Payment")
public ModelAndView Payment(HttpServletRequest request,HttpServletResponse response,@RequestParam("se.getShoeid") Integer id,@RequestParam("se.getPrice") Float price) {
	

	ModelAndView mv=new ModelAndView();
	Shoes s=new Shoes();
	float Total=20000.0f;
	float  remain;
	remain=Total-price;
	if(remain>price)
	{
		System.out.println("Shoes Bought!\n");
		Dao.deletebyId(id);
		List<Shoes> list=Dao.getall();
		mv.setViewName("UserMain.jsp");
		mv.addObject("list",list);
	}
	
	
	
	return mv;
}
}
