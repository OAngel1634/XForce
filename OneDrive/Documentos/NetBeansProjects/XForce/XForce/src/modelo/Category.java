package modelo;
public class Category {
    private int iCategorys;
    private String Descripcion;
    private int estado;
    
    public Category(){
      this.iCategorys = 0;
      this.Descripcion = "";
      this.estado = 0;
    
    }

    public Category(int iCategorys, String Descripcion, int estado) {
        this.iCategorys = iCategorys;
        this.Descripcion = Descripcion;
        this.estado = estado;
    }

    public int getiCategorys() {
        return iCategorys;
    }

    public void setiCategorys(int iCategorys) {
        this.iCategorys = iCategorys;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }   
    
}
