package iit.dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DAOImp implements IDAO {

	@Override
	public double getData() {
		double temp = Math.random()*40;
		return temp;
	}
	

}
