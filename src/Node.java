
public class Node {

	private int idNode;// Identifier of the node
	private int nbAgent; // Number of agents in the node

	// COnstructor
	public Node(int idNode) {
		this.idNode = idNode;
	}

	// Getters and setters
	public int getIdNode() {
		return idNode;
	}

	public void setIdNode(int idNode) {
		this.idNode = idNode;
	}

	public int getNbAgent() {
		return nbAgent;
	}

	public void setNbAgent(int nbAgent) {
		this.nbAgent = nbAgent;
	}

	
}
