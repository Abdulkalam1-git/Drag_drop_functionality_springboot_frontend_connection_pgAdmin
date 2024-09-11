package com.telusko.pgadmin_dragdrop_function.Controller;


import com.telusko.pgadmin_dragdrop_function.Model.Mobile;
import com.telusko.pgadmin_dragdrop_function.Service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
@CrossOrigin(origins = "*")
public class MobileController {
    @Autowired
    private MobileService mobileService;

    @PostMapping("/add")
    public ResponseEntity<Mobile> addModel(@RequestBody Mobile mobile) {
        Mobile savedModel = mobileService.addItem(mobile);
        return ResponseEntity.ok(savedModel);
    }
      @GetMapping("/get")
    public List<Mobile> getProducts() {
          return  mobileService.getAllProductsOrderedByPriority();
      }
    @PutMapping("/{id}/priority/{priority}")
    public String updateProductPriority(@PathVariable Long id, @PathVariable int priority) {
        mobileService.updateItem(id, priority);
        return "Product priority updated successfully";
    }

}
