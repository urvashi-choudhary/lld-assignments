package com.example.ecom.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecom.exceptions.ProductNotFoundException;
import com.example.ecom.models.Product;
import com.example.ecom.models.ProductGroup;
import com.example.ecom.repositories.ProductGroupsRepository;
import com.example.ecom.repositories.ProductRepository;


@Service
public class RecommendationsServiceImpl implements RecommendationsService{
	
	@Autowired
    private ProductRepository productRepository;
	@Autowired
	private ProductGroupsRepository productGroupsRepository;

    
    @Override
    public List<Product> getRecommendations(int productId) throws ProductNotFoundException {
        Optional<Product> productOptional = productRepository.findById(productId);

        if (productOptional.isEmpty()) {
            throw new ProductNotFoundException("Product not found");
        }
        Product product = productOptional.get();

        List<ProductGroup> productGroupList = productGroupsRepository.findByProductsContaining(product);

        return productGroupList.stream()
                .flatMap(productGroup -> productGroup.getProducts().stream())
                .distinct()
                .filter(product1 -> product1.getId() != productId)
                .collect(Collectors.toList());
    }
}
