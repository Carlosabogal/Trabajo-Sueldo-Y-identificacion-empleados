
public class ImagenTrabajador {
    private int imagen_id;
    private String nombre;
    private String apellido;
    private String sexo;
    private String Fecha_De_Nacimiento;

    public String getFecha_De_Nacimiento() {
        return Fecha_De_Nacimiento;
    }

    public void setFecha_De_Nacimiento(String Fecha_De_Nacimiento) {
        this.Fecha_De_Nacimiento = Fecha_De_Nacimiento;
    }
    private String Fecha_De_Ingreso;

    public String getFecha_De_Ingreso() {
        return Fecha_De_Ingreso;
    }

    public void setFecha_De_Ingreso(String Fecha_De_Ingreso) {
        this.Fecha_De_Ingreso = Fecha_De_Ingreso;
    }


    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    private int salario;
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    private byte [] imagen;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getImagen_id() {
        return imagen_id;
    }

    public void setImagen_id(int imagen_id) {
        this.imagen_id = imagen_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }
       
}
