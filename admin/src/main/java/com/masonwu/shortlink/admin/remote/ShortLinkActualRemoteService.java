package com.masonwu.shortlink.admin.remote;

import com.masonwu.shortlink.admin.common.convention.result.Result;
import com.masonwu.shortlink.admin.remote.dto.resp.ShortLinkGroupCountQueryRespDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ShortLinkActualRemoteService {

    /**
     * 查询分组短链接总量
     *
     * @param requestParam 分组短链接总量请求参数
     * @return 查询分组短链接总量响应
     */
    @GetMapping("/api/short-link/v1/count")
    Result<List<ShortLinkGroupCountQueryRespDTO>> listGroupShortLinkCount(@RequestParam("requestParam") List<String> requestParam);
}
