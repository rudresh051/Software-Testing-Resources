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
    * V is a set of nodes/vertices.
    * E ⊆ (VxV) is a set of edges.
* Graphs can be directed or undirected.
* In an undirected graph, the pair of vertices constituting an edge is unordered, i.e., whenever (u,v) ∈ E then (v,u) ∈ E and vice versa.
* In a directed graph, the pair of vertices constituting an edge is ordered.

![graph](image-2.png)

* Graphs can be finite or infinte. Finite (infinite) graphs have a
finite (infinite) number of vertices.
* We will use finite graphs throughout our course.
* The degree of a Jertex is the number of edges that are
connected to it. Edges connected to a vertex are said to be
incident on the vertex.