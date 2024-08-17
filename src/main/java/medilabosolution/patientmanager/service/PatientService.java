package medilabosolution.patientmanager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import medilabosolution.patientmanager.model.Patient;
import medilabosolution.patientmanager.repository.PatientRepository;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient findById(int id) {
        return patientRepository.findById(id);
    }
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
    public void deleteById(int id) {
        patientRepository.deleteById(id); 
    }
    public Patient findByNames(String firstname, String lastname) {
        return patientRepository.findByFirstnameAndLastname(firstname, lastname);
    }
}
