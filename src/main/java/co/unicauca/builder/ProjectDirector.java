package co.unicauca.builder;
/**
 * Director El Director controla la creación paso a paso, solo cuando el Builder
 * ha terminado de construir el objeto lo recupera el Director
 */
class ProjectDirector {
	private ProjectBuilder projectBuilder;

	public void setProjectBuilder(ProjectBuilder pb) {
		projectBuilder = pb;
	}

	public Project getProject() {
		return projectBuilder.getProject();
	}

	
    public void buildProject(String titulo, String estudiante1, String estudiante2, String fecha, 
                             String director, String codirector1, String codirector2, 
                             String objGeneral, String[] objEspecificos) {

        projectBuilder.crearNuevoProyecto();
        projectBuilder.setModalidad();
        projectBuilder.setTitulo(titulo);
        projectBuilder.setEstudiante(estudiante1);

        if (estudiante2 != null && !estudiante2.isEmpty()) {
            projectBuilder.setSegundoEstudiante(estudiante2);
        }

        projectBuilder.setFechaCreacion(fecha);
        projectBuilder.setDirector(director);

        if (codirector1 != null && !codirector1.isEmpty()) {
            projectBuilder.setCodirector1(codirector1);
        }
        if (codirector2 != null && !codirector2.isEmpty()) {
            projectBuilder.setCodirector2(codirector2);
        }

        projectBuilder.setObjetivoGeneral(objGeneral);

        
        if (objEspecificos.length != 0) {
            projectBuilder.addObjetivoEspecifico(objEspecificos);
        }
        
    }
}