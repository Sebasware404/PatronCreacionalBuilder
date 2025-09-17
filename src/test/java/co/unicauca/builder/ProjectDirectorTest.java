package co.unicauca.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectDirectorTest {
    private ProjectDirector director;
    private ResearchProjectBuilder builder;

    @BeforeEach
    void setUp() {
        director = new ProjectDirector();
        builder = new ResearchProjectBuilder();
        director.setProjectBuilder(builder);
    }

    @Test
    void testBuildProjectWithAllData() {
        String[] objetivos = { "Obj1", "Obj2" };

        director.buildProject(
                "Proyecto Test",
                "Dana",
                "Isabella",
                "01/01/2025",
                "Director X",
                "Codirector Y",
                "Codirector Z",
                "Objetivo General",
                objetivos);

        Project project = director.getProject();

        assertEquals("Proyecto Test", project.getTituloProyecto());
        assertEquals("Investigación", project.getModalidad());
        assertEquals("Dana", project.getEstudiante1());
        assertEquals("Isabella", project.getEstudiante2());
        assertEquals("01/01/2025", project.getFechaCreacion());
        assertEquals("Director X", project.getDirector());
        assertEquals("Codirector Y", project.getCoDirector1());
        assertEquals("Codirector Z", project.getCoDirector2());
        assertEquals("Objetivo General", project.getObjGeneral());
        assertArrayEquals(objetivos, project.getObjEspecificos());
    }

    @Test
    void testBuildProjectWithoutOptionalFields() {
        String[] objetivos = { "Obj1" };

        director.buildProject(
                "Proyecto Simple",
                "Carlos",
                null, // sin segundo estudiante
                "02/02/2025",
                "Director Y",
                null, // sin codirector1
                null, // sin codirector2
                "Objetivo General",
                objetivos);

        Project project = director.getProject();

        assertEquals("Proyecto Simple", project.getTituloProyecto());
        assertEquals("Carlos", project.getEstudiante1());
        assertNull(project.getCoDirector1());
        assertNull(project.getCoDirector2());
    }
}
