package co.unicauca.builder;

/** Producto */
class Project {
    private String tituloProyecto = "";
    private String modalidad = "";
    private String estudiante1 = "";
    private String estudiante2 = "";
    private String fechaCreacion = "";
    private String director = "";
    private String coDirector1 = "";
    private String coDirector2 = "";
    private String objGeneral = "";
    private String[] objEspecificos = {};

    // Getters
    public String getTituloProyecto() {
        return tituloProyecto;
    }

    public String getModalidad() {
        return modalidad;
    }

    public String getEstudiante1() {
        return estudiante1;
    }

    public String getEstudiante2() {
        return estudiante2;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public String getDirector() {
        return director;
    }

    public String getCoDirector1() {
        return coDirector1;
    }

    public String getCoDirector2() {
        return coDirector2;
    }

    public String getObjGeneral() {
        return objGeneral;
    }

    public String[] getObjEspecificos() {
        return objEspecificos;
    }

    // Setters
    public void setTituloProyecto(String tituloProyecto) {
        this.tituloProyecto = tituloProyecto;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setEstudiante1(String estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public void setEstudiante2(String estudiante2) {
        this.estudiante2 = estudiante2;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setCoDirector1(String coDirector1) {
        this.coDirector1 = coDirector1;
    }

    public void setCoDirector2(String coDirector2) {
        this.coDirector2 = coDirector2;
    }

    public void setObjGeneral(String objGeneral) {
        this.objGeneral = objGeneral;
    }

    public void setObjEspecificos(String[] objEspecificos) {
        this.objEspecificos = objEspecificos;
    }

    @Override
    public String toString() {
        return  " tituloProyecto= '" + tituloProyecto + "'\n" +
                "modalidad= '" + modalidad + "'\n" +
                "estudiante1= '" + estudiante1 + "'\n" +
                "estudiante2= '" + estudiante2 + "'\n" +
                "fechaCreacion= '" + fechaCreacion + "'\n" +
                "director= '" + director + "'\n" +
                "coDirector1= '" + coDirector1 + "'\n" +
                "coDirector2= '" + coDirector2 + "'\n" +
                "objGeneral= '" + objGeneral + "'\n" +
                "objEspecificos=" + java.util.Arrays.toString(objEspecificos) +
                '}';
    }
}