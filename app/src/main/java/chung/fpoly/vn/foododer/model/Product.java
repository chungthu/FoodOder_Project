package chung.fpoly.vn.foododer.model;

public class Product {
    String Name;
    int Image;
    int PriceL;
    int PriceM;

    public Product(String name, int image, int priceL, int priceM) {
        Name = name;
        Image = image;
        PriceL = priceL;
        PriceM = priceM;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getPriceL() {
        return PriceL;
    }

    public void setPriceL(int priceL) {
        PriceL = priceL;
    }

    public int getPriceM() {
        return PriceM;
    }

    public void setPriceM(int priceM) {
        PriceM = priceM;
    }
}
