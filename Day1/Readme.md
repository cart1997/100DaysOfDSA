Day 1 of #100Days
-
-------------
Topics covered 

- Arrays
- Hashing
- LinkedList

Arrays
-

- In Java Arrays are static types(fixed in size), store similar types of data only.
- Elements are stored in contiguous memory
- Arrays are objects data type in java
- Arrays are two types, single dimension and 2/multi dimension
  - single dimension arrays are normal arrays.

          syntax:
          Datatype[] name = new datatype[size]
  
          ex: 
          int[] id = new int[10]

  - two/Multi-dimension arrays works with row, and columns
  
         syntax:
         Datatype[][] name = new datatype[r_size][c_size]
  
         ex:
         int[][] id = new int[5][4]
  
- Arrays take O(1) for accessing . whereas insertion, deletion of an array takes O(n)

Hashing
-
- Hashing is key,value-pair data structure in Java also known as dictionaries in Python
- Hashing won't allow duplicate keys, but  allows null key & value
- Hash function can give the stored object location
- It uses in memory lookups and internally use arrays(key maps to an index values)
- In java, Hashing uses the util.HashMap library.
        
          Syntax:
      
          HashMap<datatype_key, datatype_value> name = new HashMap<>();
- 
          ex:
          HashMap<Character,Integer> hm = new HashMap<>();

- Hashing takes O(1) time complexity with all the operations(insertion, deletion, lookup)

LinkedList
-

- LinkedList used to store list of objects in a sequence.
- It consists of group of nodes in sequence whereas each node consists of two pieces of data namely:Value, and address
  - Here, First node is Head and last node is Tail

- There are two types of linked lists 
  - Singly linked-list 
  - Doubly linked-list
- In Java, LinkedList uses the util.LinkedList library

          Syntax:
          
          LinkedList<datatype> name = new LinkedList<>();
          
          ex:
          LinkedList<Integer> ll = new LinkedList<>();

- Lookup value,index takes O(N) time, Insertion is O(1) if it's header or tail. if it's in middle takes O(N). Whereas, deleting from beginning, ending takes O(1) times and middle takes O(N) times.
  - Note: When performed the deletion operation reference also must be deleted at same time. otherwise, garbage collector in java thinks as object is still in use.