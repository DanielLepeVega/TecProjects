/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: yo_da
 *
 * Created on September 18, 2018, 6:49 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
//métodos push, pull y top que funcionan para un arreglo
void push(int array[], int value){ //método que introduce un valor al arreglo
    int len = sizeof(array)/sizeof(int); //tamaño del arreglo
    if(array[len-1]!=NULL){ //checa si hay algo en la última posición y si hay
        len--;              // algo entonces le restamos uno al len para que 
        push(array,value);  // cheque si está libre una posición a la izquierda
    }
    else{                   //cuando no haya nada en la última posición
        array[len-1]=value;   // introducirá el valor que le damos
    }
}
int l=0;//variable contadora que va restandose 1 para ir haciendo el arreglo más chico
void pull(int array[]){//método que retira el valor que se tiene hasta arriba del arreglo
    int len = sizeof(array)/sizeof(int);//tamaño del arreglo
    int j=1; //variable que sirve como index para recorregor el arreglo
    for(int i=0;i<len;i++){
        array[i]=array[j];
        j++;
    }
    int k=len - 1; //variable que sirve para ver el tamaño del arreglo y si es necesario irle restando para despúes recorrer el arreglo
    array[k+l]=NULL;
    l--;
}

int top(int array[]){//método que regresa el primer valor diferente de null del arreglo
    int len = sizeof(array)/sizeof(int);
    int index=0;
    if(array[index]!=NULL){
        return array[index];
    }
    else{
        index ++;
        top(array);
    }
}
//métodos con pointers para simular funciones de stack
int topPointers(int array[]){
    int *pntr=array;
    if(*pntr!=NULL){
        return *pntr;
    }
    else{
        *pntr++;
        topPointers(array);
    }
}

void pushPointers(int array[],int val){
    int *pntr=array;
    if(*pntr==NULL){
        *pntr=val;
    }
    else{
        *pntr++;
        topPointers(array);
    }
}

void pullPointers(int array[]){
    int *pntr=array;
    *pntr--;
}

void printArray(int array[]){
    int len = sizeof(array)/sizeof(int);
    for(int i=0;i<len;i++){
        printf(array[i] + ",");
    }
}

int main(int argc, char** argv) {

    int array[] = {1,2,3,4,5};
    int array1[] = {NULL,NULL,NULL};
    push(array1,1);
    printArray(array1);
    pull(array);
    printArray(array);
    printf(top(array));
    return (EXIT_SUCCESS);
}

