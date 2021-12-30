package controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import action.Action;

public class MemberController {
	
	public void processRequest(Scanner sc, Action action) throws InputMismatchException { //
		try {
			action.execute(sc);		
		} catch (InputMismatchException e) {
			System.out.println("숫자를 입력해 주세요");
			throw e;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}