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