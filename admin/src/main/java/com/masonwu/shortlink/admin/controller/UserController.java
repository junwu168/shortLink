package com.masonwu.shortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.masonwu.shortlink.admin.common.convention.result.Result;
import com.masonwu.shortlink.admin.common.convention.result.Results;
import com.masonwu.shortlink.admin.dto.req.UserLoginReqDTO;
import com.masonwu.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.masonwu.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.masonwu.shortlink.admin.dto.resp.UserActualRespDTO;
import com.masonwu.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.masonwu.shortlink.admin.dto.resp.UserRespDTO;
import com.masonwu.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor //构造器注入
public class UserController {
    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/short-link/admin/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/short-link/admin/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }

    /**
     * 查询用户名是否存在
     */
    @GetMapping("/api/short-link/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username){
        return Results.success(userService.hasUsername(username));
    }

    @PostMapping("/api/short-link/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

    @PutMapping("/api/short-link/v1/user")
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam){
        userService.update(requestParam);
        return Results.success();
    }

    /**
     * 用户登录
     * @param requestParam
     * @return
     */
    @PostMapping("/api/short-link/v1/user/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginReqDTO requestParam){
        return Results.success(userService.login(requestParam));
    }

    @GetMapping("/api/short-link/v1/user/login")
    public Result<Boolean> checkLogin(@RequestParam("token") String token){
        return Results.success(userService.checkLogin(token));
    }
}
