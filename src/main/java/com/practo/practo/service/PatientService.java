package com.practo.practo.service;

import com.practo.practo.entity.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatients();
    Patient createPatient(Patient patient);
}
