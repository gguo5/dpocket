package dpocket.entity;
// Generated 15/07/2015 2:16:48 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * OrderPayment generated by hbm2java
 */
public class OrderPayment  implements java.io.Serializable {


     private OrderPaymentId id;
     private Order order;
     private BigDecimal amount;
     private Date paymentDate;
     private short paymentMethodRefno;
     private char archvFlag;
     private Date lastUpdate;

    public OrderPayment() {
    }

	
    public OrderPayment(OrderPaymentId id, Order order, BigDecimal amount, Date paymentDate, short paymentMethodRefno, char archvFlag) {
        this.id = id;
        this.order = order;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethodRefno = paymentMethodRefno;
        this.archvFlag = archvFlag;
    }
    public OrderPayment(OrderPaymentId id, Order order, BigDecimal amount, Date paymentDate, short paymentMethodRefno, char archvFlag, Date lastUpdate) {
       this.id = id;
       this.order = order;
       this.amount = amount;
       this.paymentDate = paymentDate;
       this.paymentMethodRefno = paymentMethodRefno;
       this.archvFlag = archvFlag;
       this.lastUpdate = lastUpdate;
    }
   
    public OrderPaymentId getId() {
        return this.id;
    }
    
    public void setId(OrderPaymentId id) {
        this.id = id;
    }
    public Order getOrder() {
        return this.order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    public BigDecimal getAmount() {
        return this.amount;
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public Date getPaymentDate() {
        return this.paymentDate;
    }
    
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
    public short getPaymentMethodRefno() {
        return this.paymentMethodRefno;
    }
    
    public void setPaymentMethodRefno(short paymentMethodRefno) {
        this.paymentMethodRefno = paymentMethodRefno;
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




}


