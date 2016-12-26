package crackingthecodinginterview;

/**
 * Created by davidflast on 10/17/16.
 */
public class RouteBetweenNodes {

    class graph{
        public node[] nodes;
    }

    class node{
        public String name;
        public node[] children;
        public boolean visited;

        public node(String name, node[] children) {
            this.name = name;
            this.children = children;
            this.visited = false;
        }
    }

    static boolean search(node root,String destination){
        if(root.name == destination){
            return true;
        }
        root.visited = true;
       for(node r:root.children){
           if(r.visited == false){
               search(r, destination);
           }
       }
       return false;
    }
}
