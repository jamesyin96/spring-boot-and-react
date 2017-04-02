package com.greglturnquist.payroll;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by yijun on 3/19/17.
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}