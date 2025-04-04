package org.medicmmk.data.repository;


import org.medicmmk.data.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface PatientRepository extends MongoRepository<Patient, String> {
    Patient findByEmail(String name);
    List<Patient> findByLastName(String Lastname);
    List<Patient> findByFirstName(String Firstname);
    List<Patient> findByLastNameAndFirstName(String Lastname, String Firstname);


}
