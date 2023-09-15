package com.ict_project.ICT_PROJECT.all_user.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserRequest {

    private String userName;

    private String professional;

    private String password;


}
