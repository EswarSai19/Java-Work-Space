package ques3;

import java.util.Scanner;

public class IPL {
	void homeTeamStadium(Stadium st) {
		if(st==Stadium.EDEN_GARDENS_STADIUM) {
			System.out.println("This is the home ground of KKR");
		}else if(st==Stadium.WANKHEDE_STADIUM) {
			System.out.println("This is the home ground of Mumbai Indians");
		}else if(st==Stadium.CHIDAMBARAM_STADIUM) {
			System.out.println("This is the home ground of CSK");
		}else if(st==Stadium.M_CHINNASWAMY_STADIUM) {
			System.out.println("This is the home ground of RCB");
		}
	}
	public static void main(String[] args) {
		IPL ip1 = new IPL();
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose any one Stadium...\r\n"
				+ "EDEN_GARDENS_STADIUM \r\n"
				+ "WANKHEDE_STADIUM \r\n"
				+ "CHIDAMBARAM_STADIUM \r\n"
				+ "M_CHINNASWAMY_STADIUM \r\n");
		String std = sc.next();
		Stadium st = Stadium.valueOf(std);
		ip1.homeTeamStadium(st);
		sc.close();
	}
}	
