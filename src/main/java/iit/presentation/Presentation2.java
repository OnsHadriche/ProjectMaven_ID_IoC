package iit.presentation;

import java.util.*;

import iit.dao.IDAO;
import iit.service.IService;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Presentation2 {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Scanner scanner = new Scanner(new File("config.txt"));
			String daoClassName= scanner.nextLine();
			Class cDao= Class.forName(daoClassName);
			IDAO dao = (IDAO)cDao.getConstructor().newInstance();
			System.out.println(dao.getData());
			String metierClassName=scanner.nextLine();
			Class cMetier = Class.forName(metierClassName);
			IService metier = (IService)cMetier.getConstructor().newInstance();
			Method methode;
			try {
				methode = cMetier.getMethod("setDao", IDAO.class);
				//setDAO() de la classe service
				methode.invoke(metier,dao);
				System.out.println("resultat = "+ metier.calcul());
				
			} catch (NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | IllegalArgumentException | NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
