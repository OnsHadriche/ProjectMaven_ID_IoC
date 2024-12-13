package iit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import iit.dao.IDAO;

@Component("service")
public class ServiceImp implements IService {

	//couplage faible 
//@Autowired
	//@Qualifier("dao")
	private IDAO dao;
	public ServiceImp(IDAO dao) {
		this.dao= dao;
	}
	@Override
	public double calcul() {
		double temp = dao.getData();
		double result = temp * 540/Math.cos(temp*Math.PI);
		
		return result;
	}
//Injecter dans la varible DAO  un objet d'une classe qui implement l'interface DAO 
	public void setDao(IDAO dao) {
		this.dao = dao;
	}

}
