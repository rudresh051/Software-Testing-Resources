## Graph coverage criteria - Overview
* We look at graphs as structures and look at the following two
coverage criteria over graphs.
    * Structural coverage criteria.
    * Data flow coverage criteria.
* Later, we consider software artifacts (code, design elements
and req requirements) modelled as graphs and see how these
coverage criteria apply to them.
* Focus of this lecture: Structural coverage criteria.

## Structural coverage criteria over graphs
* Node/vertex coverage.
* Edge coverage.
* Edge pair coverage.
* Path coverage
    * Conlplete path coverage.
    * Prime path coverage.
    * Complete round trip coverage.
    * Simple round trip coverage.

## Node/Vertex coverage
* **Node coverage** requires that the test cases visit each node in
the graph once.
* **Node Coverage:** Test set T **satisfies node coverage** on graph G iff for every syntactically   
reachable node n ∈ G, there is some path p in path( T) such that p visits n.
* Simpler definition: TR(Test requirement) contains each reachable node in G.

## Edge coverage
* **Edge Coverage:** TR contains each reachable path of length up to 1, inclusive, in G.
* Edge coverage is slightly stronger than node coverage.
* Why "length up to 1" ?
It allows edge coverage for graphs with one node and no
edges.
* Allowing length up to 1 allows edge coverage to subsume
node coverage.

## Node and edge coverage - Example
![example1](image-8.png)
* Node coverage - TR = {1,2,3} , test path = [1,2,3].
* Edge coverage - TR = {(1,2),(1,3), (2,3)}, test paths = {[1,2,3],[1,3]}.
* Note - Node coverage and edge coverage are different only when there is an edge in another sub-path between a pair of nodes, like the above graph

## Covering Multiple Edges - Edge-Pair Coverage
* **Edge-Pair Coverage (EPC):** TR contains each reachable path
of length up to 2, inclusive, in G.
* Paths of length up to 2 correspond to pairs of edges.
* Again, the phrase "length up to 2" ensures edge-pair coverage holds for graphs with less than 2 edges.
![multipleEdges](image-9.png)

* TR = {[1,4,5], [2,4,5],[3,4,5],[1,4,6],[2,4,6],[3,4,6]}.
* Test paths are the same as above.

## Covering Multiple Edges, contd.
* An extension of edge-pair coverage is to consider all paths.
* Complete path coverage: TR contains all paths in G.
* Unfortunately, this is can be an infeasible test requirement.
Also, it may not be a useful test requirement.
* Specified path coverage: TR contains a set S of paths, where
S is specified by the user [tester.