package com.ict_project.ICT_PROJECT.staff.repository;

import com.ict_project.ICT_PROJECT.staff.model.StaffModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffModel, Long> {
}
