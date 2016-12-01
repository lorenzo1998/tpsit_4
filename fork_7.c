/*chiedere in input un numero da 1 a 4, generare i processi e stampare il pid del padre e del figlio*/
#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<unistd.h>

main(){
    int n,i,pid=0;
    do{
       printf("inserire un numero da 1 a 4: ");
       scanf("%d",&n);
      }while((n<0)||(n>4));
      printf("sono il padre %d\n",getpid());
      for(i=0;i<n;i++){
         pid=fork();
         if(pid==0){
            // sleep(1); permette di generare tutti processi orfani perche il padre termina prima
             printf("sono il figlio: %d , mio padre è: %d \n", getpid(), getppid());
          }
      }
}
