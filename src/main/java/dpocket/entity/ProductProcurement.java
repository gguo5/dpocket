package dpocket.entity;
// Generated 14/04/2015 11:11:08 PM by Hibernate Tools 3.2.1.GA


import java.math.BigDecimal;
import java.util.Date;

/**
 * ProductProcurement generated by hbm2java
 */
public class ProductProcurement  implements java.io.Serializable {


     private Short id;
     private Product product;
     private Procurement procurement;
     private short quantity;
     private BigDecimal unitPrice;
     private Date lastUpdate;

    public ProductProcurement() {
    }

    public ProductProcurement(Product product, Procurement procurement, short quantity, BigDecimal unitPrice, Date lastUpdate) {
       this.product = product;
       this.procurement = procurement;
       this.quantity = quantity;
       this.unitPrice = unitPrice;
       this.lastUpdate = lastUpdate;
    }
   
    public Short getId() {
        return this.id;
    }
    
    public void setId(Short id) {
        this.id = id;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Procurement getProcurement() {
        return this.procurement;
    }
    
    public void setProcurement(Procurement procurement) {
        this.procurement = procurement;
    }
    public short getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }
    public BigDecimal getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }




}


