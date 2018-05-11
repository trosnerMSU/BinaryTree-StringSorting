/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreepractice;
// Binary Tree Class
//
// Here I am going to create a Binary Tree from scratch
// 
//***************************************************************************************

import java.util.*;9
import java.io.*;

// Here I am extending the Comparable class so that I can access the methods
public class BinarySearch<T extends Comparable<T>> implements BinaryTreeInterface<T> {   
    private Node root;
    private int size = 0;
   
    public BinarySearch()
    {
        
    }
    
    // Having an array of objects means I need to call the insert method for each index that is occupied 
    // In the array that is given
    
    public BinarySearch(T[] objects)
    {
        for(int i = 0; i < objects.length; i++)
        {
             insert(objects[i]);
        }
    }
    
    public boolean insert(T t)
    {
      
         
        // If the root is empty then we will place the object in the root's position
        if(root == null)
        {
           Node newNode = new Node(t);
           root = newNode;
          
        
        }else
        {
            Node parent = null;     // Initializes the Parent node
            Node child = root;      // Initializes the Child node equal to root (Child = Root)
            
            // Loops through until the child node is completely empty (Finds empty spot in tree)
            while(child != null) 
            {
            
                // If the new Object is less than the child then we go left
                if(t.compareTo(child.data) < 0) 

                {
                    parent = child;       // Parent is equivalent to Child/Root
                    child = child.left;   // Child creates a left instance of itsself and points to new child location
                }
                
                 // Now we check if the new Object is greater than the child and do the same as before except we go right
                 else if(t.compareTo(child.data) > 0)
                {
                    parent = child;
                    child = child.right;
                }else
                {
                    return false;
                }
            }
            
            // If the new Object is less than the parent then we go left
            if(t.compareTo(parent.data)<0)
            {
                Node newNode = new Node(t);
                parent.left = newNode;       // Create new node for the new Object and set it equal to parent.left (child)
            }else
            {
                Node newNode = new Node(t);
                parent.right = newNode;
            }
            
        }
            
            size++;
            return true;
    }
    
    public void preorder()
    {
        preorder(root);
    }
    
    private void preorder(Node nRoot)
    {
        if(nRoot == null) return;
        System.out.print(nRoot.data + " ");
        preorder(nRoot.left);
        preorder(nRoot.right);
        
    }
    
    public void inorder()
    {
       
        inorder(root);
    }
    
    private void inorder(Node nRoot)
    {
        if(nRoot == null) return;
        inorder(nRoot.left);
        System.out.print(nRoot.data + " ");
        inorder(nRoot.right);
    }
    
    public void postorder()
    {
        postorder(root);
    }
    
    private void postorder(Node nRoot)
    {
        if(nRoot == null) return;
        postorder(nRoot.left);
        postorder(nRoot.right);
        System.out.print(nRoot.data + " ");
    }
    
    
    
    
    
    public class Node
    {
         T data;
         Node left;
         Node right;
                
        public Node(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
        
        
    }
    

}


