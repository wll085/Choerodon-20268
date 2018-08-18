package io.choerodon.demo.api.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//import io.choerodon.core.iam.ResourceLevel;
//import io.choerodon.swagger.annotation.Permission;

@RestController
public class DemoController {
    @Value("${number}")
    private int number;
    @Value("${str}")
    private String str;
    @GetMapping("/hello")
    public String hello() {
        String ss="Hello "+number+" "+str;
        return ss;
    }
}
