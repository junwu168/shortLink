package com.masonwu.shortlink.admin.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.masonwu.shortlink.admin.dao.entity.GroupDO;
import com.masonwu.shortlink.admin.dao.mapper.GroupMapper;
import com.masonwu.shortlink.admin.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {

    @Override
    public void saveGroup(String groupName){
        GroupDO groupDO = GroupDO.builder()
                .gid(RandomUtil.randomNumbers(6))
                .name(groupName)
                .build();
        baseMapper.insert(groupDO);
    }
}
