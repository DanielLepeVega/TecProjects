/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: yo_da
 *
 * Created on October 12, 2018, 7:46 AM
 */

#include <cstdlib>
#include <stdlib.h>
#include <stdio.h>
#include <iostream>

using namespace std;

struct node_double{
    int data;
    node_double* next;
    node_double* prev;
};

node_double* head;
node_double* tail;

void addNode(int x){
    if(head==NULL){
        head=(node_double*)malloc(sizeof(struct node_double));
        head->data = x;
        head->next = NULL;
        head->prev = NULL;
        tail=head;
    }
    else{
        tail->next = (node_double*)malloc(sizeof(struct node_double));
        tail->next->data = x;
        tail->next->prev = tail;
        tail->next->next=NULL;
        tail = tail->next;
    }
};

void printList(node_double* headOfList){
    node_double* tmp;
    tmp = headOfList;
    while(tmp->next !=headOfList){
        cout << "Values: " << tmp-> data << "\n";
        tmp = tmp->next;
    }  
};

void printReverseList(node_double* tailOfList){
    node_double* tmp;
    tmp = tailOfList;
    while(tmp->prev !=tailOfList){
        cout << "Values: " << tmp-> data << "\n";
        tmp = tmp->prev;
    }  
}

int main(int argc, char** argv) {

    for(int i=0; i<15;i++){
        addNode(i);
    }
    //printList(head);
    printReverseList(tail);
    return 0;
}

