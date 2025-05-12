package com.example.financialapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class FinancialController {

    @PostMapping("/calculate")
    public ResponseEntity<Map<String, Integer>> calculate(@RequestBody Map<String, Integer> input) {
        int sueldo = input.getOrDefault("baseSalary", 0);
        int horasExtra = input.getOrDefault("extraHours", 0);
        int bono = (int) (sueldo * 0.1); // 10% de bono
        int impuesto = (int) (sueldo * 0.2); // 20% de impuestos
        int seguro = (int) (sueldo * 0.05); // 5% de seguro

        // Calcular el total neto
        int totalNeto = sueldo + horasExtra + bono - impuesto - seguro;

        Map<String, Integer> result = new HashMap<>();
        result.put("SUELDO", sueldo);
        result.put("HORAS_EXTRA", horasExtra);
        result.put("BONO", bono);
        result.put("IMPUESTO", impuesto);
        result.put("SEGURO", seguro);
        result.put("TOTAL_NETO", totalNeto); // Agregar el total neto

        return ResponseEntity.ok(result);
    }
}