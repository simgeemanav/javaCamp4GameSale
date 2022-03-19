package gameInterfaceDemo.business.concretes;




import java.util.List;

import gameInterfaceDemo.business.abstracts.MemberCheckService;
import gameInterfaceDemo.dataAccess.abstracts.MemberDao;
import gameInterfaceDemo.entities.concretes.Member;


public class MemberManager implements MemberDao{
	
	MemberCheckService memberCheckService;

	public MemberManager(MemberCheckService memberCheckService) {
		this.memberCheckService = memberCheckService;
	}

	@Override
	public void add(Member member) {
          if(MemberCheckService.checkIfRealPerson(member)) {
        	  System.out.println(member.getFirstName() + " kullanıcısı eklendi ");
        	  
          }else {
        	  System.out.println(" kullanıcı eklenemedi ");
          }
	}

	@Override
	public void delete(Member member) {
          System.out.println(member.getFirstName() + " kullanıcısı silindi ");		
	}

	@Override
	public void update(Member member) {
        System.out.println(member.getFirstName() + " kullanıcısı güncellendi ");		
		
	}

	@Override
	public List<Member> getAll() {
		return null;
	}
	
	
	
	
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	    


	       
	}

	

	

	
	
	
	
	
	
	


	
	
	
	
	
	



