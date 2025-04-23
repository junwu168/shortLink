package com.masonwu.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.masonwu.shortlink.admin.dao.entity.GroupDO;
import com.masonwu.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

    List<ShortLinkGroupRespDTO> listGroup();
}
