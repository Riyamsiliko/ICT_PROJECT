package com.ict_project.ICT_PROJECT.all_user.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "emp_user")
@Entity
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID", nullable = false)
    private Long userID;

    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "professional", nullable = false)
    private String professional;

    @Column(name = "password", nullable = false)
    private String password;


}
