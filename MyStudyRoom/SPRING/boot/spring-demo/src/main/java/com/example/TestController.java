package com.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value="/test") // 브라우저에서 /test 로 들어오면 아래함수 실행
    public UserDto test(){ //UserDto를 리턴하는 함수
        UserDto userDto = new UserDto(); //객체 생성
        userDto.setAge(20);
        userDto.setName("hoon");

        return userDto;
    }


}
