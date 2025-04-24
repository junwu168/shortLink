package com.masonwu.shortlink.admin.controller;

import com.masonwu.shortlink.admin.common.convention.result.Result;
import com.masonwu.shortlink.admin.common.convention.result.Results;
import com.masonwu.shortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import com.masonwu.shortlink.admin.dto.req.ShortLinkGroupSortReqDTO;
import com.masonwu.shortlink.admin.dto.req.ShortLinkGroupUpdateReqDTO;
import com.masonwu.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;
import com.masonwu.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    /**
     * 新增短链接分组
     */
    @PostMapping("/api/short-link/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }

    /**
     * 查询短链接分组集合
     */
    @GetMapping("/api/short-link/v1/group")
    public Result<List<ShortLinkGroupRespDTO>> listGroup() {
        return Results.success(groupService.listGroup());
    }

    /**
     * 修改短链接分组名称
     */
    @PutMapping("/api/short-link/v1/group")
    public Result<Void> updateGroup(@RequestBody ShortLinkGroupUpdateReqDTO requestParam) {
        groupService.updateGroup(requestParam);
        return Results.success();
    }

    /**
     * 删除短链接分组名称
     */
    @DeleteMapping("/api/short-link/v1/group")
    public Result<Void> updateGroup(@RequestParam String gid) {
        groupService.deleteGroup(gid);
        return Results.success();
    }

    /**
     * 短链接排序
     */
    @PostMapping("/api/short-link/v1/group/sort")
    public Result<Void> sortGroup(@RequestBody List<ShortLinkGroupSortReqDTO> requestParam) {
        groupService.sortGroup(requestParam);
        return Results.success();
    }
}
