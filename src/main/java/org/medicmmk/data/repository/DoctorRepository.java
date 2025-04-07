package org.medicmmk.data.repository;

import org.medicmmk.data.model.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends MongoRepository<Doctor, String> {
    Optional<Doctor> findDoctorById(String id);
    Optional<Doctor> findDoctorByEmail(String email);
    Optional<Doctor> findByUsername(String username);
    Optional<Doctor> findByPassword(String password);
    Optional<Doctor> findByEmail(String email);
}
