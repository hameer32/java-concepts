package com.java.concepts.bosch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BoshTest {
}

class TestClass1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
                A[i_A] = Integer.parseInt(arr_A[i_A]);
            }
            String[] arr_B = br.readLine().split(" ");
            int[] B = new int[N];
            for(int i_B = 0; i_B < arr_B.length; i_B++)
            {
                B[i_B] = Integer.parseInt(arr_B[i_B]);
            }
            String[] arr_C = br.readLine().split(" ");
            int[] C = new int[N];
            for(int i_C = 0; i_C < arr_C.length; i_C++)
            {
                C[i_C] = Integer.parseInt(arr_C[i_C]);
            }

            long out_ = solve(N, A, B, C);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }
    static long solve(int N, int[] A, int[] B, int[] C){
        // Write your code here
        long result = 0;

        return result;

    }
}

class TestClass2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        long K = Long.parseLong(br.readLine().trim());
        int Q = Integer.parseInt(br.readLine().trim());
        String[] arr_L = br.readLine().split(" ");
        int[] L = new int[Q];
        for(int i_L = 0; i_L < arr_L.length; i_L++)
        {
         L[i_L] = Integer.parseInt(arr_L[i_L]);
        }
        String[] arr_R = br.readLine().split(" ");
        int[] R = new int[Q];
        for(int i_R = 0; i_R < arr_R.length; i_R++)
        {
         R[i_R] = Integer.parseInt(arr_R[i_R]);
        }
        String[] arr_A = br.readLine().split(" ");
        int[] A = new int[N];
        for(int i_A = 0; i_A < arr_A.length; i_A++)
        {
         A[i_A] = Integer.parseInt(arr_A[i_A]);
        }

        int[] out_ = solve(N, K, Q, L, R, A);
        System.out.print(out_[0]);
        for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
        {
         System.out.print(" " + out_[i_out_]);
        }

        wr.close();
        br.close();
    }
    static int[] solve(int N, long K, int Q, int[] L, int[] R, int[] A){
        // write your code here
        int[] prefixSum=new int[A.length];
        for(int sum=0,i=0;i<A.length;i++){
            sum+=A[i];
            prefixSum[i]=sum;
        }
        int[] result = new int[Q];
        for(int i=0;i<Q;i++){
            int res=0;
            int left=L[i]-1;
            int right=R[i]-1;
            int mean=0;
            for(int j=0;j<=(right-left);j++){
                // prefix sum array caluculation for q queries


                if(mean>=K){
                    res=j+1;
                    break;
                }
            }
            if(res==0){
                result[i]=-1;
            } else {
                result[i]=res;
            }
        }

        return result;

    }
}

