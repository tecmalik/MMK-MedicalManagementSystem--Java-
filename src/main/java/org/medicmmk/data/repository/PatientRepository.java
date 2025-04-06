package org.medicmmk.data.repository;

import org.medicmmk.data.models.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {
    Patient findByEmail(String name);
    List<Patient> findByLastName(String Lastname);
    List<Patient> findByFirstName(String Firstname);
    List<Patient> findByLastNameAndFirstName(String Lastname, String Firstname);

}