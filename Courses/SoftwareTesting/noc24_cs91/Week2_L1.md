# Basics of graphs : As used in testing
## Graphs : History
* Graph theory, the study of graphs is said to have originated in  
1736 with Euler's problem about traversing through the
bridges of Königsberg, a city in Russia.
* Graphs have applications in several different areas including  
Computer Science, Sociology, Physics, Chemistry and Biology.
* We will consider graphs as models of software artifacts and  
use them to design test cases.

## Graph
* A graph is a tuple G = (V,E) where
    * V is a set of **nodes/vertices.**
    * E ⊆ (VxV) is a set of edges.
* Graphs can be **directed** or **undirected.**
* In an undirected graph, the pair of vertices constituting an edge is unordered, i.e., whenever (u,v) ∈ E then (v,u) ∈ E and vice versa.
* In a directed graph, the pair of vertices constituting an edge is ordered.

![graph](image-2.png)

* Graphs can be finite or infinte. Finite (infinite) graphs have a
finite (infinite) number of vertices.
* We will use finite graphs throughout our course.
* The degree of a vertex is the number of edges that are
connected to it. Edges connected to a vertex are said to be  
incident on the vertex.

* For many graphs, there are designated special vertices like
**initial** and **final** vertices.
* These vertices indicate beginning and end of a property that
the graph is modeling.
* Typically there is only one initial vertex, but, there could be
several final vertices.
* Initial vertex represents the beginning of a computation (of a
piece of code) and the computation ends in one of the final
vertices.

![graph1](image-3.png)

## Graphs in Testing - Coverage Criteria
* Graphs are very popularly used structure for testing.
* Graphs can come from different software artifacts:
    * Control flow graphs
    * Data flow graphs
    * Call graphs
    * Designs modelled as finite state machines and statecharts.
    * Use case diagrams
    * Activity diagrams
* Most of these graphs will have labels associated with vertices
and/or edges. Labels or annotations could be details about
the software artifact that the graphs are modelling.
* Tests are intended to cover the graph in some way.

## Graphs in Testing - CFG example #1
```
if (x < y){
    y:=0;
    x:=x+1;
}
else{
    x:=y+1;
}
z:=x+1
```
![controlFlowGraph1](image-4.png)

## Graphs in Testing - CFG example #2

if (x < y){
    y:=0;
    x:=x+1;
}
else{
    x:=y+1;
}
z:=x+1;

![CFG2](image-5.png)

## Paths in Graphs
* A **path** p is a sequence of vertices V1, V2, ... , Vn such that
(Vi, Vi+l) belongsTo E for 1 <= i <= n— 1.
* **Length** of a path is the number of edges that occur in it. A
single vertex path has length 0.
* **Sub-path** of a path is a sub-sequence of vertices that occur in
the path.
* For e.g., for the undirected graph given in slide 3, u, w, x, u, v is a path. A sub-path of this path is w, x, u and the length of this sub-path is 2.

## Reachability in graphs
* A vertex v is **reachable** in a graph G if there is a path from one of the initial   
vertices of the graph to v.
* An edge e = (u, v) is **reachable** in a graph G if there is a pathl from one of the initial   
vertices to the vertex u and then to v through the edge e.
* A sub-graph G/ of a graph G is reacshable if one of the  
vertices of G/ is reachable from an initial node in G.

## Algorithms for paths and reachability
* Depth First Search (DFS) and Breadth First Search (BFS) are  
two well-known algorithms that can be used for reachability in  
graphs.
* Apart from DFS and BFS, in graphs that have parameters  
associated with vertices or edges, we can ask for specific  
reachability of certain vertices, edges etc.
* Most such problems can be solved bsing a modification of
DFS/BFS algorithms.

## Test paths in graphs
* A test path is a path that starts in an initial vertex and ends in a final vertex.  
Note: Initial and final vertices capture the beginning and
ending of paths, respectively, in the corresponding graph.
* Test paths represent execution of test cases.
    * Some test paths can be executed by many test cases (Feasible paths).
    * Some test paths cannot be executed by any test case
(Infeasible paths).