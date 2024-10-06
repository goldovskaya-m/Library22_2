package org.example.controller;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")

public class DepartmentController {
    private final DepartmentService departmentService;

    public  DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee getMaxSalaryEmployee(@RequestParam("departmentId") int departmentId) {
        return departmentService.getMaxSalaryEmployee(departmentId);

    }
    @GetMapping("/min-salary")
    public Employee getMinSalaryEmployee(@RequestParam("departmentId") int departmentId) {
        return departmentService.getMinSalaryEmployee(departmentId);

    }
    @GetMapping("/all/dy-department")
    public List<Employee> getAllEmployeeDepartment(@RequestParam("departmentId") int departmentId) {
        return departmentService.getAllEmployeeDepartment(departmentId);
    }

    @GetMapping("/all")
    public Map<Integer, List<Employee>> getAllEmployees() {
        return departmentService.getAllEmployees();

    }
}
