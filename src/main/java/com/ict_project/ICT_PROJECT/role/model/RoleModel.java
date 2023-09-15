package com.ict_project.ICT_PROJECT.role.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "role")
@Entity
public class RoleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roleID" , nullable = false)
    private Long id;

    @Column(name = "roleName", nullable = false)
    private String roleName;
}
