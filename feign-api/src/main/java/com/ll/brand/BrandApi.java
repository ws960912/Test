package com.ll.brand;

import com.ll.brand.model.Brand;
import com.ll.common.ServerResponse;
import org.springframework.web.bind.annotation.*;

public interface BrandApi {


    @GetMapping("/brand")
    public ServerResponse brandList();

    @PostMapping("/brand")
    public ServerResponse addbrand(Brand brand);

    @DeleteMapping("/brand")
    public ServerResponse delbrand(@RequestParam Integer id);

    @PutMapping("/brand")
    public ServerResponse updatebrand(@RequestBody Brand brand);

}
