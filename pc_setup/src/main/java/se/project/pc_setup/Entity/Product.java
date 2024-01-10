package se.project.pc_setup.Entity;

public class Product {
    private String  ProductCode;
    private String  ProductName;
    private String  OriginCountry;
    private String  Price;
    private String  Cost;
    private String  Image;
    private String  Description;
    private String  Role;
    public Product(String productCode, String productName, String originCountry, String price, String cost,
            String image, String description, String role) {
        ProductCode = productCode;
        ProductName = productName;
        OriginCountry = originCountry;
        Price = price;
        Cost = cost;
        Image = image;
        Description = description;
        Role = role;
    }
    public String getProductCode() {
        return ProductCode;
    }
    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }
    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        ProductName = productName;
    }
    public String getOriginCountry() {
        return OriginCountry;
    }
    public void setOriginCountry(String originCountry) {
        OriginCountry = originCountry;
    }
    public String getPrice() {
        return Price;
    }
    public void setPrice(String price) {
        Price = price;
    }
    public String getCost() {
        return Cost;
    }
    public void setCost(String cost) {
        Cost = cost;
    }
    public String getImage() {
        return Image;
    }
    public void setImage(String image) {
        Image = image;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public String getRole() {
        return Role;
    }
    public void setRole(String role) {
        Role = role;
    }

    
}


