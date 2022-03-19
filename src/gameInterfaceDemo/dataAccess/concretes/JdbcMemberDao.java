package gameInterfaceDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gameInterfaceDemo.dataAccess.abstracts.MemberDao;
import gameInterfaceDemo.entities.concretes.Member;


public class JdbcMemberDao implements MemberDao{
	
	ArrayList<Member>members;
	

	public JdbcMemberDao(ArrayList<Member> members) {
		this.members = members;
	}

	@Override
	public void add(Member member) {
		 System.out.println(member.getFirstName() + " isimli oyuncu kaydı jdbc ile yapıldı ");
		
	}

	@Override
	public void delete(Member member) {
		System.out.println(member.getFirstName() + " isimli oyuncu kaydı jdbc ile silindi ");
		
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
