
public class Parameters {

	private static int TotalNbNodes=4; // Total number of nodes in the environment
	private static int TotalNbAgents=9; // Total number of agents in the environment
	private static int TotalNbLinks=4; // Total number of links in the environment
	private static int[] tabLink= {1,1,2,3};
	private static int[] tabLink2= {2,3,4,4};

	
	//Getters and setters
	public static int getTotalNbNodes() {
		return TotalNbNodes;
	}
	
	public static void setTotalNbNodes(int totalNbNodes) {
		TotalNbNodes = totalNbNodes;
	}
	
	public static int getTotalNbAgents() {
		return TotalNbAgents;
	}
	
	public static void setTotalNbAgents(int totalNbAgents) {
		TotalNbAgents = totalNbAgents;
	}

	public static int getTotalNbLinks() {
		return TotalNbLinks;
	}

	public static void setTotalNbLinks(int totalNbLinks) {
		TotalNbLinks = totalNbLinks;
	}

	public static int getTabLink(int i) {
		return tabLink[i];
	}

	public static void setTabLink(int i,int tabLink) {
		Parameters.tabLink[i] = tabLink;
	}

	public static int getTabLink2(int i) {
		return tabLink2[i];
	}

	public static void setTabLink2(int i,int tabLink2) {
		Parameters.tabLink2[i] = tabLink2;
	}


	
	
	
}
