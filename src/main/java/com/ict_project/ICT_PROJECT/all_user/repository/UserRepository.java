package com.ict_project.ICT_PROJECT.all_user.repository;

import com.ict_project.ICT_PROJECT.all_user.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {

}
