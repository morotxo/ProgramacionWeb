package Pojos;
// Generated Jun 24, 2015 8:03:15 AM by Hibernate Tools 4.3.1



/**
 * Factura generated by hbm2java
 */
public class Factura  implements java.io.Serializable {


     private Integer idFactura;
     private Pedido pedido;
     private double precioTotal;

    public Factura() {
    }

    public Factura(Pedido pedido, double precioTotal) {
       this.pedido = pedido;
       this.precioTotal = precioTotal;
    }
   
    public Integer getIdFactura() {
        return this.idFactura;
    }
    
    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public double getPrecioTotal() {
        return this.precioTotal;
    }
    
    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }




}


