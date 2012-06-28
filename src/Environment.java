import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Environment extends JFrame{
	
	private JPanel container = new JPanel();
	private Pannel pan= new Pannel();
	public static Node[] node= new Node[Parameters.getTotalNbNodes()]; //Table of nodes
	public static Agent[] agent= new Agent[Parameters.getTotalNbAgents()]; // Table of agents
	int sizeNode= 50;
	
	public Environment(){
		
		// We are setting up the environment
		setEnv();
		//Title
		this.setTitle("Environment ABMS");	
		//Size
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Modification of the size of the window not allowed
		this.setResizable(false);
		//Place the window in the middle of the screen
		this.setLocationRelativeTo(null);

		container.setLayout(new BorderLayout());
		
		container.add(pan, BorderLayout.CENTER);
		
		this.setContentPane(container);
		
		this.setVisible(true);
		

	}
	
	private void setEnv(){
		
		// Nodes
		for (int i=0;i<node.length;i++){ // We create the nodes by assigning them ID
			node[i]= new Node(i+1);
			System.out.println("Node id " + node[i].getIdNode()+ " created");
		}
		
		// Agents
		for (int i=0;i<agent.length;i++){ // We create the agents by assigning them ID and putting them randomly in the nodes
			agent[i]= new Agent(i+1,(int)(Math.random() * (node.length)) + 1);
			int posXNode=0;
			int posYNode=0;
			
			if (agent[i].getIdActualnode()%2==0){
				posXNode=300;
				posYNode=100*(agent[i].getIdActualnode()/2);
			}
			
			else{
					posXNode=100;
					posYNode=100*((agent[i].getIdActualnode()/2)+1);
				}
			
			agent[i].setPosX((int)(Math.random()*(sizeNode-10)+posXNode)); //Attribute a random place for the agent in the node
			agent[i].setPosY((int)(Math.random()*(sizeNode-10)+posYNode)); //Attribute a random place for the agent in the node
			System.out.println("Agent id " +agent[i].getIdAgent()+ " in node:" +agent[i].getIdActualnode());
		}

		// Number of agents in each node
		for(int i=0;i<node.length;i++){ // We determinate the number of agents in each node
			int number=0;
			
			for (int j=0;j<agent.length;j++){
				if (agent[j].getIdActualnode()==node[i].getIdNode())
					number++;
			}
			
			node[i].setNbAgent(number);
			System.out.println("Number of agents in node id " +node[i].getIdNode()+ ": " +node[i].getNbAgent());
		}
	}
	
	
	private void move(){
		
		
	
	}
}