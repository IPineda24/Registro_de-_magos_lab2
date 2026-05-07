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

    // Registrar mago: POST /api/wizards
    @PostMapping
    public ResponseEntity<String> createWizard(@RequestBody Wizard wizard) {
        wizardService.createWizard(wizard);
        return new ResponseEntity<>("Mago creado exitosamente", HttpStatus.CREATED);
    }

    // Obtener todos: GET /api/wizards
    @GetMapping
    public List<Wizard> getAllWizards() {
        return wizardService.getAllWizard();
    }

    // Obtener solo los Mortífagos: GET /api/wizards/deatheaters
    @GetMapping("/deatheaters")
    public List<Wizard> getDeatheaters() {
        return wizardService.getWizardDeatheater();
    }

    // Actualizar mago: PUT /api/wizards/{id}
    @PutMapping("/{id}")
    public ResponseEntity<String> updateWizard(@PathVariable UUID id, @RequestBody Wizard wizard) {
        wizardService.updateWizard(id, wizard);
        return ResponseEntity.ok("Mago actualizado correctamente");
    }

    // Obtener por nombre del patronus: GET /api/wizards/patronus/{patronus}
    @GetMapping("/patronus/{patronus}")
    public ResponseEntity<Wizard> getByPatronus(@PathVariable String patronus) {
        return wizardService.getPatronus(patronus)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Eliminar mago: DELETE /api/wizards/delete/{id}
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Wizard> deleteWizard(@PathVariable UUID id) {
        Wizard deletedWizard = wizardService.deleteWizard(id);
        return ResponseEntity.ok(deletedWizard);
    }
}