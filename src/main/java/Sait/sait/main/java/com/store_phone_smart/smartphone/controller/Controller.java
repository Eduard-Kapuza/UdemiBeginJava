package Sait.sait.main.java.com.store_phone_smart.smartphone.controller;


import com.store_phone_smart.smartphone.entity.Registraciya;
import com.store_phone_smart.smartphone.repository.UserRepository;
import com.store_phone_smart.smartphone.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
    private UserServiceImpl userServiceImpl;

    @Autowired

    Controller(UserServiceImpl userServiceImpl) {
        this.userServiceImpl=userServiceImpl;
    }

//<html lang="ru" xmlns="http://www.w3.org/1999/xhtml"
//      xmlns:th="http://thymeleaf.org">
//<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    @GetMapping("/main")
    public String start(Model model) {
        //System.out.println(userRepository.findAll());
        model.addAttribute("regForm", new Registraciya());
        return "Registracija1.html";
    }
    @PostMapping("/Reg")
    public String controllerReg(@ModelAttribute("regForm") Registraciya registraciya, Model model) {
        System.out.println(registraciya);
        userServiceImpl.addUser(registraciya);
        return "glavnajaNEW.html";
    }
}
