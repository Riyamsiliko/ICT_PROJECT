package com.ict_project.ICT_PROJECT.all_user.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserResponse {

    private Long userID;

    private String userName;

    private String professional;
}
