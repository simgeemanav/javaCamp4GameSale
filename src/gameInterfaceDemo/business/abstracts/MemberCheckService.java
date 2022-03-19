package gameInterfaceDemo.business.abstracts;


import gameInterfaceDemo.entities.concretes.Member;

public interface MemberCheckService {
	
	static boolean checkIfRealPerson(Member member) {
		return true;
	}


	


}
