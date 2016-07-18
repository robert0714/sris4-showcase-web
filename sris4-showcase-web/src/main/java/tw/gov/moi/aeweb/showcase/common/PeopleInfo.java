package tw.gov.moi.aeweb.showcase.common;

import java.util.HashMap;
import java.util.Map;


public class PeopleInfo {

	public Map<String, PeopleVO> people_map = new HashMap<String, PeopleVO>();
	
	public PeopleInfo(){
		people_map.put("A123456789", new PeopleVO("A123456789","王大雄",new java.util.Date(),"台北市","台北市信義區","未婚","王爸","王媽"));
	}
	
	
	
}
