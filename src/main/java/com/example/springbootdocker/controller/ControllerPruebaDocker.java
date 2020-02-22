package com.example.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdocker.modelo.Empleado;

@RestController
@RequestMapping("empleados/v1")
public class ControllerPruebaDocker {

	@GetMapping()
	public Empleado obtenerDatos() {
		return new Empleado();
	}

}
