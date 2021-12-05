package com.ch.team.junit;

import org.junit.Test;

import com.ch.team.domain.Employee;
import com.ch.team.service.NameListService;

/**
 * 
 * 
 * @Descrition ∂‘NameListService¿‡µƒ≤‚ ‘
 * @author chenpi
 *
 */
public class NameListServiceTest {
	@Test
	public void testgetAllEmployees() {
		NameListService service = new NameListService();
		Employee[] employees = service.getAllEmployees();
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}

}
