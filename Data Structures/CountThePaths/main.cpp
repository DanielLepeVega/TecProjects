/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: yo_da
 *
 * Created on March 6, 2019, 1:42 PM
 */

#include <cstdlib>
#include <iostream>
#include <valarray>
#include <stack>
#include <string>
#include <string.h>
#include <stdio.h>
#include <cstring>

using namespace std;

struct node{
    node* next;
    node* prev;
    int num;
    bool activated;
};

node* head;
node* tail;

void addNode(int n){
    node* tmp;
    if (head == NULL){
        head = (node*)malloc(sizeof(struct node));
        head->prev = NULL;
        head->next = NULL;
        head->num = n;
        tmp = head;
    }
    else{
        tmp->next = (node*)malloc(sizeof(struct node));
        tmp->prev = head;
        tmp->next->num = n;
        tail = tmp;
        tmp->next->next = NULL;
    }
}

int countOfSets(int numSets[], int X){
    int countsOfSets = 0;
    int n = 0;
    int i = 0;
    node* tmp = head;
    node* tmp2 = head;
    node* tmp3 = tail;
    while(tmp->next != NULL){  
        addNode(numSets[i]);
        i++;
        tmp = tmp->next;
    }
    if(tmp2->num == X){
        countsOfSets++;
    }
    else if(tmp2->num + tmp->next->num == X){
        countsOfSets++;
    }
    else if(tmp3->num){
        countsOfSets++;
    }
    else if(tmp3->num + tmp->prev->num == X){
        countsOfSets++;
    }
    while(n<=X && tmp2->next != NULL){
        if(n==X){
            countsOfSets++;
        }
        else if(n>X){
            tmp2 = tmp2->next;
        }
        n = tmp2->num + tmp2->next->num + tmp2->next->next->num;
        tmp2 = tmp2->next;
    }
    while(n<=X && tmp3->prev != NULL){
        if(n==X){
            countsOfSets++;
        }
        else if(n>X){
            tmp3 = tmp3->prev;
        }
        n = tmp3->num + tmp3->prev->num + tmp3->prev->prev->num;
        tmp3 = tmp3->prev;
    }
    return countsOfSets;
}
    
    
int main(int argc, char** argv) {
    
    int sets1[4] = {2,4,6,10};
    cout << countOfSets(sets1, 16);
    int sets2[4] = {1,3,4,5,6,12};
    cout << countOfSets(sets2, 13);
    int sets3[4] = {2, 3, 5, 6, 9, 12, 20};
    cout << countOfSets(sets3,11);
    return 0;
}

