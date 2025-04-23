package com.masonwu.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.masonwu.shortlink.admin.dao.entity.UserDO;
import com.masonwu.shortlink.admin.dto.req.UserLoginReqDTO;
import com.masonwu.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.masonwu.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.masonwu.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.masonwu.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口
 */
public interface UserService extends IService<UserDO> {
    /**
     * return user info by username. Not case sensitive
     * @param username
     * @return
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * check if username has exists
     * @param username
     * @return
     */
    Boolean hasUsername(String username);

    /**
     * user register api
     * @param requestParam
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * update user info
     * @param requestParam
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     * @param requestParam 登录请求参数
     * @return 登录结果返回参数
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * check if user has logged in
     * @param token
     * @return
     */
    Boolean checkLogin(String token);
}
