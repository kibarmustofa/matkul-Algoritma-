package pertemuan5;

public class faktorial {
   public int nilai;

   int faktorialbf(int n){
    int fakto = 1;
    for(int i= 1; i <=n; i++){
        fakto = fakto * i;
    }
    return fakto;
   } 
   int faktorialdc(int n){
    if (n==1){
        return 1;
    }else{
        int fakto =n * faktorialdc(n-1);
        return fakto;
    }
   }
}