package com.example.test_reset_service.service;
import com.example.test_reset_service.model.Response;
import lombok. RequiredArgsConstructor;
import org.springframework.beans.factory.annotation. Qualifier;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class ModifySystemTime implements MyModifyService {


    @Qualifier ("ModifySystemTime")

        @Override
        public Response modify (Response response) {
            response.setSystemTime ("");
            return response;
        }
    }

