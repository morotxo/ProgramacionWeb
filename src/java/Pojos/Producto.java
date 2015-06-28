package Pojos;
// Generated Jun 24, 2015 8:03:15 AM by Hibernate Tools 4.3.1



/**
 * Producto generated by hbm2java
 */
public class Producto  implements java.io.Serializable {


     private Integer idProducto;
     private Categoria categoria;
     private String descripcion;
     private Double precio;
     private String marca;
     private Integer stock;

    public Producto() {
    }

	
    public Producto(Categoria categoria) {
        this.categoria = categoria;
    }
    public Producto(Categoria categoria, String descripcion, Double precio, String marca, Integer stock) {
       this.categoria = categoria;
       this.descripcion = descripcion;
       this.precio = precio;
       this.marca = marca;
       this.stock = stock;
    }
   
    public Integer getIdProducto() {
        return this.idProducto;
    }
    
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Integer getStock() {
        return this.stock;
    }
    
    public void setStock(Integer stock) {
        this.stock = stock;
    }




}


