package gameInterfaceDemo.business.concretes;

import gameInterfaceDemo.business.abstracts.MemberCheckService;
import gameInterfaceDemo.entities.concretes.Member;

public class MemberCheckManager implements MemberCheckService {


	public boolean checkIfRealPerson(Member member) {
		return true;
	}

}
