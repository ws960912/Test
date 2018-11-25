package com.ll.brand.model;

import java.io.Serializable;

public class Brand implements Serializable {

    private static final long serialVersionUID = -2839091507446315587L;

    private Integer id;
    private String brandName;
    private String brandLogo;
    private String describe1;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public String getDescribe1() {
        return describe1;
    }

    public void setDescribe1(String describe1) {
        this.describe1 = describe1;
    }
}
