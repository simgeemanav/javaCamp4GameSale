package gameInterfaceDemo.dataAccess.abstracts;


import java.util.List;

import gameInterfaceDemo.entities.concretes.Member;

public interface MemberDao {
	void add(Member member);
	void delete(Member member);
	void update(Member member);
	List<Member> getAll();
	
}
