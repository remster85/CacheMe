package com.desreumaux.remi;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
    @GetMapping("/data")
    @Cacheable(value="data", key = "#param")
    public byte[] getData(@RequestParam int param) {
        return new HeavyObject().getData();
    }
}
