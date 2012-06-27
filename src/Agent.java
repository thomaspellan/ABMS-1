
public class Agent {

	private int idAgent; // Number assigned to the agent
	private int idActualnode; // Identifier of his current node
	private int posX; // X position in the environment
	private int posY; // Y position in the environment
	
	//Constructor
	public Agent(int idAgent, int idActualnode) {
		this.idAgent = idAgent;
		this.idActualnode = idActualnode;
	}
	
	public Agent(int idAgent, int idActualnode,int posX,int posY) {
		this.idAgent = idAgent;
		this.idActualnode = idActualnode;
		this.posX= posX;
		this.posY=posY;
	}

	//Getters and setters
	public int getIdAgent() {
		return idAgent;
	}
	
	public void setIdAgent(int idAgent) {
		this.idAgent = idAgent;
	}
	
	public int getIdActualnode() {
		return idActualnode;
	}
	
	public void setIdActualnode(int idActualnode) {
		this.idActualnode = idActualnode;
	}
	

	// Move from one node to another one
	void move(int idNodeDest){
		setIdActualnode(idNodeDest);
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}
	
}
