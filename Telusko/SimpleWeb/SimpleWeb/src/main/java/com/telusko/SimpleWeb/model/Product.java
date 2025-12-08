package com.telusko.SimpleWeb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Product {
    @Id private int prodId;
    @Column private String prodName;
    @Column private float price;

    public int getProdId()      {        return prodId;     }
    public String getProdName() {        return prodName;   }
    public float getPrice()     {        return price;      }

    public void setProdId(int prodId)           {        this.prodId = prodId;      }
    public void setProdName(String prodName)    {        this.prodName = prodName;  }
    public void setPrice(float price)           {        this.price = price;        }

    public Product() {}

    public Product(int prodId, String prodName, float price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", prodName='" + prodName + '\'' +
                ", price=" + price +
                '}';
    }
}
