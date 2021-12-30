package controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import action.Action;

public class MemberController {
	
	public void processRequest(Scanner sc, Action action) throws InputMismatchException { //
		try {
			action.execute(sc);		
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��� �ּ���");
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}