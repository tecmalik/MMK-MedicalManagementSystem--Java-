package org.medicmmk.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface DoctorRepository extends MongoRepository<Doctor, String>{
}
