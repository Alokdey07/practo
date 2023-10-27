package com.practo.practo.service;

import com.practo.practo.entity.Doctor;

import java.util.List;

public interface DoctorService {
    Doctor addDoctor(Doctor doctor);
    List<Doctor> getAllDoctors();

    List<Doctor> searchDoctors(String keyword);
}
