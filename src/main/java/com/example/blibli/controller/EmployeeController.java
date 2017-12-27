package com.example.blibli.controller;

import com.example.blibli.model.request.EmployeeRequest;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.model.response.base.BaseResponse;
import com.example.blibli.model.response.base.BaseRestResponse;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.model.response.base.RestSingleResponse;
import com.example.blibli.service.api.EmployeeService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController public class EmployeeController {
	
	@Autowired private EmployeeService employeeService;
	
	@PostMapping(path = "/api/employees", produces = MediaType.APPLICATION_JSON_VALUE) @ResponseBody
    public RestListResponse<EmployeeResponse> getEmployees(@RequestBody EmployeeRequest request) {
        RestListResponse<EmployeeResponse> response;
        try {
            response = this.employeeService.findPageable(request);
        } catch (Exception e) {
            response = new RestListResponse<>(null, e.getMessage(), false);
        }
        return response;
    }
	
	@PostMapping(path = "/api/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<EmployeeResponse> saveStudent(@RequestBody EmployeeRequest request) {
        RestSingleResponse<EmployeeResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.employeeService.saveEmployee(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;
    }

    @PutMapping(path = "/api/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public RestSingleResponse<EmployeeResponse> updateStudent(@RequestBody EmployeeRequest request) {
        RestSingleResponse<EmployeeResponse> response;
        try {
            response = new RestSingleResponse<>(null, null, true,
                this.employeeService.updateEmployee(request));
        } catch (Exception e) {
            response = new RestSingleResponse<>(null, e.getMessage(), false);
        }
        return response;
    }

    @DeleteMapping(path = "/api/employee/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody public BaseRestResponse deleteEmployee(@PathVariable("id") String id) {
        BaseRestResponse response;
        try {
            this.employeeService.deleteEmployee(id);
            response = new BaseRestResponse(null, null, true);
        } catch (Exception e) {
            response = new BaseRestResponse(null, e.getMessage(), false);
        }
        return response;
    }
}
