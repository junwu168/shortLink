package com.masonwu.shortlink.admin.dto.req;

import lombok.Data;

@Data
public class UserLoginReqDTO {
    private String username;
    private String password;
}
