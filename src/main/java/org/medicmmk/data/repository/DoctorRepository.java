package org.medicmmk.data.repository;


import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Specialty;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface DoctorRepository extends MongoRepository<Doctor, String>{

    Doctor findByEmail(String name);
    List<Doctor> findByLastName(String Lastname);
    List<Doctor> findByFirstName(String Firstname);
    List<Doctor> findByLastNameAndFirstName(String Lastname, String Firstname);
    List<Doctor> findBySpecialization(Specialty specialization);


}
