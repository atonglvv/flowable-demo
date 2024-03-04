package cn.atong.leek.flowable.controller;


import cn.atong.leek.flowable.entity.User;
import cn.atong.leek.flowable.service.ActDeModelService;
import cn.atong.leek.flowable.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
public class HelloController {

    @Resource(name = "user")
    UserService userService;
    @Autowired
    ActDeModelService actDeModelService;

    @RequestMapping(value = "hello", produces = {"application/json"})
    public String hello() {
        List<User> users = userService.listUser();
        return users.toString();
    }

    @GetMapping(value = "act-de-model", produces = {"application/json"})
    public String selectModelById() {
        Object o = actDeModelService.selectOne();
        return o.toString();
    }
}
