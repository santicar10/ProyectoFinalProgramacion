package com.example.proyectofinalprogramacion.service.impl;

import com.example.proyectofinalprogramacion.DTOs.Dtos;
import com.example.proyectofinalprogramacion.model.Product;
import com.example.proyectofinalprogramacion.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    List<Dtos> ProductsTable= new ArrayList<>();
    @Override
    public boolean listaMostrar(String name, int amount, int price) {
        ProductsTable.add(new Dtos(name,amount,price));
        return true;
    }

    public List<Dtos> getClientsTable() {
        return ProductsTable;
    }

    //no funciona :D

    static List<Product> buscar(List<Product> recorrerBuscar) {
        recorrerBuscar.stream().filter(elemento -> elemento.getName().equals("computador"))
                .map(clients ->clients.getName()).forEach(System.out::println);
        return recorrerBuscar;
    }
}
