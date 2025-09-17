package co.unicauca.builder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectBuilderTest {
    private ResearchProjectBuilder builder;

    @BeforeEach
    void setUp() {
        builder = new ResearchProjectBuilder();
        builder.crearNuevoProyecto();
    }

    @Test
    void testSetCommonAttributes() {
        builder.setTitulo("Proyecto X");
        builder.setFechaCreacion("10/10/2025");
        builder.setDirector("Director A");
        builder.setCodirector1("Codirector B");
        builder.setCodirector2("Codirector C");
        builder.setObjetivoGeneral("Objetivo General");

        Project project = builder.getProject();

        assertEquals("Proyecto X", project.getTituloProyecto());
        assertEquals("10/10/2025", project.getFechaCreacion());
        assertEquals("Director A", project.getDirector());
        assertEquals("Codirector B", project.getCoDirector1());
        assertEquals("Codirector C", project.getCoDirector2());
        assertEquals("Objetivo General", project.getObjGeneral());
    }

    @Test
    void testAddObjetivosEspecificos() {
        String[] objetivos = { "Obj1", "Obj2" };
        builder.addObjetivoEspecifico(objetivos);

        Project project = builder.getProject();
        assertArrayEquals(objetivos, project.getObjEspecificos());
    }

    @Test
    void testMaxFourObjetivosEspecificos() {
        String[] cuatro = { "O1", "O2", "O3", "O4" };
        builder.addObjetivoEspecifico(cuatro);

        Project project = builder.getProject();
        assertArrayEquals(cuatro, project.getObjEspecificos());

        // Intentar añadir más de 4
        String[] cinco = { "O1", "O2", "O3", "O4", "O5" };
        assertThrows(IllegalArgumentException.class, () -> {
            builder.addObjetivoEspecifico(cinco);
        });
    }
}
