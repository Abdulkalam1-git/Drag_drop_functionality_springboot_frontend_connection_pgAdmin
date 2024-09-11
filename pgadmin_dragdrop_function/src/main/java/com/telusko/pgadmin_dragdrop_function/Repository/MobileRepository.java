package com.telusko.pgadmin_dragdrop_function.Repository;


import com.telusko.pgadmin_dragdrop_function.Model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MobileRepository extends JpaRepository<Mobile , Long> {


}
