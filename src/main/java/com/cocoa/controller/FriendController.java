package com.cocoa.controller;

import com.cocoa.dto.FriendDTO;
import com.cocoa.dto.LectureinfoDTO;
import com.cocoa.dto.LoginDTO;
import com.cocoa.service.FriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/lecture")
    public ModelAndView lectureinfo() throws Exception{
        ModelAndView mv = new ModelAndView("/lectureinfo-java01");


        List<LectureinfoDTO> lectureList =  friendService.getlecturelist();
        mv.addObject("list",lectureList);
        return mv;
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

//    @PostMapping("/loginFriend")
//    public String loginHome(@ModelAttribute LoginDTO loginDTO, HttpSession session
//         ) {
//
////         List<FriendDTO> friendList =  friendService.loginFriend(friendDTO);
////        FriendDTO dto = friendService.login(friendDTO);
////        boolean result = friendService.login(loginDTO);
//        System.out.println("result from FriendDTO "+ friendService.findAll(loginDTO));
//        System.out.println("로그인 이메일값은?" + loginDTO.getlEMAIL());
//        System.out.println("로그인 비번값은?" + loginDTO.getlPASSWORD());
//
//        String id = loginDTO.getlEMAIL();
//        String pwd = loginDTO.getlPASSWORD();
//        if(id != null){
//            System.out.println("테스트~~~~~~~~~~~!!!!!!!");
//
//            session.setAttribute("user", loginDTO.getlEMAIL());
//            System.out.println("세션~~~~~~~~~~~~~~~~~~~"+session);
//
//            return "loginHome";
//        }
//        else{
//            return "mainHome";
//        }
//
//    }

//    @ResponseBody
//    @PostMapping("/loginFriend")
//    public List<Map<String, Object>> test(
//    @RequestBody List<Map<String, Object>> param) {
//
//    return param;
//    }
//
//
//    @PostMapping("/signUpFriend")
//    public String signUpFriend(
//            @ModelAttribute FriendDTO friendDTO, HttpSession session
//    ) {
//
//         friendService.save(friendDTO);
//         System.out.println("---------------------------컨트롤러에서 저장");
//
//
////        FriendDTO dto = friendService.login(friendDTO);
////        if(dto == null){
////            return "mainHome";
////        }
////        else{
////            session.setAttribute("user", dto);
////            return "loginHome";
////        }
//        return "loginHome";
//    }


}
