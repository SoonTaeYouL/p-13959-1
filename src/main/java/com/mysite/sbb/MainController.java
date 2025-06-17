package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // @Controller 어노테이션은 이 클래스가 컨트롤러임을 나타냅니다. 스프링에게 알림
public class MainController {
    @GetMapping("/") // @GetMapping 어노테이션은 HTTP GET 요청을 처리하는 메서드를 정의합니다.
    @ResponseBody // 액션메서드가 반환(리턴)한 값이 요청에 대한 응답본문이 되어 브라우저에 표시
    public String index() {
        System.out.println("index() 메서드 호출됨");
        return "SBB";
    }
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("hello() 메서드 호출됨");
        return "안녕안녕";
    }
}
