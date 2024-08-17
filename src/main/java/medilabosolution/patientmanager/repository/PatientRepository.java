package medilabosolution.patientmanager.repository;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import medilabosolution.patientmanager.model.Patient;

@RepositoryDefinition(domainClass = RepositoryDefinition.class, idClass = Integer.class)
public interface PatientRepository  {
    public Patient save(Patient patient);
    public Patient findById(int id);
    public void deleteById(int id);
    public Patient findByFirstnameAndLastname(String firstname, String lastname);
    public List<Patient> findAll();

}
