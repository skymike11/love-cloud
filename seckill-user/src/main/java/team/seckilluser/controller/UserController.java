package team.seckilluser.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.seckilluser.service.IUserService;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author van
 * @since 2019-12-06
 */
@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("/one")
    public String getOne(@RequestParam String user_id){
        return iUserService.getById(user_id).getUsername();
    }
}

