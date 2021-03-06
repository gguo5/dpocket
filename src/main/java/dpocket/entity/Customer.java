package dpocket.entity;
// Generated 15/07/2015 2:16:48 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private Short customerId;
     private String customerName;
     private String email;
     private boolean active;
     private Date createDate;
     private Date lastUpdate;
     private Set addresses = new HashSet(0);
     private Set cards = new HashSet(0);
     private Set orders = new HashSet(0);

    public Customer() {
    }

	
    public Customer(String customerName, boolean active, Date createDate, Date lastUpdate) {
        this.customerName = customerName;
        this.active = active;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
    }
    public Customer(String customerName, String email, boolean active, Date createDate, Date lastUpdate, Set addresses, Set cards, Set orders) {
       this.customerName = customerName;
       this.email = email;
       this.active = active;
       this.createDate = createDate;
       this.lastUpdate = lastUpdate;
       this.addresses = addresses;
       this.cards = cards;
       this.orders = orders;
    }
   
    public Short getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    public Date getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
    public Set getAddresses() {
        return this.addresses;
    }
    
    public void setAddresses(Set addresses) {
        this.addresses = addresses;
    }
    public Set getCards() {
        return this.cards;
    }
    
    public void setCards(Set cards) {
        this.cards = cards;
    }
    public Set getOrders() {
        return this.orders;
    }
    
    public void setOrders(Set orders) {
        this.orders = orders;
    }




}


