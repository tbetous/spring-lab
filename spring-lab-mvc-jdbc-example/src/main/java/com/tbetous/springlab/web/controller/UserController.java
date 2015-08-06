package com.tbetous.springlab.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tbetous.springlab.data.User;
import com.tbetous.springlab.service.UserService;

@Controller
public class UserController {
    
    @Autowired
    private UserService userService; 
    
    @Autowired
    @Qualifier("userValidator")
    private Validator userValidator;
    
    @RequestMapping(value="/user/form", method=RequestMethod.GET)
    public ModelAndView displayUserForm() {
        ModelAndView mv = new ModelAndView("user_form");
        mv.addObject("user", new User());
        return mv;
    }
    
    @RequestMapping(value="/user", method=RequestMethod.GET)
    public ModelAndView displayAllUser() {
        ModelAndView mv = new ModelAndView("user_list");
        List<User> users = userService.getUsers();
        mv.addObject("users", users);
        return mv;
    }
    
    @RequestMapping(value="/user/{userId}", method=RequestMethod.GET)
    public ModelAndView getUser(@PathVariable Long userId) {
        ModelAndView mv = new ModelAndView();
        Optional<User> user = userService.getUsers(userId);
        List<User> users = new ArrayList<User>();
        
        if(user.isPresent()) {
            users.add(user.get());
            mv.setViewName("user_list");
            mv.addObject("users", users);
        } else {
            mv.setViewName("redirect:/user");
        }
        
        return mv;
    }
    
    @RequestMapping(value="/user", method=RequestMethod.POST)
    public String createUser(@ModelAttribute("user") User user, Model model, BindingResult result)  {
        userValidator.validate(user, result);
        if(result.hasErrors()) {
            return "user_form";
        } else {
            userService.saveUser(user);
            return "redirect:user";
        }
    }
}
