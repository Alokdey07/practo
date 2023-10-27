package com.practo.practo.service;

import com.practo.practo.entity.Review;

import java.util.List;

public interface ReviewService {

    public Review createReview(Review review);
    public List<Review> getReviewByDoctorId(long doctorId);
}
