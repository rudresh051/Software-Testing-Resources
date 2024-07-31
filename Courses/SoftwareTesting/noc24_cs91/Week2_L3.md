## Representation of graphs
* Two standard ways of representing graphs:
adjacency matrix
adjacency lists.
* Either way applies to both undirected graphs and directed
graphs.
* Adjacency list representation provides a compact way to
graphs, i.e., graphs for which IEI is much less than represent sparse than I V 12.
* Adjacency matrix represenation provides a compact way to
represent dense graphs, i.e., graphs for which IEI is close to
11/12.

## Adjacency list representation
* The adjacency list representation of a graph G (V, E) is an
array Adj of |V| lists, one for each vertex in V.
* For each u ∈ V, Adj[u] contains all vertices v such that there
is an edge (u, v) in E, i.e., it contains all edges incident with u.
* 
    * For directed graphs, the sum of lengths of all adjacency lists is |E|
    * For undirected graphs, the sum of lengths of all adjacency lists is 2|E|
* For both directed and undirected graphs, adjacency list
representation requires ⊝(|V| + |E|) memory.