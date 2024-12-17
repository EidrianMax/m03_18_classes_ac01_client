/*
* PersonTestJunit.java
*
* This is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation v3.
*
* @see <a href="http://www.gnu.org/licenses/gpl.html">GNU License</a> for more information.
*
* Copyright (c) Joan S�culi <a href="mailto:jseculi@escoladeltreball.org">Joan Seculi</a>
*/
package client;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
* Enter a description
*
* @author  <a href="mailto:jseculi@escoladeltreball.org">Joan Seculi</a>
* @version 1.0
* @since   20/02/2022  
* 
*
* This is free software; you can redistribute it and/or
* modify it under the terms of the GNU Lesser General Public
* License as published by the Free Software Foundation v3.
*
* @see <a href="http://www.gnu.org/licenses/gpl.html">GNU License</a>
*
*
*/
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ClientTest {

	Client client1;

	Client client2;

	Client client3;

	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		// Constructor 1
		client1 = new Client("222222C", "Anne", "Short", "UK", "333333", "45645645J", (byte)30);
		//System.out.println(person2.toString());
		
	
		// Constructor 2
		client2 = new Client("111111AB", "Peter", "Long", "44444444L");
		//System.out.println(person1.toString());

		client3 = new Client("222222C", "Anne", "Short", "UK", "333333", "45645645J",  (byte)30);
		//System.out.println(person3.toString());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Order(1)
	void testConstructor1() {
		
		//Test constructor 1
		assertTrue(client1.getDebts() == 0);
		assertTrue(client1.isActive());
		
	}
	
	@Test
	@Order(2)
	void testConstructor2() {
		
	
		//Test constructor 2
		assertTrue(client2.getNationality().equals("ES"));
		assertEquals("NOT_PROVIDED", client2.getPhone());
		assertEquals(18, client2.getAge());
		assertTrue(client2.getDebts() == 0);
		assertTrue(client2.isActive());
		
	}
	
	@Test
	@Order(3)
	void testCancelDebtOK() {
		assertTrue(client1.cancelDebts());
		
	}
	

	
	
	
	@Test
	@Order(4)
	void testCancelDebtNoOK() {
		client1.setActive(false);
		assertFalse(client1.cancelDebts());

	}
	
	@Test
	@Order(5)
	void testReduceDebt() {
		client1.setDebts(120.25f);
		assertTrue(client1.reduceDebts(50f));
		assertEquals(70.25, client1.getDebts());

	}
	
	@Test
	@Order(6)
	void testReduceDebt2() {
		client1.setDebts(120.25f);
		assertTrue(client1.reduceDebts(150f));
		assertEquals(0, client1.getDebts());

	}
	
	@Test
	@Order(7)
	void testReduceDebt3() {
		client1.setDebts(120.25f);
		assertFalse(client1.reduceDebts(-100f));
		assertEquals(120.25f, client1.getDebts());

	}
	
	
	@Test
	@Order(8)
	void testIncreaseDebt() {
		client1.setDebts(120.25f);
		assertTrue(client1.increaseDebts(50f));
		assertEquals(170.25, client1.getDebts());

	}
	
	@Test
	@Order(8)
	void testIncreaseDebt2() {
		client1.setDebts(120.25f);
		assertFalse(client1.increaseDebts(-50f));
		assertEquals(120.25, client1.getDebts());

	}
	
	@Test
	@Order(9)
	void testGettersSetters() {

		// getters and setter setAccount & getAccount
		client3.setAccountNum("11111D");
		assertEquals("11111D",client3.getAccountNum());

		// getters and setter setName & getName
		client3.setName("Pepe");
		assertEquals("Pepe", client3.getName());

		// getters and setter setSurname & getSurname
		client3.setSurname("Longer");
		assertEquals("Longer", client3.getSurname());

		// getters and setter setNationality & getNationality
		client3.setNationality("USA");
		assertEquals("USA", client3.getNationality());

		// getters and setter setPhone & getPhone
		client3.setPhone("66666666");
		assertEquals("66666666", client3.getPhone());

		// getters and setter setDni & getDni
		client3.setDni("111111K");
		assertEquals("111111K", client3.getDni());

		// getters and setter setAge & getAge
		client3.setAge((byte) 35);
		assertEquals(35, client3.getAge());

		// Test isActive and getActive
		assertTrue(client3.isActive());
		assertTrue(client1.isActive());
		assertTrue(client2.isActive());

		client3.setActive(false);
		assertFalse(client3.isActive());

	}
	

	
	

}