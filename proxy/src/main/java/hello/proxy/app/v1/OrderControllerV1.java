package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 스프링은 @Controller 또는 @RequestMapping 이 있어야 스프링 컨트롤러로 인식
// 스프링 컨트롤러로 인식해야지 HTTP URL 매핑이 되고 동작
@RequestMapping
// HTTP 메시지 컨버터를 사용해서 응답
@ResponseBody
public interface OrderControllerV1 {

    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId);

    @GetMapping("/v1/no-log")
    String noLog();
}
