package enity;
// Generated May 9, 2018 11:18:31 PM by Hibernate Tools 4.3.1



/**
 * Kids generated by hbm2java
 */
public class Kids  implements java.io.Serializable {


     private String name;
     private int qte;
     private float price;
     private String color;
     private String period;
     private String pictureUrl;
     private char gender;

    public Kids() {
    }

    public Kids(String name, int qte, float price, String color, String period, String pictureUrl, char gender) {
       this.name = name;
       this.qte = qte;
       this.price = price;
       this.color = color;
       this.period = period;
       this.pictureUrl = pictureUrl;
       this.gender = gender;
    }
   
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getQte() {
        return this.qte;
    }
    
    public void setQte(int qte) {
        this.qte = qte;
    }
    public float getPrice() {
        return this.price;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    public String getColor() {
        return this.color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    public String getPeriod() {
        return this.period;
    }
    
    public void setPeriod(String period) {
        this.period = period;
    }
    public String getPictureUrl() {
        return this.pictureUrl;
    }
    
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
    public char getGender() {
        return this.gender;
    }
    
    public void setGender(char gender) {
        this.gender = gender;
    }




}


