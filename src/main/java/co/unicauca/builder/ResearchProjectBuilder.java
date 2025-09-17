package co.unicauca.builder;

/** ConcreteBuilder */
class ResearchProjectBuilder extends ProjectBuilder {
	@Override
	public void setEstudiante(String estudiante) {
		if (project.getEstudiante1() == null || project.getEstudiante1().isEmpty()) {
            project.setEstudiante1(estudiante);
        } else if (project.getEstudiante2() == null) {
            setSegundoEstudiante(estudiante);
        } else {
            throw new IllegalArgumentException("Máximo 2 estudiantes en investigación");
        }
	}

	@Override
	public void setSegundoEstudiante(String estudiante) {
		project.setEstudiante2(estudiante);
	}

	@Override
	protected void setModalidad() {
		project.setModalidad("Investigación");
	}
}
