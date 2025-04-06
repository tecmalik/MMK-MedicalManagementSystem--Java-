package org.medicmmk.data.repository;

import org.medicmmk.data.models.Doctor;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface DoctorRepository extends MongoRepository<Doctor, String>{
}
