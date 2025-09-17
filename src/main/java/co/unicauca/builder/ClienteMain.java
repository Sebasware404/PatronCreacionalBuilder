package co.unicauca.builder;

public class ClienteMain {
    public static void main(String[] args) {
        // El director
        ProjectDirector director = new ProjectDirector();

        // ============= Modalidad de investigación (quemado) =============
        ProjectBuilder research_projectbuilder = new ResearchProjectBuilder();
        director.setProjectBuilder(research_projectbuilder);

        String[] objetivosInv = { "Investigar algoritmos de IA", "Publicar resultados en conferencia" };

        director.buildProject(
                "Sistema inteligente de recomendación académica",
                "Sebastián Caicedo",
                "Ana Pérez", // se permiten hasta 2 estudiantes
                "10/09/2025",
                "Dr. Gómez",
                "Dra. Ramírez", // codirector opcional
                null,
                "Desarrollar un sistema basado en IA para apoyar decisiones académicas",
                objetivosInv);

        Project projectInv = director.getProject();
        System.out.println("\nProyecto de investigación:");
        System.out.println(projectInv);

        // ============= Modalidad de práctica profesional (quemado) =============
        ProjectBuilder profession_projectbuilder = new ProfessionProjectBuilder();
        director.setProjectBuilder(profession_projectbuilder);

        String[] objetivosProf = { "Aplicar conocimientos en un entorno real", "Optimizar procesos de la empresa" };

        director.buildProject(
                "Sistema de gestión de inventario en prácticas",
                "Laura Gómez", // solo un estudiante permitido
                null,
                "12/09/2025",
                "Dr. Martínez",
                null,
                null,
                "Aplicar conocimientos de Ingeniería en un entorno empresarial",
                objetivosProf);

        Project projectProf = director.getProject();
        System.out.println("\nProyecto de práctica profesional:");
        System.out.println(projectProf);

        // ============= Modalidad de plan coterminal (quemado) =============
        ProjectBuilder coterminal_projectbuilder = new CoterminalPlanProjectBuilder();
        director.setProjectBuilder(coterminal_projectbuilder);

        String[] objetivosCoterminal = { "Profundizar en área de software", "Avanzar en créditos de maestría" };

        director.buildProject(
                "Desarrollo de un módulo de analítica en plan coterminal",
                "Andrés López",
                null, // solo un estudiante
                "15/09/2025",
                "Dra. Fernández",
                "Dr. Ramírez", // un codirector opcional
                null,
                "Consolidar conocimientos de pregrado y posgrado en un solo proyecto",
                objetivosCoterminal);

        Project projectCoterminal = director.getProject();
        System.out.println("\nProyecto de plan coterminal:");
        System.out.println(projectCoterminal);
    }
}
