package com.practo.practo.repository;


import com.practo.practo.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {
    List<Review> findByDoctorId(Long Id);

}
