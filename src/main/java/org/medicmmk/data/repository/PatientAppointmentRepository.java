package org.medicmmk.data.repository;

import org.medicmmk.data.models.PatientAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface PatientAppointmentRepository extends MongoRepository <PatientAppointment,String> {
    List<PatientAppointment> findByAppointmentID(String appointmentID);
    List<PatientAppointment> findByPatientID(String patientID);


}
