package com.practo.practo.payload;

import com.practo.practo.entity.Doctor;
import com.practo.practo.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDto {

    private Doctor doctor;
    private List<Review> reviews;
    private double ratingPercentage;
}
