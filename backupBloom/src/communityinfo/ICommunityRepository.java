package communityinfo;

import java.util.List;

public interface ICommunityRepository {
	Community create(Community community);
	
	List<Community> read();
	
	Community update(Community community);
	
	Community delete(int no);
}
