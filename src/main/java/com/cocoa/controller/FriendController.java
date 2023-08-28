package com.cocoa.controller;

import com.cocoa.dto.FriendDTO;
import com.cocoa.service.FriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class FriendController {

    private final FriendService friendService;
    @GetMapping("/mainHome")
    public String mainForm() {
        System.out.println("123");
        return "mainHome";
    }

    @PostMapping("/mainHome")
    public String insertFriend(@ModelAttribute FriendDTO friendDTO) {
        System.out.println("FriendController.main");
        System.out.println("FriendDTO = " + friendDTO);

//        friendService.insertFriend(friendDTO);
        return "redirect:/";
    }



//    @GetMapping("/loginHome")
//    public String loginForm() {
//        return "loginHome";
//    }

//    @PostMapping("/")
//    public String login(@ModelAttribute FriendDTO friendDTO) {
//        FriendDTO loginResult = friendService.login(friendDTO);
//        if (loginResult != null) {
//            return "loginHome";
//        } else {
//            return "mainHome";
//        }
//    }

    @PostMapping("/loginFriend")
    public String loginHome(@ModelAttribute FriendDTO friendDTO, HttpSession session
         ) {

//         List<FriendDTO> friendList =  friendService.loginFriend(friendDTO);
//        FriendDTO dto = friendService.login(friendDTO);
        boolean result = friendService.login(friendDTO);
        if(result == true){
            session.setAttribute("user", friendDTO);
            return "loginHome";
        }
        else{
            return "mainHome";
        }
    }

    @PostMapping("/signUpFriend")
    public String signUpFriend(
            @ModelAttribute FriendDTO friendDTO, HttpSession session
    ) {

         friendService.save(friendDTO);
//        FriendDTO dto = friendService.login(friendDTO);
//        if(dto == null){
//            return "mainHome";
//        }
//        else{
//            session.setAttribute("user", dto);
//            return "loginHome";
//        }
        return "loginHome";
    }


}
