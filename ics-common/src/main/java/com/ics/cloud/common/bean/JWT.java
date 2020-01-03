package com.ics.cloud.common.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JWT {
    private String access_token;
    private String token_type;
    private String refresh_token;
    private int expires_in;
    private String scope;
    private String jti;
}
