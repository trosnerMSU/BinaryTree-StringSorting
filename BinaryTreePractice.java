// Author: Tanner Rosner
// BinaryTree String Sorting
// 
// Objective: Here I have created a binary tree 
// as well as an interface for it. I am using  
// String objects to practice with utilizing
// the tree.
//*******************************************************
package binarytreepractice;

import java.io.*;
import java.util.*;
import java.lang.*;


public class BinaryTreePractice{

    public static BinarySearch<String> binaryTree;       // Here I am initializing the Binary Tree object in terms of String
    
    public static void main(String[] args) {
             
      
    
      String[] names = new String[]{"John", "Kyle","Timmy","Mathew","Sam","Roxanne","Simone","Sid","Arenado","Charlie"};
     
      binaryTree = new BinarySearch<String>(names);
     
      
     System.out.print("inorder sorted: ");
     binaryTree.inorder();
     System.out.print("\npreorder sorted: ");
     binaryTree.preorder();
     System.out.print("\npostorder sorted: ");
     binaryTree.postorder();
     
}

}