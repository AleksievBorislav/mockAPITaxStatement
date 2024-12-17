package com.example.taxstatement.controller;

import com.example.taxstatement.model.TaxStatement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mock")
public class TaxStatementController {

    @PostMapping("/upload")
    public ResponseEntity<String> uploadTaxStatement(@RequestBody TaxStatement taxStatement) {
        try {
            return ResponseEntity.ok(taxStatement.toString());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error processing the TaxStatement: " + e.getMessage());
        }
    }
}
