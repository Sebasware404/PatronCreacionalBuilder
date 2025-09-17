package co.unicauca.builder;

/** ConcreteBuilder */
class ProfessionProjectBuilder extends ProjectBuilder {
	@Override
	public void setEstudiante(String estudiante) {
		project.setEstudiante1(estudiante);
	}

	@Override
	public void setSegundoEstudiante(String estudiante) {
		// No aplica para proyecto de profesión
	}

	@Override
	protected void setModalidad() {
		project.setModalidad("Práctica profesional");
	}
}