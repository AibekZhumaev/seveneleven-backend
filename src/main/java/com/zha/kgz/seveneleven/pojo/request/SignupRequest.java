package com.zha.kgz.seveneleven.pojo.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * @author Zha_Aibek@mail.com
 */
@Getter
@Setter
public class SignupRequest {
    private String username;
    private String email;
    private Set<String> roles;
    private String password;
}
