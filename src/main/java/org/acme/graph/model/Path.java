package org.acme.graph.model;

import java.util.ArrayList;
import java.util.List;

public class Path {
	
	
	private List<Edge> edges = new ArrayList<>();
	
	public Path(List<Edge> edges) {

		this.edges = edges;
	};
	
	public List<Edge> getEdges(){
		return edges;
	};
	


}
