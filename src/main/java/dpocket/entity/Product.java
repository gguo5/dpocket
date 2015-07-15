package dpocket.entity;
// Generated 15/07/2015 2:16:48 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private Short productId;
     private Category category;
     private String productName;
     private String description;
     private String size;
     private BigDecimal price;
     private BigDecimal weight;
     private BigDecimal shippmentCost;
     private String notes;
     private char archvFlag;
     private Date lastUpdate;
     private Set orderProducts = new HashSet(0);
     private Set productProcurements = new HashSet(0);

    public Product() {
    }

	
    public Product(Category category, String productName, char archvFlag, Date lastUpdate) {
        this.category = category;
        this.productName = productName;
        this.archvFlag = archvFlag;
        this.lastUpdate = lastUpdate;
    }
    public Product(Category category, String productName, String description, String size, BigDecimal price, BigDecimal weight, BigDecimal shippmentCost, String notes, char archvFlag, Date lastUpdate, Set orderProducts, Set productProcurements) {
       this.category = category;
       this.productName = productName;
       this.description = description;
       this.size = size;
       this.price = price;
       this.weight = weight;
       this.shippmentCost = shippmentCost;
       this.notes = notes;
       this.archvFlag = archvFlag;
       this.lastUpdate = lastUpdate;
       this.orderProducts = orderProducts;
       this.productProcurements = productProcurements;
    }
   
    public Short getProductId() {
        return this.productId;
    }
    
    public void setProductId(Short productId) {
        this.productId = productId;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getProductName() {
        return this.productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSize() {
        return this.size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getWeight() {
        return this.weight;
    }
    
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
    public BigDecimal getShippmentCost() {
        return this.shippmentCost;
    }
    
    public void setShippmentCost(BigDecimal shippmentCost) {
        this.shippmentCost = shippmentCost;
    }
    public String getNotes() {
        return this.notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public char getArchvFlag() {
        return this.archvFlag;
    }
    
    public void setArchvFlag(char archvFlag) {
        this.archvFlag = archvFlag;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set getOrderProducts() {
        return this.orderProducts;
    }
    
    public void setOrderProducts(Set orderProducts) {
        this.orderProducts = orderProducts;
    }
    public Set getProductProcurements() {
        return this.productProcurements;
    }
    
    public void setProductProcurements(Set productProcurements) {
        this.productProcurements = productProcurements;
    }




}


