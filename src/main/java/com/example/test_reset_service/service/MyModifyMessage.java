package com.example.test_reset_service.service;
import com.example.test_reset_service.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier ("Modify ErrorMessage")
public class MyModifyMessage implements MyModifyService {

        @Override
        public Response modify (Response response) {
            response.setErrorMessage("Что-то сломалось");
            return response;
        }
}
