package com.example.app4.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.app4.service.UserService;
import com.example.app4.dto.UserDTO;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService; // 사용자 서비스, 실제 사용자 인증 로직을 처리

    @PostMapping("/loginsave")
    public String save(@ModelAttribute UserDTO userDTO, HttpSession session) {
        UserDTO loginResult = userService.login(userDTO);
        if (loginResult != null) {
            //로그인성공
            session.setAttribute("userId", loginResult.getUserId());
            session.setAttribute("userName", loginResult.getUserName());
            session.setMaxInactiveInterval(60 * 30);

            return "redirect:/home";
        } else {
            return "/login";
        }
    }
}

