package gameInterfaceDemo.adapter;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import gameInterfaceDemo.business.abstracts.MemberCheckService;
import gameInterfaceDemo.entities.concretes.Member;

public class MernisDaoAdapter implements MemberCheckService{

	public boolean checkIfRealPerson(Member member) {
		KPSPublicSoap soapClient=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=soapClient.TCKimlikNoDogrula(Long.parseLong(member.getIdentityNumber()), member.getFirstName(),member.getLastName()
					,member.getYearOfBirth());
			
		}catch (NumberFormatException e) {
            e.printStackTrace();
       } catch (RemoteException e) {
            e.printStackTrace();
       }
      return result;
	}
		
		

	

}
