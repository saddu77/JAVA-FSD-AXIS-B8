package com.example.productservice.service;

import com.example.productservice.VO.ResponseTemplateVO;
import com.example.productservice.VO.UserOne;
import com.example.productservice.entity.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Product saveProduct(Product product) {
        return  productRepository.save(product);
    }

    public ResponseTemplateVO getProductWithUserOne(Long productId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Product product = productRepository.findByProductId(productId);
        UserOne user = restTemplate
                .getForObject("http://USER-SERVICE/users/"+product.getUserId(),UserOne.class);
        vo.setProduct(product);
        vo.setUserOne(user);
        return  vo;
    }
}
