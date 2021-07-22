package com.telerikacademy.oop.cosmetics.commands;

import com.telerikacademy.oop.cosmetics.commands.contracts.Command;
import com.telerikacademy.oop.cosmetics.core.contracts.CosmeticsRepository;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.utils.ValidationHelpers;

import java.util.List;

public class RemoveFromShoppingCartCommand implements Command {

    private static final String PRODUCT_REMOVED_FROM_SHOPPING_CART = "Product %s was removed from the shopping cart!";

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 1;

    private final CosmeticsRepository cosmeticsRepository;

    public RemoveFromShoppingCartCommand(CosmeticsRepository cosmeticsRepository) {
        this.cosmeticsRepository = cosmeticsRepository;
    }

    @Override
    public String execute(List<String> parameters) {
        ValidationHelpers.validateArgumentsCount(parameters, EXPECTED_NUMBER_OF_ARGUMENTS);
        String productToRemoveFromCart = parameters.get(0);
        return removeFromShoppingCart(productToRemoveFromCart);
    }

    private String removeFromShoppingCart(String productName) {
        Product product = cosmeticsRepository.findProductByName(productName);

        cosmeticsRepository.getShoppingCart().removeProduct(product);

        return String.format(PRODUCT_REMOVED_FROM_SHOPPING_CART, productName);
    }

}