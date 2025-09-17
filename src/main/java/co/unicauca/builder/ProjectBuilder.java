package co.unicauca.builder;

/** Abstract Builder */
abstract class ProjectBuilder {
    protected Project project;

    public Project getProject() {
        return project;
    }

    public void crearNuevoProyecto() {
        project = new Project();
    }

    // Métodos comunes
    public void setTitulo(String titulo) {
        project.setTituloProyecto(titulo);
    }

    public void setFechaCreacion(String fecha) {
        project.setFechaCreacion(fecha);
    }

    public void setDirector(String director) {
        project.setDirector(director);
    }

    public void setCodirector1(String codirector) {
        project.setCoDirector1(codirector);
    }

    public void setCodirector2(String codirector) {
        project.setCoDirector2(codirector);
    }

    public void setObjetivoGeneral(String objetivo) {
        project.setObjGeneral(objetivo);
    }

    public void addObjetivoEspecifico(String[] objetivos) {
        if (project.getObjEspecificos().length < 4) {
            project.setObjEspecificos(objetivos);
        } else {
            throw new IllegalArgumentException("Un proyecto no puede tener más de 4 objetivos específicos.");
        }
    }

    // Métodos abstractos
    public abstract void setEstudiante(String estudiante);
    public abstract void setSegundoEstudiante(String estudiante);
    protected abstract void setModalidad(); 
}
