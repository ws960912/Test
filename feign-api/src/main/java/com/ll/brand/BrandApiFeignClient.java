package com.ll.brand;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("fh-shop-brand")
public interface BrandApiFeignClient extends BrandApi {
}
