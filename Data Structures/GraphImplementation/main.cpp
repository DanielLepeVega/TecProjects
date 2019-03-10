/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: yo_da
 *
 * Created on November 21, 2018, 12:10 PM
 */

//Daniel Lepe Vega A01633986
//David Javier Pérez Álvarez A01635157

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
    char name[100];
    node* down;
    node* right;
};

node* head;

void addnode(char names[]){
        node* tmp;
        if (head == NULL){
            head = (node*)malloc(sizeof(struct node));
            head->down = NULL;
        head->right = NULL;
        strcpy(head->name,names);
        tmp = head;
    }
    else{
        tmp->down = (node*)malloc(sizeof(struct node));
        tmp->down->right = NULL;
        strcpy(tmp->down->name,names);
        tmp->down->down = NULL;
        tmp = tmp->down;
    }
}
   
void connection(char name1[], char name2[]){ 
    
    node* tmp1 = head;
    node* tmp2 = head; 
    while(strcmp(tmp1->name,name1) != 0){
        tmp1 = tmp1->down;
    }
    while (strcmp(tmp2->name,name2) != 0){
        tmp2 = tmp2->down;
    }
    if(strcmp(tmp1->name,name1) == 0){
        while(tmp1->right != NULL){
            tmp1 = tmp1->right;
        }
        tmp1->right = (node*)malloc(sizeof(struct node));
        tmp1->right->down = NULL;
        strcpy(tmp1->right->name,name2);
        tmp1->right->right = NULL;
    }
    if(strcmp(tmp2->name,name2) == 0){
        while(tmp2->right != NULL){
            tmp2 = tmp2->right;
        }
        tmp2->right = (node*)malloc(sizeof(struct node));
        tmp2->right->down = NULL;
        strcpy(tmp2->right->name,name1);
        tmp2->right->right = NULL;
    }
}

void printFriends(char names[]){
    node* tmp = head;
    while(strcmp(tmp->name,names) != 0){
        tmp = tmp->down;
    }
    if(strcmp(tmp->name,names) == 0){
        if(tmp->right == NULL){
            cout << names << "That person does not have any friends";
        }
        while(tmp->right != NULL){
            cout << tmp->right->name << ", ";
            tmp = tmp->right;
        }
        cout << endl;
    }
    else{
        cout << names << "That person is not a user so no friends" << endl;
    }
}

void printUsers(){
    node* tmp = head;
    while(tmp->down != NULL){
        cout << tmp->down->name << ", ";
        tmp = tmp->down;
    }
    cout << endl;
}

bool find(char name_[]){ // We use DFS because we go to the farthest point we can get and if we find it it returns true if not it returns false
    node* tmp = head;
    while(tmp->down != NULL){
        if(strcmp(tmp->name,name_) == 0){
            return true;
        }
        tmp = tmp->down;
    }
    return false;
}

void menu(){
    char username[100];
    string usernames;
    char answer[100];
    string answers;
    int options;
    char answerfriend[100];
    string answerfriends;
    char answery[100];
    string answerys;
    char friends[100];
    string friendss;
    bool menu;
    
    cout << "-------Welcome to TecFriends------" << endl;
    cout << "Join our current users: ";
    printUsers(); 
    cout << endl;
    cout << "Please Enter your name: " ;
    cin >> username;
    cout << endl;
    if(find(username)){
        cout << "You have logged to your account." << endl;
        cout << "------Welcome " << username << "------" << endl;
    }
    else{
        cout << "You do not have an account. Do you want to create one [yes/no]: " << endl;
        cin >> answer;
        if(strcmp(answer,"yes") == 0){
            cout << "";
            addnode(username);
            cout << "-------Welcome " << username << "-----" << endl;
            cout << "!!! Congratulations !!! " << username << " You are now an user" << endl;
            menu = true;
        }
        else{
            cout << "Thanks for using TecFriends" << endl;
            menu = false;
        }
    }
    while(true){
        cout << "This are our current commands: " << endl;
        cout << "1.- Send a friend request to another user" << endl;
        cout << "2.- Check if a friend is a user" << endl;
        cout << "3.- Check your friends" << endl;
        cout << "4.- EXIT" << endl;
        cout << "Option: " ;
        cin >> options;
        if(options == 1){
            cout << "Write the name of the friend you want to request friendship: ";
            cin >> answerfriend;
            cout << "Your request has been sent" << endl;
            cout << answerfriend << " Do you want to accept " << username << "'s friend request [yes/no]: " << endl;
            cin >> answery;
            if(strcmp(answery,"yes") == 0){
                connection(username,answerfriend);
                cout << username << "!!! Congratulations !!! you are now friend's with " << answerfriend << endl;
            }
            else{
                cout << username << ", " << answerfriend << " did not accept your friend request, sorry" << endl; 
            }
        }
        else if(options == 2){
            cout << "Which user do you want to know if exists? " ;
            cin >> friends;
            if(find(friends)){
                cout << "Yes, that user exists" << endl;
            }
            else{
                cout << "Sorry, that user does not exists" << endl;
            }
        }
        else if(options == 3){
            cout << "Your friends are: ";
            printFriends(username);
            cout << endl;
        }
        else if(options == 4){
            cout << "Thanks for using TecFriends" << endl;
            break;
        }
        else{
            cout << "Please enter a valid command " << endl;
        }
    }
    
}

int main(int argc, char** argv) {
    
    addnode("TecFriends");
    addnode("Daniel");
    addnode("David");
    addnode("Fernando");
    addnode("Alejandro");
    addnode("JuanCarlos");
    connection("Daniel","David");
    connection("Daniel","Fernando");
    connection("Daniel","Alejandro");
    connection("Daniel","JuanCarlos");
    connection("David","Fernando");
    connection("David","Alejandro");
    connection("David","JuanCarlos");
    connection("Fernando","JuanCarlos");
    menu();//So that the program does not crash when you enter a name do not use space between words
    
    return 0;
}

