    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: yo_da
 *
 * Created on October 16, 2018, 7:22 AM
 */

#include <cstdlib>
#include <stdlib.h>
#include <stdio.h>
#include <iostream>
#include <valarray>

using namespace std;

struct TreeNode{
    int data;
    TreeNode* right;
    TreeNode* left;
};

TreeNode* root;

TreeNode* addNode(int TreeData, TreeNode* node){
    
    if(node==NULL){
        node=(TreeNode*)malloc(sizeof(struct TreeNode));
        node->data=TreeData;
    }
    else if(TreeData > node->data){
        addNode(TreeData,node->right);
    }
    else if(TreeData < node->data){
        addNode(TreeData,node->left);
    }
    if(TreeData > root->data){
     addNode(TreeData,node->right);   
    }
    else{
     addNode(TreeData,node->left);   
    }
     return node;
}

int isLeaf(TreeNode* node){
    if(node->right == NULL && node->left==NULL){
        return 1;
    }
    else{
        return 0;
    }
}

void print(TreeNode* node){
    if(node != NULL){
        cout << node->data;
        print(node->left);
        print(node->right);
    }    
};    

int main(int argc, char** argv) {

    root = (TreeNode*)malloc(sizeof(struct TreeNode));
    root->data = 5;
    addNode(6,root);
    print(root);
    return 0;
}

