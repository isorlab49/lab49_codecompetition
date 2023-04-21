class M{public static void main(String[]a){
        int[][]l=new int[22][22];
        int m=-1;
        while(m++<20){
            int i=0;
            l[m][0]=1;
            while(i<m){
                System.out.print(l[m][i]+(i==m-1?"\n":" "));
                l[m+1][i+1]=l[m][i+1]+l[m][i++];
            }
        }
    }
}