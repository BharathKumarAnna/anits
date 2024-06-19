package practice;

public class tumri_dog_touch {
	
    public static void main(String []args){
    int a[]=new int[501];

    for (int i=2;i<=500;i++){
        for (int j=2;j<=500;j++){
            if (j%i==0){
                if(a[j]==0){
                    
                    a[j]=1;
                }
                else if(a[j]==1){
                    a[j]=0;
                }
            }
        }
    }
    int c=0;
    System.out.println("door which are open");
    for (int i=1;i<=500;i++){
        if (a[i]==0){
            c+=1;
            System.out.println(i);
        }
    }     
    System.out.println("Count :"+c);

}


}
