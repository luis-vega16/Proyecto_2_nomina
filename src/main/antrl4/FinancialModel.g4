grammar FinancialModel;

// Reglas principales
calculation: 'SUELDO' '=' baseSalary
           | 'HORAS_EXTRA' '=' extraHours
           | 'BONO' '=' bonus
           | 'IMPUESTO' '=' tax
           | 'SEGURO' '=' insurance
           ;

baseSalary: INT;        // Salario base
extraHours: INT;        // Horas extra trabajadas
bonus: INT;             // Bonos calculados
tax: INT;               // Deducciones fiscales
insurance: INT;         // Costos de seguro

// Tokens
INT: [0-9]+;            // Números enteros
WS: [ \t\r\n]+ -> skip; // Ignorar espacios en blanco