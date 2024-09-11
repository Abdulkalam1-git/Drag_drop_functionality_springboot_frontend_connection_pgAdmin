package com.telusko.pgadmin_dragdrop_function.Service;

import com.telusko.pgadmin_dragdrop_function.Model.Mobile;
import com.telusko.pgadmin_dragdrop_function.Repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {
    @Autowired
    private MobileRepository mobileRepository;

    public Mobile addItem(Mobile mobile) {
        return mobileRepository.save(mobile);
    }
    //get
    public List<Mobile> getAllProductsOrderedByPriority() {
        return mobileRepository.findAll().stream()
                .sorted((p1, p2) -> Integer.compare(p1.getPriority(), p2.getPriority()))
                .toList();
    }

        //update
    public void updateItem(Long id, int priority) {
        //fetching
        Mobile mobile = mobileRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Product not found" + id));

        mobile.setPriority(priority);
        mobileRepository.save(mobile);

    }

}
