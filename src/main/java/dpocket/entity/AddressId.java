package dpocket.entity;
// Generated 10/04/2015 10:20:21 PM by Hibernate Tools 3.2.1.GA



/**
 * AddressId generated by hbm2java
 */
public class AddressId  implements java.io.Serializable {


     private short customerId;
     private short addressOrdinal;

    public AddressId() {
    }

    public AddressId(short customerId, short addressOrdinal) {
       this.customerId = customerId;
       this.addressOrdinal = addressOrdinal;
    }
   
    public short getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(short customerId) {
        this.customerId = customerId;
    }
    public short getAddressOrdinal() {
        return this.addressOrdinal;
    }
    
    public void setAddressOrdinal(short addressOrdinal) {
        this.addressOrdinal = addressOrdinal;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AddressId) ) return false;
		 AddressId castOther = ( AddressId ) other; 
         
		 return (this.getCustomerId()==castOther.getCustomerId())
 && (this.getAddressOrdinal()==castOther.getAddressOrdinal());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCustomerId();
         result = 37 * result + this.getAddressOrdinal();
         return result;
   }   


}


