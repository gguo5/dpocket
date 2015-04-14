package dpocket.entity;
// Generated 10/04/2015 10:20:21 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * ShippmentOrder generated by hbm2java
 */
public class ShippmentOrder  implements java.io.Serializable {


     private short shippmentId;
     private Shippment shippment;
     private Order order;
     private Date lastUpdate;

    public ShippmentOrder() {
    }

	
    public ShippmentOrder(short shippmentId, Shippment shippment, Order order) {
        this.shippmentId = shippmentId;
        this.shippment = shippment;
        this.order = order;
    }
    public ShippmentOrder(short shippmentId, Shippment shippment, Order order, Date lastUpdate) {
       this.shippmentId = shippmentId;
       this.shippment = shippment;
       this.order = order;
       this.lastUpdate = lastUpdate;
    }
   
    public short getShippmentId() {
        return this.shippmentId;
    }
    
    public void setShippmentId(short shippmentId) {
        this.shippmentId = shippmentId;
    }
    public Shippment getShippment() {
        return this.shippment;
    }
    
    public void setShippment(Shippment shippment) {
        this.shippment = shippment;
    }
    public Order getOrder() {
        return this.order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }




}

