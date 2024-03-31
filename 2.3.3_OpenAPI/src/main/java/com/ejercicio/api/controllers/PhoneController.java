package com.ejercicio.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.api.entities.Phone;
import com.ejercicio.api.services.PhoneServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/phones")
public class PhoneController extends BaseControllerImpl<Phone, PhoneServiceImpl> {

}
