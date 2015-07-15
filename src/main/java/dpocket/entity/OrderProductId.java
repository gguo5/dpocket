package dpocket.entity;
// Generated 15/07/2015 2:16:48 PM by Hibernate Tools 4.3.1



/**
 * OrderProductId generated by hbm2java
 */
public class OrderProductId  implements java.io.Serializable {


     private int orderId;
     private short productId;

    public OrderProductId() {
    }

    public OrderProductId(int orderId, short productId) {
       this.orderId = orderId;
       this.productId = productId;
    }
   
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public short getProductId() {
        return this.productId;
    }
    
    public void setProductId(short productId) {
        this.productId = productId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrderProductId) ) return false;
		 OrderProductId castOther = ( OrderProductId ) other; 
         
		 return (this.getOrderId()==castOther.getOrderId())
 && (this.getProductId()==castOther.getProductId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getOrderId();
         result = 37 * result + this.getProductId();
         return result;
   }   


}


