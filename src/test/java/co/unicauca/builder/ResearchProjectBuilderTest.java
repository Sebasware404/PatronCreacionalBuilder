package co.unicauca.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResearchProjectBuilderTest {
    private ResearchProjectBuilder builder;

    @BeforeEach
    void setUp() {
        builder = new ResearchProjectBuilder();
        builder.crearNuevoProyecto();
    }

    @Test
    void testSetEstudiantes() {
        builder.setEstudiante("Dana");
        builder.setSegundoEstudiante("Isabella");

        Project project = builder.getProject();

        assertEquals("Dana", project.getEstudiante1());
        assertEquals("Isabella", project.getEstudiante2());
    }

    @Test
    void testMaxTwoStudents() {
        builder.setEstudiante("Dana");
        builder.setSegundoEstudiante("Isabella");

        assertThrows(IllegalArgumentException.class, () -> {
            builder.setEstudiante("Tercer Estudiante");
        });
    }

    @Test
    void testModalidadIsInvestigacion() {
        builder.setModalidad();
        Project project = builder.getProject();
        assertEquals("Investigación", project.getModalidad());
    }
}
