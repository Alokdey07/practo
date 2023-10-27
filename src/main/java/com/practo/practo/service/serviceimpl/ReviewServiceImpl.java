package com.practo.practo.service.serviceimpl;

import com.practo.practo.entity.Doctor;
import com.practo.practo.entity.Patient;
import com.practo.practo.entity.Review;
import com.practo.practo.repository.DoctorRepository;
import com.practo.practo.repository.PatientRepository;
import com.practo.practo.repository.ReviewRepository;
import com.practo.practo.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public Review createReview(Review review) {
        Doctor doctor = doctorRepository.findById(review.getDoctorId()).get();

        Patient patient = patientRepository.findById(review.getPatentId()).get();

        Review saveReview = null;
        if (doctor != null || patient != null) {
            saveReview = reviewRepository.save(review);
        }

        return saveReview;
    }

    public List<Review> getReviewByDoctorId(long doctorId){
        List<Review> review = reviewRepository.findByDoctorId(doctorId);

        return review;
    }
}
