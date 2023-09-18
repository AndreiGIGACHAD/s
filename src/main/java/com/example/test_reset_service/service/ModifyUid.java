package com.example.test_reset_service.service;
import com.example.test_reset_service.model.Response;
import org.springframework.beans.factory.annotation. Qualifier;
import org.springframework. stereotype.Service;
@Service
@Qualifier("ModifyUid")
 public class ModifyUid implements MyModifyService {
        @Override
        public Response modify(Response response) {
            response.setUid("New Uid");
            return response;
        }
    }

