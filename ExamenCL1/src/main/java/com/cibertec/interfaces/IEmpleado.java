package com.cibertec.interfaces;

import org.springframework.data.repository.kotlin.CoroutineCrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.modelo.Empleado;
@Repository
public interface IEmpleado extends CoroutineCrudRepository<Empleado , Integer> {

}
