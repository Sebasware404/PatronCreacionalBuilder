package co.unicauca.builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProfessionProjectBuilderTest {

    @Test
    void testSetEstudianteYModalidad() {
        ProfessionProjectBuilder builder = new ProfessionProjectBuilder();
        builder.crearNuevoProyecto();

        builder.setModalidad();
        builder.setEstudiante("Andrea");

        Project project = builder.getProject();

        assertEquals("Práctica profesional", project.getModalidad());
        assertEquals("Andrea", project.getEstudiante1());
    }

    @Test
    void testIgnoraSegundoEstudiante() {
        ProfessionProjectBuilder builder = new ProfessionProjectBuilder();
        builder.crearNuevoProyecto();

        builder.setEstudiante("Camilo");
        builder.setSegundoEstudiante("Laura"); // este método no hace nada

        Project project = builder.getProject();

        assertEquals("Camilo", project.getEstudiante1());
        assertNull(project.getEstudiante2()); // debe seguir siendo null
    }
}
