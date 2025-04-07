package org.medicmmk.data.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface PatientAppointmentRepository extends MongoRepository <PatientAppointment,String> {
    List<PatientAppointment> findByAppointmentID(String appointmentID);
    List<PatientAppointment> findByPatientID(String patientID);


}
