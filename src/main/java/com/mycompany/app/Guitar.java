package com.mycompany.app;

public class Guitar {

    private String brand;
    private String model;
    private Integer releaseYear;
    private Integer price;

    public Guitar(String brand, String model, Integer releaseYear,Integer price) {
        this.brand = brand;
        this.model = model;
        this.releaseYear = releaseYear;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        StringBuilder guitarStr = new StringBuilder();
        guitarStr.append("Guitar {");
        guitarStr.append("brand = '");
        guitarStr.append(brand);
        guitarStr.append("model = '");
        guitarStr.append(model);
        guitarStr.append("', ");
        guitarStr.append("releaseYear = '");
        guitarStr.append(releaseYear);
        guitarStr.append("', ");
        guitarStr.append("price = '");
        guitarStr.append(price.toString());
        guitarStr.append("'}");

        return guitarStr.toString();
    }
}
