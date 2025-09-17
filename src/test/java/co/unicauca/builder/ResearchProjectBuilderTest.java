package co.unicauca.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResearchProjectBuilderTest {

    private ResearchProjectBuilder builder;

    @BeforeEach
    void setUp() {
        builder = new ResearchProjectBuilder();
        builder.crearNuevoProyecto();
        builder.setModalidad();
    }

    @Test
    void testSetEstudianteUnico() {
        builder.setEstudiante("Sebastián Caicedo");
        Project project = builder.getProject();

        assertEquals("Sebastián Caicedo", project.getEstudiante1());
        assertNull(project.getEstudiante2());
        assertEquals("Investigación", project.getModalidad());
    }

    @Test
    void testSetDosEstudiantes() {
        builder.setEstudiante("Sebastián Caicedo");
        builder.setEstudiante("Ana Pérez");
        Project project = builder.getProject();

        assertEquals("Sebastián Caicedo", project.getEstudiante1());
        assertEquals("Ana Pérez", project.getEstudiante2());
    }

    @Test
    void testExcesoDeEstudiantesLanzaExcepcion() {
        builder.setEstudiante("Sebastián Caicedo");
        builder.setEstudiante("Ana Pérez");

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            builder.setEstudiante("Carlos López");
        });

        assertEquals("Máximo 2 estudiantes en investigación", exception.getMessage());
    }

    @Test
    void testModalidadInvestigacion() {
        Project project = builder.getProject();
        assertEquals("Investigación", project.getModalidad());
    }
}
