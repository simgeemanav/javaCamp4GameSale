package gameInterfaceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameInterfaceDemo.dataAccess.abstracts.MemberDao;
import gameInterfaceDemo.entities.concretes.Member;

public class HibernatesMemberDao implements MemberDao {
	
	ArrayList<Member>members;
	

	public HibernatesMemberDao(ArrayList<Member> members) {
		this.members = members;
	}

	@Override
	public void add(Member member) {
       System.out.println(member.getFirstName() + " isimli oyuncu kaydı hibernate ile yapıldı ");		
	}

	@Override
	public void delete(Member member) {
       System.out.println(member.getFirstName() + " isimli oyuncu kaydı hibernate ile silindi ");		
	}

	@Override
	public void update(Member member) {
        System.out.println(member.getFirstName() + " isimli oyuncu kaydı hibernate ile güncellendi ");		
	}

	@Override
	public List<Member> getAll() {
		return members;
	}

}
