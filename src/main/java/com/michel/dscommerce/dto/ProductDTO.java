package com.michel.dscommerce.dto;

import com.michel.dscommerce.entities.Product;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class ProductDTO {

    private Long id;

    @NotBlank(message = "Campo requerido, precisa ter entre 3 a 80 caracteres")
    @Size(min = 3, max = 80)
    private String name;
    @NotBlank(message = "Campo requerido, precisa ter no minimo 10 caracteres")
    @Size(min = 10)
    private String description;

    @Positive(message = "O preço deve ser positivo")
    private Double price;
    private String imgUrl;

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
