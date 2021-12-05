package com.ch.team.junit;

import org.junit.Test;

import com.ch.team.domain.Employee;
import com.ch.team.service.NameListService;
import com.ch.team.service.TeamException;

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

	@Test
	public void testgetEmploy() {
		NameListService service = new NameListService();
		int id = 15;
		try {
			Employee employee = service.getEmploy(id);
			System.out.println(employee);
		} catch (TeamException e) {
			System.out.println(e.getMessage());
		}
	}

}
