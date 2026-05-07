package org.example.hogwartlabo2.controller;

import lombok.RequiredArgsConstructor;
import org.example.hogwartlabo2.domain.entity.Wizard;
import org.example.hogwartlabo2.service.WizardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/wizards")
@RequiredArgsConstructor
public class WizardController {

    private final WizardService wizardService;

    @PostMapping
    public ResponseEntity<Wizard> createWizard(@RequestBody Wizard wizard) {
        wizardService.createWizard(wizard);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(wizard);
    }

    @GetMapping
    public List<Wizard> getAllWizards() {
        return wizardService.getAllWizard();
    }

    @GetMapping("/deatheaters")
    public List<Wizard> getDeatheaters() {
        return wizardService.getWizardDeatheater();
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateWizard(@PathVariable UUID id, @RequestBody Wizard wizard) {
        wizardService.updateWizard(id, wizard);
        return ResponseEntity.ok("Mago actualizado correctamente");
    }

    @GetMapping("/patronus/{patronus}")
    public List<Wizard> getByPatronus(@PathVariable String patronus) {
        return wizardService.getPatronus(patronus);
    }

    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Wizard> deleteWizard(@PathVariable UUID id) {
        Wizard deletedWizard = wizardService.deleteWizard(id);
        return ResponseEntity.ok(deletedWizard);
    }
}