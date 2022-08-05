package com.tkpark.bike.products;

import com.tkpark.bike.errors.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.tkpark.bike.utils.ApiUtils.ApiResult;
import static com.tkpark.bike.utils.ApiUtils.success;
import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("api/products")
public class ProductRestController {

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "{id}")
    public ApiResult<ProductDto> findById(@PathVariable Long id) {
        return success(
                productService.findById(id)
                        .map(ProductDto::new)
                        .orElseThrow(() -> new NotFoundException("Could not found product for " + id))
        );
    }

    @GetMapping
    public ApiResult<List<ProductDto>> findAll() {
        return success(productService.findAll().stream()
                .map(ProductDto::new)
                .collect(toList())
        );
    }

}
