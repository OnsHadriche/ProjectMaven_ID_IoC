package iit.extension;

import org.springframework.stereotype.Component;

import iit.dao.IDAO;
@Component("dao2")
public class DaoImp2 implements IDAO {

	@Override
	public double getData() {
		System.out.print("version capteur");
		double temp = 60000;
		return temp ;
	}

}
