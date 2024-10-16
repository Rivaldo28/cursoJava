package com.crescendodigital.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
class P13ApplicationTests {
	
	@Value("${paginacao_qtd_por_pagina}")
	private int qtdPorPagina;
	
	@Test
	void contextLoads() {
	}
	
	public void testCarregarContextoDeTeste() {
		assertEquals(100, qtdPorPagina);
	}
}
