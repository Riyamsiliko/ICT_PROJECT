package com.ict_project.ICT_PROJECT.staff.model;

import com.ict_project.ICT_PROJECT.all_user.model.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "staff")
@Entity
public class StaffModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "staffID", nullable = false)
    private Long staffID;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

//    @ManyToOne
//    @JoinColumn(name = "userID")
//    private UserModel userModel;
}
