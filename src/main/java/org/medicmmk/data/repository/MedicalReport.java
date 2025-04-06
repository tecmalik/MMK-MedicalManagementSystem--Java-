package org.medicmmk.data.repository;

import java.util.List;
import java.util.Optional;

public interface MedicalReport {
    Optional<MedicalReport>  getDoctorReport();
    Optional<MedicalReport>  getPatientReport();
    Optional<MedicalReport>  getAppointmentReport();
    Optional<MedicalReport>  getMedicalHistoryReport();
}
