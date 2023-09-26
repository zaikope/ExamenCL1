package com.cibertec.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cibertec.interfaces.IEmpleado;



public interface IEmpleadoService {
	
   public List<IEmpleado>listar();
   public Optional <IEmpleado>listarId(int id );
   public  int  save (IEmpleado p );
   public void delete (int  id );
   
}
