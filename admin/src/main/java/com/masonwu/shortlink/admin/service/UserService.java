package com.masonwu.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.masonwu.shortlink.admin.dao.entity.UserDO;
import com.masonwu.shortlink.admin.dto.req.UserRegisterReqDTO;
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
     * check if user name has exists
     * @param username
     * @return
     */
    Boolean hasUsername(String username);

    /**
     * user register api
     * @param requestParam
     */
    void register(UserRegisterReqDTO requestParam);
}
