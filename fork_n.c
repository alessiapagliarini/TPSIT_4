
/*Generare N processi tramite un ciclo for, per ogni processo stampare
  il pid del processo e il pid del padre*/

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<sys/types.h>
main(){
        int n,i;
        pid_t p;
        do{
                printf("Inserire valore da 1 a 4: ");
                scanf("%d",&n);
        }while((n<1)||(n>4));
        printf("Sono il padre: %d\n", getpid());
        for(i=0;i<n;i++){
                p=fork();
                if(p==0){
                        sleep(1);
                        printf("Sono il figlio: %d e mio padre  %d\n", getpid(), getppid());
                }
        }
}
