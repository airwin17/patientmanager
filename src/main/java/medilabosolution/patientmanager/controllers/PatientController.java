package medilabosolution.patientmanager.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.validation.Valid;
import medilabosolution.patientmanager.model.Patient;
import medilabosolution.patientmanager.service.PatientService;

@Controller
public class PatientController {
    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public ResponseEntity<String> save(@Valid @RequestBody Patient patient) {
        patientService.save(patient);
        return ResponseEntity.ok("Patient saved successfully");
    }
    @PostMapping
    public ResponseEntity<String> update(@Valid @RequestBody Patient patient) {
        patientService.save(patient);
        return ResponseEntity.ok("Patient updated successfully");
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestParam int id) {
        patientService.deleteById(id);
        return ResponseEntity.ok("Patient deleted successfully");
    }
    @GetMapping
    public ResponseEntity<Patient> findById(@RequestParam int id) {
        return ResponseEntity.ok(patientService.findById(id));
    }
    @GetMapping
    public ResponseEntity<List<Patient>> findAll() {
        return ResponseEntity.ok(patientService.findAll());
    }
    @GetMapping
    public ResponseEntity<Patient> findByNames(@RequestParam String firstname, @RequestParam String lastname) {
        return ResponseEntity.ok(patientService.findByNames(firstname, lastname));
    }
}
