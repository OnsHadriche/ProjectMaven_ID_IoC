package iit.presentation;

import iit.dao.DAOImp;
import iit.extension.DaoImp2;
import iit.service.ServiceImp;

public class Presentation {
	public static void main (String[] args) {
		DAOImp dao = new DAOImp();
		DaoImp2 dao2 = new DaoImp2();
		ServiceImp service = new ServiceImp(dao2);
		service.setDao(dao2);
		System.out.println("Resultat = "+ service.calcul());
		
	}
}
