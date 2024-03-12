package com.example.server.controller;

import com.example.server.entity.ItemDto;
import com.example.server.service.ShopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping("/api")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService){
        this.shopService = shopService;
    }

    @GetMapping("/items")
    public List<ItemDto> getItems(){
        return shopService.getAllItems();
    }
    @PostMapping("/item")
    public void addItem(@RequestBody ItemDto item){
        shopService.addItem(item);
    }
    @GetMapping("/item/{id}")
    public ItemDto getItem(@PathVariable long id) {
        return shopService.getItem(id);
    }
    @DeleteMapping("/item/{id}")
    public void deleteItem(@PathVariable long id){
        shopService.deleteItem(id);
    }
}
