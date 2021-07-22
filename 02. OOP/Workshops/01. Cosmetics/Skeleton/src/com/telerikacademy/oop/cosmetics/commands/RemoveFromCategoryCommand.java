package com.telerikacademy.oop.cosmetics.commands;

import com.telerikacademy.oop.cosmetics.commands.contracts.Command;
import com.telerikacademy.oop.cosmetics.core.contracts.CosmeticsRepository;
import com.telerikacademy.oop.cosmetics.models.Category;
import com.telerikacademy.oop.cosmetics.models.Product;
import com.telerikacademy.oop.cosmetics.utils.ValidationHelpers;

import java.util.List;

public class RemoveFromCategoryCommand implements Command {

    private static final String PRODUCT_REMOVED_CATEGORY = "Product %s removed from category %s!";

    public static final int EXPECTED_NUMBER_OF_ARGUMENTS = 2;

    private final CosmeticsRepository cosmeticsRepository;

    public RemoveFromCategoryCommand(CosmeticsRepository cosmeticsRepository) {
        this.cosmeticsRepository = cosmeticsRepository;
    }

    @Override
    public String execute(List<String> parameters) {
        ValidationHelpers.validateArgumentsCount(parameters, EXPECTED_NUMBER_OF_ARGUMENTS);
        String categoryNameToRemove = parameters.get(0);
        String productToRemove = parameters.get(1);
        return removeCategory(categoryNameToRemove, productToRemove);
    }

    private String removeCategory(String categoryNameToRemove, String productToRemove) {
        Category category = cosmeticsRepository.findCategoryByName(categoryNameToRemove);
        Product product = cosmeticsRepository.findProductByName(productToRemove);

        category.removeProduct(product);

        return String.format(PRODUCT_REMOVED_CATEGORY, productToRemove, categoryNameToRemove);
    }

}
