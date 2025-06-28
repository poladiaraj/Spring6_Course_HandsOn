package com.rpoladia.springbootwebdemo;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    //This includes .jsp extension
    /*
    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index.jsp";
    }
    */

    //This is Servlet way of getting the data from request.
    /*
    @RequestMapping("add")
    public String add(HttpServletRequest req, HttpSession session) {
        System.out.println("Add method called");
        int num1 = Integer.parseInt(req.getParameter("num1"));
        int num2 = Integer.parseInt(req.getParameter("num2"));
        int result = num1 + num2;
        System.out.println("Result is: " + result);

        session.setAttribute("result", result);

        return "result.jsp";
    }
    */

    //This is Spring way with session object
    //If same variable name then the @Requestparam is not required
    /*
    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, HttpSession session) {
        System.out.println("Add method called");
        int result = num + num2;
        System.out.println("Result is: " + result);

        session.setAttribute("result", result);

        return "result.jsp";
    }
    */

    //This is Spring way without session (with Model)
    /*
    @RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, Model model) {
        System.out.println("Add method called");
        int result = num + num2;
        System.out.println("Result is: " + result);

        model.addAttribute("result", result);

        return "result.jsp";
    }
    */

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index";
    }

    //Using only model
    /*@RequestMapping("add")
    public String add(@RequestParam("num1") int num, int num2, Model model) {
        System.out.println("Add method called");
        int result = num + num2;
        System.out.println("Result is: " + result);

        model.addAttribute("result", result);

        return "result";
    }*/

    //Using ModelAndView
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {
        System.out.println("Add method called");
        int result = num + num2;
        System.out.println("Result is: " + result);

        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;
    }

    //Without ModelAttribute (With ModelAndView)
    /*@RequestMapping("addAlien")
    public ModelAndView add(@RequestParam("aid") int aid, String aname, ModelAndView mv) {
        Alien alien = new Alien();
        alien.setAid(aid);
        alien.setAname(aname);

        mv.addObject("alien", alien);
        mv.setViewName("result");

        return mv;
    }*/

    //With ModelAttribute
    /*@RequestMapping("addAlien")
    public String add(@ModelAttribute("alien1") Alien alien) {
        return "result";
    }*/

    //Without ModelAttribute: If the argument name is same as the one referred in the view then @ModelAttribute annotation is not required.
    @RequestMapping("addAlien")
    public String add(Alien alien) {
        return "result";
    }

    @ModelAttribute("course")
    public String courseName() {
        return "Java";
    }
}
