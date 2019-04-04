package com.paralun.app;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String userName;
    private String fullName;
    private String userRole;
    private String status;
}
