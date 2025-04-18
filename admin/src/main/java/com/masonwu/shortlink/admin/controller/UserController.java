package com.masonwu.shortlink.admin.controller;

import com.masonwu.shortlink.admin.common.convention.result.Result;
import com.masonwu.shortlink.admin.common.convention.result.Results;
import com.masonwu.shortlink.admin.dto.resp.UserRespDTO;
import com.masonwu.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor //构造器注入
public class UserController {
    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }
}
