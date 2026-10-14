package tandpwork;
import java.util.*;

/*
 * You are given a list of required skills and a list of candidates, where each candidate has a subset of skills. 
   Your task is to find the smallest possible team such that all required skills are covered.
	You will be given:
	Required skills list
	Number of candidates (N)
	Skill sets of N candidates
	
	Output:
		Return the indices of selected candidates forming the smallest team.
		Example 1:
		Input:

		a b c d
		4
		{{a,b},{b,c},{c,d},d}	
		Output:

			0 2
 */
public class MinimumTeamSelectionToCoverRequiredSkills {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char skills[]= {'a','b','c','d'};
		
		List<List<Character>> people=new ArrayList<>();
		ArrayList<Character> finalPeople=new ArrayList<>();
		
		HashSet<Integer> peoplePosition=new HashSet<>();
		
		people.add(Arrays.asList('a','b'));
        people.add(Arrays.asList('b','c'));
        people.add(Arrays.asList('c','d'));
        people.add(Arrays.asList('d'));
        
        
        for(int i=0;i<people.size();i++){
        	for(int j=0;j<people.get(i).size();j++) {
        		
        		char p=people.get(i).get(j);
        		
        		
        		
        		
        		
        		if(finalPeople.contains(p)==true) {
        			break;
        			
        		}else if(finalPeople.contains(p)!=true) {
        			finalPeople.add(p);
        			peoplePosition.add(people.indexOf(people.get(i)));
        		}
        	}
        	
        }
        
        System.out.println(peoplePosition);
        
        
        
		
		
		
		
		

	}

}
