class M{public static void main(String[]a){
        int[]l={1};
        var m=1;
        while(m<21){
            int i=0;
            while(i<m){
                System.out.print(l[i++]+(i==m?"\n":" "));
            }
            int[]k=new int[m+1];
            i=0;
            k[i]=l[i++];
            for(;i<m;i++){
                k[i]=l[i]+l[i-1];
            }
            k[m]=1;
            l=k;
            m++;
        }
    }
}