package com.example.blibli.service.impl;

import com.example.blibli.model.entity.Employee;
import com.example.blibli.model.request.EmployeeRequest;
import com.example.blibli.model.response.EmployeeResponse;
import com.example.blibli.model.response.base.RestListResponse;
import com.example.blibli.model.response.base.PageMetaData;
import com.example.blibli.repository.EmployeeRepository;
import com.example.blibli.service.api.ModelConverterService;
import com.example.blibli.service.api.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service public class EmployeeServiceImpl implements EmployeeService {
	private static final String EMPLOYEE_NOT_FOUND = "Employee Not Found";

    @Autowired private EmployeeRepository employeeRepository;

    @Autowired private ModelConverterService modelConverterService;

	@Override
	public List<EmployeeResponse> findAll() {
		List<Employee> employees = this.employeeRepository.findAll();
		return this.modelConverterService.convertToEmployeeListResponse(employees);
	}

	@Override 
	public RestListResponse<EmployeeResponse> findPageable(EmployeeRequest request) {
        BigDecimal totalRecords = BigDecimal.valueOf(this.employeeRepository.countTotalRecords());
        System.out.println(request.toString());
        int size = request.getPageMetaData().getSize();
        int page = request.getPageMetaData().getPage();
        int offset = page * size;
        List<Employee> employees = this.employeeRepository.findPageable(size, offset);
        List<EmployeeResponse> employeeResponses =
            this.modelConverterService.convertToEmployeeListResponse(employees);
        return new RestListResponse<>(null, null, true, employeeResponses,
            new PageMetaData(page, size, totalRecords));
    }
	
	@Override
	public List<EmployeeResponse> findByName(String name) {
		List<Employee> employees = this.employeeRepository.findByName(name);
		return this.modelConverterService.convertToEmployeeListResponse(employees);
	}

	@Override
	public EmployeeResponse saveEmployee(EmployeeRequest request) throws Exception {
		Employee employee = new Employee();
		employee.setName(request.getName());
		employee.setHireDate(request.getHireDate());
		employee.setStatus(request.getStatus());
		return this.modelConverterService.convertToEmployeeResponse(this.employeeRepository.save(employee));
	}

	@Override
	public EmployeeResponse updateEmployee(EmployeeRequest request) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = this.employeeRepository.findById(request.getId());
		if (employee == null)
		{
			throw new Exception(EmployeeServiceImpl.EMPLOYEE_NOT_FOUND);
		}
		else {
			employee.setName(request.getName());
			employee.setHireDate(request.getHireDate());
			return this.modelConverterService.convertToEmployeeResponse(this.employeeRepository.save(employee));
		}
	}

	@Override
	public void deleteEmployee(String id) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = this.employeeRepository.findById(id);
		if (employee == null)
		{
			throw new Exception(EmployeeServiceImpl.EMPLOYEE_NOT_FOUND);
		}
		else {
			this.employeeRepository.delete(employee);
		}
	}

}
