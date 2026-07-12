package org.miprimermodelo_simoneaa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Year;

import org.junit.jupiter.api.Test;

public class MiPrimerModeloTest {

    @Test
    public void testCrearPersona() {
        MiPrimerModelo persona = new MiPrimerModelo("Juan", "Pérez", "1234", 2000);

        assertEquals("Juan", persona.getNombre());
        assertEquals("Pérez", persona.getApellido());
        assertEquals("1234", persona.getDocumentoIdentidad());
        assertEquals(2000, persona.getAñoNacimiento());

        int edadEsperada = Year.now().getValue() - 2000;
        assertEquals(edadEsperada, persona.getEdad());
    }

}
