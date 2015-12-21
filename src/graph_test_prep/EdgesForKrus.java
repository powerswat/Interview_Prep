package graph_test_prep;

public class EdgesForKrus {
	private int from = -1;
	private int to = -1;
	private int weight = -1;

	public EdgesForKrus(int from, int to, int weight){
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	
	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

	public int getWeight() {
		return weight;
	}
}
