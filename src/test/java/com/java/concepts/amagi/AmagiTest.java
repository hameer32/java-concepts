package com.java.concepts.amagi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AmagiTest {
}
class TestClass1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int K = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A = 0; i_A < arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        int out_ = max_div(N, K, A);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int max_div(int N, int K, int[] A){
        // write your code here
        // [1111]->[1,2,3,4]
        int mod=(int)Math.pow(10,9)+7;
        int result = 0;
        int[] prefixSum=new int[N];
        for(int sum=0,i=0;i<N;i++){
            sum+=A[i];
            prefixSum[i]=sum;
        }
        int solution=1;
        int start=0;
        for(int i=start;i<N;i++){
            if(prefixSum[i]-prefixSum[start]+A[start]==K){
                int posibility=1;
                i++;
                for(;i<N-1;i++){
                    if(prefixSum[i-1]==prefixSum[i]){
                        posibility++;
                    }
                }
                solution*=posibility;
                start=i;
            }

        }
        if(solution==1){}
        return result=solution;

    }
}

class TestClass2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        int K = Integer.parseInt(br.readLine().trim());
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A = 0; i_A < arr_A.length; i_A++)
        {
            A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        int out_ = max_div(N, K, A);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int max_div(int N, int K, int[] A){
        // write your code here
        // [1111]->[1,2,3,4]
        int mod=(int)Math.pow(10,9)+7;
        int result = 0;
        int[] prefixSum=new int[N];
        for(int sum=0,i=0;i<N;i++){
            sum+=A[i];
            prefixSum[i]=sum;
        }
        int solution=1;
        int start=0;
        for(int i=start;i<N;i++){
            if(prefixSum[i]-prefixSum[start]+A[start]==K){
                int posibility=1;
                i++;
                for(;i<N-1;i++){
                    if(prefixSum[i-1]==prefixSum[i]){
                        posibility++;
                    } else break;
                }
                solution*=posibility;
                start=i;
            }
            if(i==N-1){
                if(prefixSum[i]-prefixSum[start]+A[start]==K){
                    continue;
                }
                else{
                    return 0;
                }
            }

        }
        if(solution==1){}
        return result=solution;

    }
}
