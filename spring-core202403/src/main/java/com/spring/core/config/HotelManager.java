package com.spring.core.config;

import com.spring.core.chap01.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 현재 클래스를 설정 파일로 등록 -> @ComponentScan 기능을 사용하기 위한 사전 작업.
@ComponentScan(basePackages = "com.spring.core.chap02")
// "com.spring.core.chap02" 경로에 @Component가 붙은 모든 객체를 스캔해서 빈으로 등록해라.
public class HotelManager {


}