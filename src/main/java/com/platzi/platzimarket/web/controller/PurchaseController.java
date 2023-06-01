package com.platzi.platzimarket.web.controller;

import com.platzi.platzimarket.domain.Purchase;
import com.platzi.platzimarket.domain.service.PurchaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/purchases")
public class PurchaseController {
    private PurchaseService purchaseService;

    @GetMapping("/all")
    public ResponseEntity<List<Purchase>> getAll() {
        try{
            return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
        }catch (RuntimeException ex) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @GetMapping("client/{id}")
    public ResponseEntity<List<Purchase>> getByClient(@PathVariable("id") String clientId) {
        try {
            Optional<List<Purchase>> optionalList = purchaseService.getByClient(clientId);
            if (optionalList.isPresent() && !optionalList.isEmpty()) {
                return new ResponseEntity<>(optionalList.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Purchase> savePurchase(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.save(purchase),HttpStatus.CREATED);
    }


}
