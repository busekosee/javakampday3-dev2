package javakampday3ödev2;

import abstracts.CustomerManager;
import abstracts.Oracledatabasemanager;

public class Main {

	public static void main(String[] args) {
		CustomerManager customermanager=new CustomerManager();
		customermanager.basedatabasemanager=new Oracledatabasemanager();
		customermanager.getcustomers();

	}

}
