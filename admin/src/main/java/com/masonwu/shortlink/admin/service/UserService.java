package com.masonwu.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.masonwu.shortlink.admin.dao.entity.UserDO;
import com.masonwu.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口
 */
public interface UserService extends IService<UserDO> {
    /**
     * return user info by username
     * @param username
     * @return
     */
    UserRespDTO getUserByUsername(String username);
}
