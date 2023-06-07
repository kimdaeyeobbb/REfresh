package tko.refresh.controller.auth;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tko.refresh.dto.member.MemberJoinDto;
import tko.refresh.dto.member.request.MemberLoginReqDto;
import tko.refresh.service.login.LoginService;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService memberService;


    @PostMapping
    public ResponseEntity login(@RequestBody MemberLoginReqDto dto, HttpServletResponse response)
            throws IOException {
        return ResponseEntity.ok().body(memberService.login(dto, response));
    }

//    @PostMapping("/join")
//    public String join() {
//        memberService.signup(MemberJoinDto.builder().deptName("서비스팀").memberId("seunghee").password("qwer1234").email("seunghee@daum.net").build());
//        return "success";
//    }

}
