import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		/** We move one of the agent from his initial node
		agent[3].move(2);
		System.out.println("Agent id " + agent[3].getIdAgent()+ " moved in the node id " +agent[3].getIdActualnode());
		*/
	
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Nodes would you like to create?");
		int i=sc.nextInt();
		Parameters.setTotalNbNodes(i);
		System.out.println("How many Agents would you like to create?");
		i=sc.nextInt();
		Parameters.setTotalNbAgents(i);
		Environment env= new Environment();
		
	}
}
